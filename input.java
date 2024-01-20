
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("enter the value of string");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("enter the value of integer");
        int b=sc.nextInt();
        System.out.println("enter the value of long ");
        long c=sc.nextLong();
        System.out.println("enter byte value");
        byte d=sc.nextByte();
        System.out.println("enter the double value");
        double e=sc.nextDouble();
        System.out.println("enter the boolean value");
        boolean f=sc.nextBoolean();
        System.out.println("enter the flot value ");
        float g=sc.nextFloat();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}
