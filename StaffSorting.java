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
        return name + ", " + age + ", $" + salary;
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

        staffMembers.sort(Comparator.comparing(s -> s.name));
        System.out.println("Sorted by Name: " + staffMembers);

        staffMembers.sort(Comparator.comparingInt(s -> s.age));
        System.out.println("Sorted by Age: " + staffMembers);

        staffMembers.sort(Comparator.comparingDouble(s -> -s.salary));
        System.out.println("Sorted by Salary (Descending): " + staffMembers);
    }
}
