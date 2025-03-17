import java.util.*;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s, Age: %d, Salary: %.2f", name, age, salary);
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30, 50000),
            new Employee("Bob", 25, 60000),
            new Employee("Charlie", 35, 55000),
            new Employee("David", 28, 65000)
        );

        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("Sorted by Name:");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparingInt(Employee::getAge));
        System.out.println("\nSorted by Age:");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("\nSorted by Salary:");
        employees.forEach(System.out::println);
    }
}
