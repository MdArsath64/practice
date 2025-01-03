// Employee Management System
import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private String role;
    private double salary;

    // Constructor
    public Employee(String name, int age, String role, double salary) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for role
    public String getRole() {
        return role;
    }

    // Setter for role
    public void setRole(String role) {
        this.role = role;
    }

    // Method to increase salary by a percentage
    public void increaseSalary(double percentage) {
        this.salary = this.salary + (this.salary * percentage / 100);
    }

    // Method to print employee details
    public void printDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Role: " + role);
        System.out.println("Employee Salary: " + salary);
    }
}
public class EmployeeManagemntSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first employee
        System.out.println("Enter details for the first employee:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Role: ");
        String role1 = scanner.nextLine();
        System.out.print("Salary: ");
        double salary1 = scanner.nextDouble();

        Employee em1 = new Employee(name1, age1, role1, salary1);

        // Taking input for the second employee
        System.out.println("Enter details for the second employee:");
        System.out.print("Name: ");
        scanner.nextLine();  // Consume newline
        String name2 = scanner.nextLine();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Role: ");
        String role2 = scanner.nextLine();
        System.out.print("Salary: ");
        double salary2 = scanner.nextDouble();

        Employee em2 = new Employee(name2, age2, role2, salary2);

        System.out.println("\nEmployee Details:");
        em1.printDetails();
        em2.printDetails();

        System.out.println("\nIncrement of Salary After 1 Year:");
        System.out.print("Enter percentage increase for the first employee: ");
        double percentage1 = scanner.nextDouble();
        System.out.print("Enter percentage increase for the second employee: ");
        double percentage2 = scanner.nextDouble();
        
        em1.increaseSalary(percentage1);
        em2.increaseSalary(percentage2);
        em1.setAge(em1.getAge() + 1);
        em2.setAge(em2.getAge() + 1);
        em1.printDetails();
        em2.printDetails();

        System.out.println("\nChanging Role for Employees and Salaries:");
        System.out.print("Enter new role for the first employee: ");
        scanner.nextLine();  // Consume newline
        String newRole1 = scanner.nextLine();
        System.out.print("Enter new salary for the first employee: ");
        double newSalary1 = scanner.nextDouble();
        System.out.print("Enter new role for the second employee: ");
        scanner.nextLine();  // Consume newline
        String newRole2 = scanner.nextLine();
        System.out.print("Enter new salary for the second employee: ");
        double newSalary2 = scanner.nextDouble();

        em1.setRole(newRole1);
        em1.setSalary(newSalary1);
        em2.setRole(newRole2);
        em2.setSalary(newSalary2);
        em1.printDetails();
        em2.printDetails();

        scanner.close();
    }
}
