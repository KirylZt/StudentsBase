package by.teachmeskills.students.exceptions;

public class DuplicateStudentException extends Exception{
    private int studentNumber;

    public DuplicateStudentException(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String getMessage() {
        return String.format("Номер студенческого %s уже зарегестрирован", studentNumber);
    }
}
