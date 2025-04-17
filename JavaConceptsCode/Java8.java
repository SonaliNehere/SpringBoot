import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@FunctionalInterface
interface MyFunctionalInterface {
    void execute();
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method implementation");
    }
}

public class Java8 {

	// Without optional
//	public String getInsuranceName(Person person) {
//	    if (person != null) {
//	        Car car = person.getCar();
//	        if (car != null) {
//	            Insurance insurance = car.getInsurance();
//	            if (insurance != null) {
//	                return insurance.getName();
//	            }
//	        }
//	    }
//	    return "Unknown";
//	}

	// With Optional
//	public String getInsuranceName(Person person) {
//	    return Optional.ofNullable(person)
//	                   .map(Person::getCar)
//	                   .map(Car::getInsurance)
//	                   .map(Insurance::getName)
//	                   .orElse("Unknown");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Lambda
//		List<String> names = Arrays.asList("Peter", "Paul", "Mary");
//		names.forEach(name -> System.out.println(name));

//		Runnable runnable = () -> System.out.println("Thread is running");
//		new Thread(runnable).start();
//		
//		MathOperation addition = (a, b) -> a + b;
//		MathOperation multiplication = (a, b) -> a * b;
//
//		System.out.println("Addition: " + addition.operate(5, 3)); // Output: 8
//		System.out.println("Multiplication: " + multiplication.operate(5, 3)); // Output: 15
//		
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//		List<Integer> squaredNumbers = numbers.stream()
//		                                      .map(n -> n * n)
//		                                      .collect(Collectors.toList());
//		System.out.println(squaredNumbers); // Output: [1, 4, 9, 16, 25]
		
//		stream api
//		List<String> names = Arrays.asList("Peter", "Paul", "Mary");
//		List<String> filteredNames = names.stream()
//		                                   .filter(name -> name.startsWith("P"))
//		                                   .collect(Collectors.toList());
		
		  // Create a Nashorn script engine
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

        // JavaScript code as a string
        String script = "var greeting = 'Hello, Nashorn!'; greeting";

        // Execute the script
        try {
            Object result = engine.eval(script);
            System.out.println(result); // Output: Hello, Nashorn!
        } catch (ScriptException e) {
            e.printStackTrace();
        }
		
		
	}

}
