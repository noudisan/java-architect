package com.ztt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	/*@Autowired
	private StudentMapper studentMapper;
	
	@RequestMapping(value = "get/{stuId}", method = RequestMethod.GET)
	@ResponseBody
	public String get(@PathVariable("stuId")String stuId) {
		String aa = "hello : "+studentMapper.getStudent(stuId).getStudentName();
		return aa;
	}
	
	@RequestMapping(value = "hello/{stuId}", method = RequestMethod.GET)
	public String hello(@PathVariable("stuId")String stuId,Model model) {
		String name = studentMapper.getStudent(stuId).getStudentName();
		model.addAttribute("name", name);
		return "hello";
	}*/
	
}
