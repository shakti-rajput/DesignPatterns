package CreationalPatterns.AbstractFactory;

public class WebDeveloper implements Employee {

    public int salary() {
        System.out.println("Getting web developer salary");
        return 40000;
    }

    @Override
    public int name() {
        System.out.println("I am an WEB Developer");
        return 0;
    }
}
