import java.util.Scanner;

public class StudentGradesGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        String[] names = new String[numStudents];
        int[] grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.next();
            System.out.print("Enter grade of " + names[i] + " (0-100): ");
            grades[i] = scanner.nextInt();
        }

        System.out.println("\nStudent Grades Bar Graph:");
        System.out.println("==========================");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10s | ", names[i]);
            int bars = grades[i] / 2;
            for (int j = 0; j < bars; j++) {
                System.out.print("█");
            }
            System.out.println(" " + grades[i] + "%");
        }

        scanner.close();
    }
}
