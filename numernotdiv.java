import java.util.Scanner;

public class numernotdiv {
public static void main(String[] args) {
    

    Scanner sc=new Scanner(System.in);
    System.out.println("enter value");
    int num=sc.nextInt();
    if (num%5==0 && num%3!=0) { //one other logic is if number is divesbal by 5 or 3 it is also divesibal by 15 { num%15==0}
        System.out.println("divesebale by 5 or  but not 3");
        
    }    
}
}
