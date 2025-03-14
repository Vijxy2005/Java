import java.util.Scanner;
public class ifelse{
    public static void main(String[] args){
        int age ,i=1,n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("how many time you need to perform this action:");
        n=scanner.nextInt();
        while(i<=5)
        {
        System.out.println("enter the age:");
        age=scanner.nextInt();
        if(age>18)
        {
            System.out.println("He is major");
        }
        else{
            System.out.println("He is minor");
        }
        i++;
        }
    }
}