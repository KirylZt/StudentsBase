package by.teachmeskills.students.dao;

import by.teachmeskills.students.entity.Student;

import java.util.List;

public interface studentsDAO {
    void addStudent(Student student);

    List<Student> getStudents();

    void updateStudent(Student student);

    void deleteStudent(int studentNumber);

    Student findStudent(String lastName);

    void ageFilter(int age);
}
