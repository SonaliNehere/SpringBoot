package src;

import java.util.*;

class Student1 {
    private String name;
    private int grade;

    public Student1(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}

class NameComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getName().compareTo(s2.getName()); // Custom order by name
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("Alice", 85));
        students.add(new Student1("Bob", 90));
        students.add(new Student1("Charlie", 80));

        Collections.sort(students, new NameComparator()); // Sort using custom comparator

        for (Student1 student : students) {
            System.out.println(student);
        }
      // Output
      // Alice: 85
      // Bob: 90
      // Charlie: 80

        // Using a lambda expression for custom sorting by grade in descending order
        Collections.sort(students, (s1, s2) -> Integer.compare(s2.getGrade(), s1.getGrade()));
        System.out.println("Sorted by grade (desc): " + students);

     // Output
      // Bob: 90
      // Alice: 85
      // Charlie: 80
        
        
      
    }
}