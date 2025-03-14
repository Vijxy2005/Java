import java.util.Scanner; // Import the Scanner class

public class StudentGrade { // Changed class name from double to StudentGrade
    public static void main(String[] args) {
        int marks[] = new int[6];
        int i;
        float total = 0, avg;
        Scanner scanner = new Scanner(System.in);
        
        // Collecting marks from the user
        for (i = 0; i < 6; i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        
        scanner.close(); // Closing the scanner
        
        // Calculating average
        avg = total / 6;
        
        // Printing grade based on the average marks
        System.out.print("The student Grade is: ");
        if (avg >= 80) {
            System.out.println("A");
        } else if (avg >= 60 && avg < 80) {
            System.out.println("B");
        } else if (avg >= 40 && avg < 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
