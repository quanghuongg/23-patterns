import component.EmployeeComponent;
import concomponent.EmployeeConcreteComponent;
import concretedecorator.Manager;

public class DecoratorMain {
    public static void main(String[] args) {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee = new EmployeeConcreteComponent("GPCoder");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("\nTEAM Manager: ");
        EmployeeComponent teamLeader = new Manager(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

    }
}
