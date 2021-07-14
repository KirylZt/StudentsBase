package by.teachmeskills.students.application.components.actions;

import by.teachmeskills.students.exceptions.StopApplicationException;

public class StopApplicationAction implements Action{
    @Override
    public void apply() {
        throw new StopApplicationException();
    }
}
