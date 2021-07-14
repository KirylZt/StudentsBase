package by.teachmeskills.students.application.components.actions;

import by.teachmeskills.students.application.utils.Input;
import by.teachmeskills.students.controllers.StudentControllerImpl;
import by.teachmeskills.students.controllers.StudentsController;
import by.teachmeskills.students.entity.Student;

import java.time.DateTimeException;
import java.time.LocalDate;


public abstract class BaseAction {
    protected StudentsController controller = new StudentControllerImpl();

    protected Student createStudent(){
        int studentNumber = Input.getInt("Введите номер студенческого: ");
        String name = Input.getString("Введите имя судента: ");
        String lastName = Input.getString("Введите фамилию студента: ");
        LocalDate birthDay = birthDayDate();
        return new Student(studentNumber,name,lastName,birthDay);

    }

    protected LocalDate birthDayDate(){
        System.out.println("Далее введите дату рождения студента в формате:");
        try {
            int day = Input.getInt("Число: ");
            int month = Input.getInt("Месяц: ");
            int year = Input.getInt("Год рождения: ");
            LocalDate birthDayDate = LocalDate.of(year, month, day);
            return birthDayDate;
        }catch (DateTimeException e){
            System.out.println("Дата введена некорректно!!! Повторите попытку:");
            return birthDayDate();
        }
    }
}
