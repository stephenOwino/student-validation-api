package com.example.student_management_api.Service;

import com.example.student_management_api.Repository.StudentRepository;
import com.example.student_management_api.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }
    public Student saveStudent(Student student){
        if (student.getGPA() < 2.0 ) {
            throw new IllegalArgumentException("GPA too low!");
        }else {
            return repository.save(student);
        }
    }
    // Inside your StudentService.java, add this method:
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

}
