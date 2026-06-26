# Student Validation API

A simple Spring Boot REST API for managing student profiles and records. This application stores all data completely in-memory using thread-safe collections and implements strict validation rules for student records.

## Features
- **In-Memory Storage**: Uses a `ConcurrentHashMap` to safely manage student records across multiple concurrent requests without needing an external database setup.
- **Layered Architecture**: Organized strictly around the Controller -> Service -> Repository architectural pattern.
- **GPA Validation**: Automatically blocks records from being created or updated if the student's GPA falls below the 2.0 threshold.
- **Unit Tests**: Includes standalone Mockito unit tests to isolate and verify the service's GPA business logic.

## Requirements
- Java 25 or 26
- Maven

## How to Run the App
Clone this repository and boot up the server using your terminal:
```bash
mvn spring-boot:run
```
The application will start listening on `http://localhost:8080`.

## API Endpoints

### 1. Get All Students
- **URL:** `/api/students`
- **Method:** `GET`
- **Response:** `200 OK` (Returns a JSON array of all active students)

### 2. Create a Student
- **URL:** `/api/students`
- **Method:** `POST`
- **Headers:** `Content-Type: application/json`
- **Body:**
```json
{
  "id": "S101",
  "name": "Stephen",
  "gpa": 3.8
}
```
- **Response:** `200 OK` (Returns the newly created student record)

### 3. Update a Student
- **URL:** `/api/students`
- **Method:** `PUT`
- **Headers:** `Content-Type: application/json`
- **Body:**
```json
{
  "id": "S101",
  "name": "Stephen",
  "gpa": 3.9
}
```
- **Response:** `200 OK` (Fails with a 400 bad request if the student ID does not exist)

### 4. Delete a Student
- **URL:** `/api/students/{id}`
- **Method:** `DELETE`
- **Response:** `200 OK` (Fails with a 500 error if the student ID is not found)

## How to Run Tests
To execute the Mockito unit tests, run:
```bash
mvn test
```
