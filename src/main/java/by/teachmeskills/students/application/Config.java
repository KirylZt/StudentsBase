package by.teachmeskills.students.application;

import by.teachmeskills.students.application.components.Button;
import by.teachmeskills.students.application.components.actions.*;

import java.util.HashMap;
import java.util.Map;

public class Config {
    public static final Map<Integer, Button> BUTTONS = new HashMap<>();

    static {
        BUTTONS.put(1, new Button("Добавить студента", new AddStudentAction()));
        BUTTONS.put(2, new Button("Вывод всех студентов", new ShowStudentAction()));
        BUTTONS.put(3, new Button("Редактирование данных студента", new UpdateStudentAction()));
        BUTTONS.put(4, new Button("Удаление студента из базы", new DeleteStudentAction()));
        BUTTONS.put(5, new Button("Поиск студента по фамилии", new FindStudentAction()));
        BUTTONS.put(6, new Button("Вывод студентов определённого возраста", new AgeFilterAction()));
        BUTTONS.put(9, new Button("Выход", new StopApplicationAction()));
    }

}
