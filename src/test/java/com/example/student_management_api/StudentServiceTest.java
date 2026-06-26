package com.example.student_management_api;

import com.example.student_management_api.Repository.StudentRepository;
import com.example.student_management_api.Service.StudentService;
import com.example.student_management_api.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;


    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void saveStudent_ShouldThrowException_WhenGpaIsTooLow() {
        // 1. ARRANGE: Create our test data with an invalid GPA (1.5)
        Student failingStudent = new Student("S101", "Stephen", 1.5);

        // 2. ACT & ASSERT: Tell JUnit we EXPECT an IllegalArgumentException to happen
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            // We trigger the method here
            studentService.saveStudent(failingStudent);
        });

        // 3. ASSERT: Verify the error message inside the exception matches exactly
        assertEquals("GPA too low!", exception.getMessage());
    }

}
