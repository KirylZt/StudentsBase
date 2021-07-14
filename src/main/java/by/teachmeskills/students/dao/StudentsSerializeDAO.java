package by.teachmeskills.students.dao;

import by.teachmeskills.students.entity.Student;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentsSerializeDAO implements studentsDAO{
    private static final String FILE_PATH = "students.bin";

    @Override
    public void addStudent(Student student) {
        List<Student> students = getStudents();
        students.add(student);
        save(students);
    }

    @Override
    public List<Student> getStudents() {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Student>) inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public void updateStudent(Student student) {
        List<Student> students = getStudents();
        int index = students.indexOf(student);
        if (index != -1){
            students.set(index,student);
            save(students);
        }
    }

    @Override
    public void deleteStudent(int studentNumber) {
        List<Student> students = getStudents();
        students.remove(new Student(studentNumber));
        save(students);
    }

    @Override
    public Student findStudent(String lastName) {
        List<Student> students = getStudents();
        for (Student student:students){
            if (student.getLastName().equals(lastName)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void ageFilter(int age) {
        List<Student> students = getStudents();
        LocalDate today = LocalDate.now();
        students.stream().filter(x ->x.getAge().isBefore(LocalDate.of(today.getYear()-age,today.getMonth(),today.getDayOfMonth()))).forEach(System.out::println);
    }

    private void save(List<Student> students){
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            outputStream.writeObject(students);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
