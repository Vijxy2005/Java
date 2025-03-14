import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        int age,i=0,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times to perform:");
        n = scanner.nextInt();
        while (i < n) { 
            System.out.println("Enter the age:");
            age=scanner.nextInt();       
            if (age>80) {
                System.out.println("Invalid input");
            } else if (age>18) {
                System.out.println("He is a major");
            } else {
                System.out.println("He is a minor");
            }  
            i++;  
        }
    }
}
