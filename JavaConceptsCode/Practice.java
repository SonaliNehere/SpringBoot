import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

class CustomCheckedException extends Exception {
	// Constructor that accepts a message
	public CustomCheckedException(String message) {
		super(message);
	}

	// Constructor that accepts a message and a cause
	public CustomCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	// Constructor that accepts a cause
	public CustomCheckedException(Throwable cause) {
		super(cause);
	}
}

class CustomUncheckedException extends RuntimeException {
	// Constructor that accepts a message
	public CustomUncheckedException(String message) {
		super(message);
	}

	// Constructor that accepts a message and a cause
	public CustomUncheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	// Constructor that accepts a cause
	public CustomUncheckedException(Throwable cause) {
		super(cause);
	}
}

//Inner Class Example
class OuterClass {
	private int outerField = 10;

	class InnerClass {
		void display() {
			System.out.println("Outer field: " + outerField);
		}
	}

	private static int staticOuterField = 20;

	static class StaticNestedClass {
		void display() {
			System.out.println("Static outer field: " + staticOuterField);
		}
	}
}

//Custom Classes:
//When you create your own classes, you can override equals() to define what it means for two instances of your class to be "equal".
class MyClass {
	int value;

	MyClass(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		MyClass myClass = (MyClass) obj;
		return value == myClass.value;
	}
}

//Example of Static Method Hiding
class Parent {
	public static void staticMethod() {
		System.out.println("Static method in Parent class");
	}

	public void instanceMethod() {
		System.out.println("Instance method in Parent class");
	}
}

class Child extends Parent {
	// This hides the static method in Parent, it does not override it
	public static void staticMethod() {
		System.out.println("Static method in Child class");
	}

	// This overrides the instance method in Parent
	@Override
	public void instanceMethod() {
		System.out.println("Instance method in Child class");
	}
}

public class Practice {

	public static void validateAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}
		// Other validation logic
	}

	static String readFirstLineFromFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	public static void printNumbers(int... numbers) {
		System.out.println("Printing numbers:");
		for (int num : numbers) {
			System.out.println(num);
		}
	}

	public enum Color {
		RED, GREEN, BLUE;
	}

	public static void main(String[] args) {

//		How to use try-with-resources in Java?
//		try (FileReader fileReader = new FileReader("C:\\Sonali_Data\\eclipse_workspace\\Dummy\\src\\example.txt")) {
//			// Code that reads from the file
//			int data = fileReader.read();
//			while (data != -1) {
//				System.out.print((char) data);
//				data = fileReader.read();
//			}
//		} catch (IOException e) {
//			// Exception handling
//			e.printStackTrace();
//		}

//		Use of the Throw and Throws Keywords?
//		validateAge(20);

		// How can you create a custom exception in Java?
		// example of creating a custom checked exception
		// Define the custom exception
//		CustomCheckedException ce = new CustomCheckedException("Checked Exceptions ");

		// example of creating a custom unchecked exception
		// Define the custom exception
//		CustomUncheckedException ce1 = new CustomUncheckedException("Unchecked Exceptions ");

//		try-with-resources:
//		try {
//			System.out.println(readFirstLineFromFile("C:\\Sonali_Data\\eclipse_workspace\\Dummy\\src\\example.txt"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		Inner Class Example
//		OuterClass outer = new OuterClass();
//        OuterClass.InnerClass inner = outer.new InnerClass();
//        inner.display(); // Output: Outer field: 10

//		Static Nested Class Example:
//		OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
//        nested.display(); // Output: Static outer field: 20

//		Custom Classes:
//			When you create your own classes, you can override equals() to define what it means for two instances of your class to be "equal".
//		MyClass obj1 = new MyClass(10);
//		MyClass obj2 = new MyClass(10);
//		System.out.println(obj1.equals(obj2)); // Output: true (values are the same)

//		Use Cases for Anonymous Classes
//		1. Event Handling:
//		 JFrame frame = new JFrame("Anonymous Class Example");
//	        JButton button = new JButton("Click Me");
//
//	        button.addActionListener(new ActionListener() {
//	            public void actionPerformed(ActionEvent e) {
//	                System.out.println("Button was clicked!");
//	            }
//	        });
//
//	        frame.add(button);
//	        frame.setSize(300, 200);
//	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	        frame.setVisible(true);

//		2. Thread Creation:
//			Simplifies thread creation without defining a separate class.

//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Thread is running");
//			}
//		}).start();

//		3.Customizing Behavior:
//			Allows for quick customization of existing classes or interfaces.
//		List<String> list = new ArrayList<String>() {
//			@Override
//			public boolean add(String s) {
//				System.out.println("Adding element: " + s);
//				return super.add(s);
//			}
//		};
//
//		list.add("Hello");
//		list.add("World");

//		var args
//		printNumbers(1, 2, 3, 4, 5);
//		printNumbers(); // Calling with no arguments

//		How to Compare Two Enum Values?
//		Color color1 = Color.RED;
//        Color color2 = Color.RED;
//        Color color3 = Color.GREEN;
//
//        if (color1 == color2) {
//            System.out.println("color1 and color2 are the same");
//        } else {
//            System.out.println("color1 and color2 are different");
//        }
//
//        if (color1 == color3) {
//            System.out.println("color1 and color3 are the same");
//        } else {
//            System.out.println("color1 and color3 are different");
//        }

//		Example of Static Method Hiding
		Parent parent = new Parent();
		Parent childAsParent = new Child();
		Child child = new Child();

		parent.staticMethod(); // Output: Static method in Parent class
		childAsParent.staticMethod(); // Output: Static method in Parent class
		child.staticMethod(); // Output: Static method in Child class

		parent.instanceMethod(); // Output: Instance method in Parent class
		childAsParent.instanceMethod(); // Output: Instance method in Child class
		child.instanceMethod(); // Output: Instance method in Child class

	}

}
