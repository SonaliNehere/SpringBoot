
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void displayName() {
        System.out.println
                ("Private Method Invoked to display Company Name: " + name);
    }

}

public class ReflectionExample {

    // Using reflection to set a private field and invoke a private method
    public static void main(String[] args) throws Exception{

        // Create an instance of Company
        Company company = new Company("Youtube");
        System.out.println("Company Name: " + company.getName());

        // Change the name from Youtube to Ytube
        Field nameField = Company.class.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(company,"Ytube");
        System.out.println(company.getName());

        // Invoke the private method 'displayName'
        Method objMethod = Company.class.getDeclaredMethod("displayName");
        objMethod.setAccessible(true);
        objMethod.invoke(company);



    }
}