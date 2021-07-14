package by.teachmeskills.students.application.components.actions;

import by.teachmeskills.students.application.utils.Input;

public class DeleteStudentAction extends BaseAction implements Action{
    @Override
    public void apply() {
        int studentNumber = Input.getInt("Введите номер студенческого: ");
        controller.deleteStudent(studentNumber);
    }
}
