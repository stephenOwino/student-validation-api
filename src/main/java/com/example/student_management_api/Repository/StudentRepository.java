package com.example.student_management_api.Repository;

import com.example.student_management_api.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class StudentRepository {

    private final Map<String , Student> students = new ConcurrentHashMap<>();


    public List<Student> findAll(){
        return new ArrayList<>(students.values());
    }

    public Student save(Student student){
        Student savedStudent = new Student(student.getId(), student.getName(),student.getGPA());
        students.put(savedStudent.getId(), savedStudent);
        return savedStudent;
    }
    public Optional<Student> findById(String id){
        return Optional.ofNullable(students.get(id));
    }

}

