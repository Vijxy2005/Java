public class vowel{
    public static void main(String[] args) {
        Object input='a'; 
        if (input instanceof String) {
            System.out.println("It is a String.");
        } else if (input instanceof Character) {
            char ch = (Character) input;
            if (isVowel(ch)) {
                System.out.println("It is a vowel.");
            } else {
                System.out.println("It is not a vowel.");
            }
        } else {
            System.out.println("It is neither a String nor a Character.");
        }
    }
    public static boolean isVowel(char c) {
        c=Character.toLowerCase(c);
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
}
