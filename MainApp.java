import java.util.List;
import java.util.Scanner;

public class MainApp {

    private static StudentDAO studentDAO = new StudentDAO();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Update Student");
            System.out.println("5. Search Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    searchStudents();
                    break;
                case 6:
                    System.out.println("Exiting... Bye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 6);
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter roll number: ");
        String rollno = scanner.nextLine();

        System.out.print("Enter department: ");
        String dept = scanner.nextLine();

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(0, name, age, rollno, dept, marks);
        boolean success = studentDAO.addStudent(student);

        if (success) {
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Failed to add student.");
        }
    }

    private static void viewStudents() {
        List<Student> students = studentDAO.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\nList of students:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    private static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean success = studentDAO.deleteStudent(id);

        if (success) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Failed to delete student. Check if ID exists.");
        }
    }

    private static void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new roll number: ");
        String rollno = scanner.nextLine();

        System.out.print("Enter new department: ");
        String dept = scanner.nextLine();

        System.out.print("Enter new marks: ");
        int marks = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(id, name, age, rollno, dept, marks);
        boolean success = studentDAO.updateStudent(student);

        if (success) {
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Failed to update student. Check if ID exists.");
        }
    }

    private static void searchStudents() {
        System.out.print("Enter name, roll number, or department keyword to search: ");
        String keyword = scanner.nextLine();

        List<Student> results = studentDAO.searchStudents(keyword);
        if (results.isEmpty()) {
            System.out.println("No matching students found.");
        } else {
            System.out.println("Search results:");
            for (Student s : results) {
                System.out.println(s);
            }
        }
    }
}
