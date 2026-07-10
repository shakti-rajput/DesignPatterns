package CreationalPatterns.AbstractFactory;

public class AndroidDeveloper implements Employee {
    public int salary()
    {
        System.out.println("Getting android developer salary");
        return 50000;
    }

    @Override
    public int name() {
        System.out.println("I am an android Developer");
        return 0;
    }

}
