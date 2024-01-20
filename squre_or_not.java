import java.util.Scanner;
public class squre_or_not {
    public static void main(String[] args) {
        System.out.println("enter length");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        System.out.println("enter brithe ");
        int brithe=sc.nextInt();
        if (length==brithe) {
            System.out.println("it is a squre ");
            
        }else{
            System.out.println("it is not squre ");
        }
    }
    
}
