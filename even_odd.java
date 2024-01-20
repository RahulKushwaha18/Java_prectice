import java.util.Scanner;
public class even_odd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int var=sc.nextInt();
        if(var%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }
}