import java.util.Scanner;
public class Leep_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("leep year");

        }else if(year%400==0){
            System.out.println("leep year");
            
        }else{
            System.out.println("not a leep year ");
        }
    }
}
