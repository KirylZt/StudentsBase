package by.teachmeskills.students.application.components.actions;

import by.teachmeskills.students.application.utils.Input;

public class AgeFilterAction extends BaseAction implements Action{
    @Override
    public void apply() {
        int age = Input.getInt("Введите возраст: ");
        controller.ageFilter(age);
    }
}
