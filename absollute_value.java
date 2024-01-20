import java.util.Scanner;
public class absollute_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int var=sc.nextInt();
         if(var<0){
            var=var*(-1);
            System.out.println( "absollute value is "+var);
         }
    }
}
