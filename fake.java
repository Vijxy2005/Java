public class fake{
    public static void main(String[]args){
        String[] fruits={"apple","mango","orange","mango"};
        System.out.println("before changing...............");
    for(int i=0;i<4;i++)
    {
        System.out.print(fruits[i]+"\t");
    }
    System.out.println("after changing...............");
    fruits[0]="pineapple";
    for(int i=0;i<4;i++)
    {
        System.out.print(fruits[i]+"\t");
    }

        
    }
}