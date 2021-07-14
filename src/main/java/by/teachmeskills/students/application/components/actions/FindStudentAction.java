package by.teachmeskills.students.application.components.actions;

import by.teachmeskills.students.application.utils.Input;

public class FindStudentAction extends BaseAction implements Action{
    @Override
    public void apply() {
        String lastName = Input.getString("Введите фамилию студента");
        System.out.println(controller.findStudent(lastName));
    }
}
