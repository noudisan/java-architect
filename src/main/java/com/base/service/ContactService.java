package com.base.service;

import com.base.dao.ContactMapper;
import com.base.dto.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by noudisan on 2014/11/4.
 */
@Service
public class ContactService {
    @Autowired
    private ContactMapper contactMapper;

    public void save(ContactDto contactDto) {
        contactMapper.save(contactDto);
    }

    public List<ContactDto> list() {

        return  contactMapper.list();
    }
}
