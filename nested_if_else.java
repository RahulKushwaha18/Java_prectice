import java.util.Scanner;
public class nested_if_else {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
    
       if(num%3==0||num%5==0){
        if(num%15!=0){
            System.out.println(" number is not divisibal by 15");
        }else{
            System.out.println("invelid");
        }
       }else{
        System.out.println("number is not divisibal by 3 and 5 ");
       }

    }
}
