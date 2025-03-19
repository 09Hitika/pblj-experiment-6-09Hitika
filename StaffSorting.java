import java.util.*;

class Staff {
    String name;
    int age;
    double salary;

    public Staff(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%-10s | Age: %2d | Salary: $%.2f", name, age, salary);
    }
}

public class StaffSorting {
    public static void main(String[] args) {
        List<Staff> staffMembers = Arrays.asList(
            new Staff("Alice", 30, 60000),
            new Staff("Bob", 25, 50000),
            new Staff("Charlie", 35, 70000),
            new Staff("David", 28, 45000)
        );

        // Sorting by Name
        staffMembers.sort(Comparator.comparing(s -> s.name));
        System.out.println("\n Sorted by Name:");
        staffMembers.forEach(System.out::println);

        // Sorting by Age
        staffMembers.sort(Comparator.comparingInt(s -> s.age));
        System.out.println("\n Sorted by Age:");
        staffMembers.forEach(System.out::println);

        // Sorting by Salary (Descending)
        staffMembers.sort(Comparator.comparingDouble(s -> -s.salary));
        System.out.println("\n Sorted by Salary :");
        staffMembers.forEach(System.out::println);
    }
}
