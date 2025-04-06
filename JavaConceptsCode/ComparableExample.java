package src;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
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
    public int compareTo(Student other) {
        return Integer.compare(this.grade, other.grade); // Natural order by grade
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 80));

        Collections.sort(students); // Sort using natural order defined in compareTo

        for (Student student : students) {
            System.out.println(student);
        }
      // Output
      // Charlie: 80
      // Alice: 85
      // Bob: 90
    }
}