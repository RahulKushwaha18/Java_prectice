import java.util.Scanner;

/**
 * turnariOpretor
 */
public class turnariOpretor {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int var1=sc.nextInt();
        int var2=sc.nextInt();
        int var=((var1>var2)?var1:var2);
            System.out.println(var1+ " "+var+" " +var2);
      
}}