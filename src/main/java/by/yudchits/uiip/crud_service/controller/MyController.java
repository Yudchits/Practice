package by.yudchits.uiip.crud_service.controller;

import by.yudchits.uiip.crud_service.entity.Student;
import by.yudchits.uiip.crud_service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private StudentService service;

    @RequestMapping("/")
    public String showAllStudents(Model model){
        List<Student> students = service.findAllStudents();

        model.addAttribute("students", students);

        return "all-students-view";
    }

    @RequestMapping("/add-student")
    public String addStudent(Model model){

        model.addAttribute("student", new Student());

        return "add-update-student-view";
    }

    @RequestMapping("/save-update-student")
    public String saveStudent(@ModelAttribute("student") Student student){
        service.saveOrUpdateStudent(student);

        return "redirect:/";
    }
}
