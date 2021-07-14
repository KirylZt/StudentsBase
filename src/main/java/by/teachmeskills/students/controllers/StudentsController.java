package by.teachmeskills.students.controllers;

import by.teachmeskills.students.entity.Student;
import by.teachmeskills.students.exceptions.DuplicateStudentException;

import java.util.List;

public interface StudentsController {

    void addStudent(Student student) throws DuplicateStudentException;

    List<Student> getStudents();

    void updateStudent(Student student);

    void deleteStudent(int studentNumber);

    Student findStudent(String lastName);

    void ageFilter(int age);
}
