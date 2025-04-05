package src;

class Person {
	// Private data members
	private String name;
	private int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Public method to access private data
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}
}

class Animal {
	public void eat() {
		System.out.println("This animal eats food.");
	}

	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("The dog barks.");
	}

	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

//Think of an ATM machine.
//You interact with it to withdraw money,
//check your balance, etc.,
//without needing to know how it processes
//transactions internally.
abstract class ATM {
	abstract void withdrawMoney();

	abstract void checkBalance();
}

class MyATM extends ATM {
	@Override
	void withdrawMoney() {
		System.out.println("Money withdrawn.");
	}

	@Override
	void checkBalance() {
		System.out.println("Balance checked.");
	}
}

public class Demo1 {

	enum DayOfWeek {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String formattedString = String.format("Hello, %s! Welcome to %s.", "Friend", "HungryCoders.com");
//		System.out.println(formattedString); // Hello, Friend! Welcome to HungryCoders.com.

//		enum
//		 // Using enum constants
//        DayOfWeek today = DayOfWeek.MONDAY;
//        System.out.println("Today is: " + today);
//
//        // Switch statement with enum
//        switch (today) {
//            case MONDAY:
//                System.out.println("It's the start of the week.");
//                break;
//            case FRIDAY:
//                System.out.println("TGIF!");
//                break;
//            default:
//                System.out.println("Just another day.");
//        }
//
//        // Iterating over enum constants
//        System.out.println("Days of the week:");
//        for (DayOfWeek day : DayOfWeek.values()) {
//            System.out.println(day);
//        }

//		int num = 10; // Primitive type
//		Integer obj = Integer.valueOf(num); // Primitive to Wrapper (Boxing)
//		int value = obj.intValue(); // Wrapper to Primitive (Unboxing)
//		
		// Primitive type
//        int num = 5;
//        Integer obj = num; // Autoboxing
//
//        // Using utility method
//        String str = obj.toString(); // Converts Integer to String
//
//        // Unboxing
//        int value = obj; // Auto-unboxing
//        System.out.println("Primitive: " + value);

//		Encapsulation
//		 //Think of a capsule as a person.
//        // The person's name and age are private information,
//        // and they have methods to get or update this information safely.
//        Person person = new Person("John", 30);
//        System.out.println("Name: " + person.getName());
//        System.out.println("Age: " + person.getAge());
//
//        person.setAge(35); // updating age
//        System.out.println("Updated Age: " + person.getAge());

//		inheritance
//		Dog dog = new Dog();
//		dog.eat(); // inherited method
//		dog.bark(); // specific to Dog class

		// Runtime Polymorphism
//		Animal animal = new Dog(); // Upcasting
//		animal.sound(); // Calls Dog's overridden method

//		abstraction
		ATM atm = new MyATM();
		atm.withdrawMoney(); // Outputs: Money withdrawn.
		atm.checkBalance(); // Outputs: Balance checked.

	}

}
