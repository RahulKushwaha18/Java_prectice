import java.util.Scanner;
public class divisebalby_5 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in); 
        int a=sc.nextInt();
        if(a%5==0){
            System.out.println("it ids divesebal by 5");
            if(a<0){
                System.out.println("number ie nagative");
            }else{
                System.out.println("number is positive");
            }
        }
    }
}
