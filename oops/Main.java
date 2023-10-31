package oops;

class Employee {
    // Variables
    String name;
    int age;
    String dept;
    double salary;

    // Constructor
      Employee(String name, int age, String dept, double salary) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

    // Method 
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + salary);
    }
    
 }
 
 public class Main{

    public static void main(String[] args) {
        // Create an object
        Employee emp1 = new Employee("tamizh", 22, "HR", 50000.0);
        emp1.printInfo();
    }
}