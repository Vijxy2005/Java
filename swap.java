public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=14;
        int[] swapped=swap(a, b);      
        System.out.println("a:"+swapped[0]);
        System.out.println("b:"+swapped[1]);
    }
    public static int[] swap(int a,0int b) {
        int temp=a;
        a=b;
        b=temp;
        return new int[] {a,b};
    }
}
