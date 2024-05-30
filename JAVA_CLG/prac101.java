import java.util.Scanner;

class Student_Detail {
    String enrollmentNo;
    String name;
    int semester;
    double cpi;

    Student_Detail(String enrollmentNo, String name, int semester, double cpi) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.semester = semester;
        this.cpi = cpi;
    }

    void displayDetails() {
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
        System.out.println("CPI: " + cpi);
    }
}

public class prac101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student_Detail[] students = new Student_Detail[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enrollment No: ");
            String enrollmentNo = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Semester: ");
            int semester = scanner.nextInt();
            System.out.print("CPI: ");
            double cpi = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            students[i] = new Student_Detail(enrollmentNo, name, semester, cpi);
        }

        System.out.println("\nStudent Details:");
        for (Student_Detail student : students) {
            student.displayDetails();
            System.out.println();
        }

        scanner.close();
    }
}