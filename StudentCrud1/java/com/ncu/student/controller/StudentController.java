package com.ncu.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ncu.student.dao.StudentDao;
import com.ncu.student.models.Student;

@Controller
public class StudentController {
	@Autowired
    private StudentDao studentDAO;
	
	@RequestMapping("/")
	   public String index() {
		 
		   return "index";
	   }

    @RequestMapping(value = "/student", method=RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student student, Model model)
    {
        try
        {
            if(studentDAO.getStudentById(student.getId())!=null);
            studentDAO.updateStudent(student);
        }
        catch(EmptyResultDataAccessException e)
        {
            System.out.println("inside catch");
            studentDAO.saveStudent(student);
        }
        return ("redirect:/students");
    }
    
    @RequestMapping(value = "/edit/{id}")
    public String editStudent(@PathVariable("id") String id,@ModelAttribute("student") Student student, Model model)
    {
       
      
    	studentDAO.getStudentById(id);
        List<Student> studentList = studentDAO.getAllStudents();
        System.out.println("studentList "+ studentList);
        model.addAttribute("student",student);        
        model.addAttribute("studentList",studentList);
        
        return "student";
    }
    
    @RequestMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable("id") String id, @ModelAttribute("student") Student student, Model model)
    {
    	studentDAO.deleteStudent(id);
        
        return ("redirect:/students");
    }

    @RequestMapping(value = "/students")
    public String listStudents(@ModelAttribute("student") Student student, Model model)
    {
//        Model model = new Model("employees");

        List<Student> studentList = studentDAO.getAllStudents();
        System.out.println(studentList);
        model.addAttribute("studentList", studentList);
        
        return "student";
    }
}

