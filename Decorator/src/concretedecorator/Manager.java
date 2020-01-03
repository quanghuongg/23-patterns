package concretedecorator;

import component.EmployeeComponent;
import decorator.EmployeeDecorator;


public class Manager extends EmployeeDecorator {
    public Manager(EmployeeComponent employee) {
        super(employee);
    }

    @Override
    public void doTask() {
        employee.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }

    public void createRequirement() {
        System.out.println(this.employee.getName() + " is create requirements.");
    }

    public void assignTask() {
        System.out.println(this.employee.getName() + " is assigning tasks.");
    }

    public void manageProgress() {
        System.out.println(this.employee.getName() + " is managing the progress.");
    }

}
