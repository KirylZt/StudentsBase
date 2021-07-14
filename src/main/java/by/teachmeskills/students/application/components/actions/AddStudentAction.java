package by.teachmeskills.students.application.components.actions;

import by.teachmeskills.students.entity.Student;
import by.teachmeskills.students.exceptions.DuplicateStudentException;

public class AddStudentAction extends BaseAction implements Action{
    @Override
    public void apply() {
        Student student = createStudent();
        try {
            controller.addStudent(student);
        } catch (DuplicateStudentException e) {
            System.out.println(e.getMessage());
        }
    }
}
