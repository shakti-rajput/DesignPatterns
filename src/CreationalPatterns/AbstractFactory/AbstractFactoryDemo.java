package CreationalPatterns.AbstractFactory;

public class AbstractFactoryDemo {
    public void run()
    {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.salary();
        e1.name();
        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        e2.salary();
        e2.name();
        Employee e3 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        e3.salary();
        e3.name();
    }
}
