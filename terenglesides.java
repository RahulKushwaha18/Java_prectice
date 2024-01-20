import java.util.Scanner;
public class terenglesides {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first value");
        int num=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        System.out.println("enter therd num");
        int num3=sc.nextInt();
        if(num+num2>num3&&num+num3>num2&&num2+num3>num){
            System.out.println("it is trengel ");
        }else{
            System.out.println("invelide inpute");
        }
    }
}
