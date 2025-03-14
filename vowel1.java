import java.util.Scanner;
public class vowel1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("how many time you need to perform this action:");
        n=scanner.nextInt();
        Scanner scan = new Scanner(System.in);       
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);
        if (isVowel(input)) {
            System.out.println("It is a vowel.");
        } else {
            System.out.println("It is not a vowel.");
        }
        scanner.close();
    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
