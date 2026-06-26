package com.example.student_management_api.controller;


import com.example.student_management_api.Service.StudentService;
import com.example.student_management_api.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student>getAllStudents(){
        return studentService.getAllStudents();

    }
    @PostMapping
    public Student saveStudent(@RequestBody Student student){
       return studentService.saveStudent(student);
    }
    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);

    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id){
        studentService.deleteStudent(id);
    }
}
