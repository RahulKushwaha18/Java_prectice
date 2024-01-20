import java.util.Scanner;
public class gretestnumber {

    public static void main(String[] args) {
        System.out.println("enter the first value");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        System.out.println("enter therd num");
        int num3=sc.nextInt();
         if(num>num2&&num>num3){
            System.out.println("gretest number is "+ " "+num);

         }  else if(num2>num&&num2>num3){
            System.out.println("gretest number is "+" "+num2);
         }else{
            System.out.println("gretest number is "+" "+num3);
            
         }  
    }
}