import java.util.Scanner;
public class print_the_grad {
    public static void main(String[] args) {
        System.out.println("enter marks");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>90||marks<100){
            System.out.println("excellent");

        }else if(marks>80||marks<90){
            System.out.println("very good");

        }else if(marks>70||marks<80){
            System.out.println("good");
            
        }else if(marks>60||marks<70){
            System.out.println("can do better");
            
        }else if(marks>50||marks<60){
            System.out.println("Average");
            
        }else if(marks>40||marks<50){
            System.out.println("Below Average");
            
        }else{
            System.out.println("fail");
        }
    }
}
