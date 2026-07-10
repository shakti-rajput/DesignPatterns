package CreationalPatterns.FactoryPattern;

public class EmployeeFactory {
    public static Employee getEmployee(String empType)
    {

        if(empType == null)
        {
            return null;
        }

        if(empType.equals("ANDROID"))
        {
            return new AndroidDeveloper();
        }

        else if(empType.equals("WEB"))
        {
            return new WebDeveloper();
        }

        return null;
    }
}
