import java.util.Scanner;
public class profit_lose {
    public static void main(String[] args) {
        System.out.println("enter the cost price and selling price");
        Scanner sc=new Scanner(System.in);
        int CP=sc.nextInt();
        int SP=sc.nextInt();
        if(CP>SP){
            System.out.println("loss is ="+"  "+(CP-SP));
        }else{
            System.out.println("profite is ="+ " "+(SP-CP));
        }

    }
}
