package maciej.grochowski.jsoncrudrest.controller;

import maciej.grochowski.jsoncrudrest.model.Student;
import maciej.grochowski.jsoncrudrest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/regular")
@RestController
public class StudentControllerRegular {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
}
