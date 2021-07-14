package by.teachmeskills.students.application.components.actions;

public class ShowStudentAction extends BaseAction implements Action {
    @Override
    public void apply() {
        System.out.println("==============");
        controller.getStudents().forEach(System.out::println);
        System.out.println("==============");
    }
}
