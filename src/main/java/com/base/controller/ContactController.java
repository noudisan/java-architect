package com.base.controller;

import com.mysql.jdbc.StringUtils;
import com.base.form.ContactForm;
import com.base.dto.ContactDto;
import com.base.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    //http://localhost:8080/contact/show?name=heyi&password=heyi
    @RequestMapping(value = "show")
    public String showContact(String name,String password){
        if("heyi".equals(name) && "heyi".equals(password)){
            return "ftpm/contactList";
        }
        return "";
    }

    @RequestMapping(value = "list")
    @ResponseBody
    public List<ContactDto> list(){
        List<ContactDto> result =contactService.list();

        return result;
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(ContactForm contactForm){
        try{
            ContactDto contactDto = new ContactDto();
            contactDto.setFullName(contactForm.getFullName());
            if(!StringUtils.isNullOrEmpty(contactForm.getPhoneOrEmail())){
                if(contactForm.getPhoneOrEmail().contains("@")){
                    contactDto.setEmail(contactForm.getPhoneOrEmail());
                }else {
                    contactDto.setPhone(contactForm.getPhoneOrEmail());
                }
            }
            contactDto.setSubject(contactForm.getSubject());
            contactDto.setMessage(contactForm.getMessage());
            contactDto.setCreateDate(new Date());
            contactService.save(contactDto);
            return "redirect:/index";
        }catch (Exception e){
            return "redirect:/index";
        }


    }

}
