package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentservice;

    @Autowired
    public StudentController(StudentService studentservice) {
        this.studentservice = studentservice;

    }

    @GetMapping
    public List<Student> get_Student() {

        return studentservice.get_Student();
    }
    @PostMapping
    public void register(@RequestBody  Student student){

         studentservice.addNewStudent(student);
    }

}
