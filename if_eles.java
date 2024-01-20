import java.util.Scanner;

public class if_eles {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

      
        int vare=sc.nextInt();
        int  vare2=sc.nextInt();
        if(vare>vare2){
            int vare3=vare+vare2;
            System.out.println(vare3);

        }else{
            System.out.println("not equal");
        }
    }
}