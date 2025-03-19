import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private double marks;

    // Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 82),
            new Student("Bob", 65),
            new Student("Charlie", 90),
            new Student("David", 74),
            new Student("Eve", 88)
        );

        // Filter students scoring above 75%, sort by marks in descending order
        List<Student> topStudents = students.stream()
            .filter(s -> s.getMarks() > 75)  // Filter students with marks > 75
            .sorted(Comparator.comparingDouble(Student::getMarks).reversed()) // Sort in descending order
            .collect(Collectors.toList());

        // Display the result beautifully
        System.out.println(" Top Performing Students  ");
        System.out.println(" Name              Marks ");

        
        topStudents.forEach(s -> 
            System.out.printf("║ %-16s ║  %.2f ║%n", s.getName(), s.getMarks())
        );
    }
}
