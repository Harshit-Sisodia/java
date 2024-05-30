
class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

    class Employee extends Member {
    String specialization;

    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }

   
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
    }
}


class Manager extends Member {
    String department;


    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
    }
}


public class Main {
    public static void main(String[] args) {
      
        Employee employee = new Employee("Harshit", 28, "123456789", "123 santa barbara", 50000, "Software Development");

        Manager manager = new Manager("Mannu Smith", 35, "098-765-4321", "456 Maple street", 75000, "HR");

        System.out.println("Employee Details:");
        employee.displayDetails();
        System.out.println();

        System.out.println("Manager Details:");
        manager.displayDetails();
    }
}
