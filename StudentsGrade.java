import java.util.Scanner;
public class StudentGrade{     
    public static void main(String[] args){
        int marks[] = new int[6];
        int i;
        float total= 0,avg;
        Scanner scanner = new Scanner(System.in);
        for (i=0;i<6;i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();
        avg = total / 6;
        System.out.print("The student Grade is: ");
        if (avg >= 80) 
        {
            System.out.println("A");
        } 
        else if (avg >= 60 && avg < 80) 
        {
            System.out.println("B");
        } 
        else if (avg >= 40 && avg < 60)
         {
            System.out.println("C");
        } 
        else 
        {
            System.out.println("D");
        }
    }
}
