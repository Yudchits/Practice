package by.yudchits.uiip.crud_service.controller;

import by.yudchits.uiip.crud_service.entity.Student;
import by.yudchits.uiip.crud_service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private StudentService service;

    @RequestMapping("/")
    public String showAllStudents(Model model) {
        List<Student> students = service.findAllStudents();

        model.addAttribute("students", students);

        return "all-students-view";
    }

    @RequestMapping("/add-student")
    public String addStudent(Model model) {

        model.addAttribute("student", new Student());

        return "add-update-student-view";
    }

    @RequestMapping("/save-update-student")
    public String saveStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
        List<Student> students = service.findAllStudents();

        for (Student st : students) {
            if(st.getEmail().equals(student.getEmail())){
                bindingResult.rejectValue("email", "error.email", "Such mail already exists");
            }
        }

        if (bindingResult.hasErrors()) {
            return "add-update-student-view";

        } else {
            service.saveOrUpdateStudent(student);

            return "redirect:/";
        }
    }

    @RequestMapping("/update-details")
    public String updateStudent(@RequestParam("id") long id, Model model) {
        Student student = service.findById(id);

        model.addAttribute("student", student);

        return "add-update-student-view";
    }

    @RequestMapping("/delete-student")
    public String deleteStudent(@RequestParam("id") long id) {
        Student student = service.findById(id);

        service.deleteStudent(student);

        return "redirect:/";
    }
}
