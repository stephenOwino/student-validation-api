package com.example.student_management_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApiApplication.class, args);


		/*Your Challenge: The Student System 🧑‍🎓You are building a system to manage students in a school.
		 Each student has a unique Student ID (String) and a GPA (double).Your boss wants a rule:
		  No student can be added to the system if their GPA is lower than 2.0.Task 1:
		   Create the ModelCreate a Student class with three fields:String idString namedouble gpaTask 2:
		   Create the RepositoryCreate a StudentRepository class.
		   Use an in-memory ConcurrentHashMap to save and find students by their string id.Hint:
		   You don't need an AtomicLong counter here because Student IDs are Strings (like "S101")
		   sent by the user!Task 3: Create the ServiceCreate a StudentService class and inject your repository.
		   Write a saveStudent(Student student) method that applies the rule:If student.getGpa() < 2.0,
		   throw a IllegalArgumentException with the message "GPA too low!".Otherwise,
		   save and return the student.Task 4: Write the Unit TestCreate a StudentServiceTest file.
		   Write one single test using Mockito:Test that when you try to save a student with a 1.5 GPA,
		   the service successfully throws the exception.
		 */
	}

}
