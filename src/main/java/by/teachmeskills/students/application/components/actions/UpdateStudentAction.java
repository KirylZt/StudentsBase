package by.teachmeskills.students.application.components.actions;

import by.teachmeskills.students.entity.Student;

public class UpdateStudentAction extends BaseAction implements Action{
    @Override
    public void apply() {
        Student student = createStudent();
        controller.updateStudent(student);
    }
}
