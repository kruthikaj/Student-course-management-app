import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ✅ To read user input

        System.out.println("Hi, Welcome to my website. Who are you: Student or Admin?");
        System.out.println("Type A if you are Admin and S if you are Student");

        String studentorAdmin = scanner.nextLine().trim().toUpperCase(); // ✅ Read input and normalize

        if (studentorAdmin.equals("S")) { // ✅ Correct string comparison
            Student student = new Student();
            student.StudentFlow();
        } else if (studentorAdmin.equals("A")) {
            Admin admin = new Admin();
            admin.AdminFlow();
        } else {
            System.out.println("Invalid input. Please restart and type 'A' or 'S'.");
        }

        scanner.close(); // ✅ Always good to close Scanner
    }
}
