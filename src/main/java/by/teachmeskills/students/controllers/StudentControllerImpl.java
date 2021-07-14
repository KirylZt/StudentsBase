package by.teachmeskills.students.controllers;

import by.teachmeskills.students.dao.StudentsSerializeDAO;
import by.teachmeskills.students.dao.studentsDAO;
import by.teachmeskills.students.entity.Student;
import by.teachmeskills.students.exceptions.DuplicateStudentException;

import java.util.List;

public class StudentControllerImpl implements StudentsController{
    private studentsDAO dao = new StudentsSerializeDAO();

    @Override
    public void addStudent(Student student) throws DuplicateStudentException {
        if(dao.getStudents().contains(student)){
            throw new DuplicateStudentException(student.getStudentNumber());
        }
        dao.addStudent(student);
    }

    @Override
    public List<Student> getStudents() {
        return dao.getStudents();
    }

    @Override
    public void updateStudent(Student student) {
        dao.updateStudent(student);
    }

    @Override
    public void deleteStudent(int studentNumber) {
        dao.deleteStudent(studentNumber);
    }

    @Override
    public Student findStudent(String lastName) {
        return dao.findStudent(lastName);
    }

    @Override
    public void ageFilter(int age) {
        dao.ageFilter(age);
    }
}
