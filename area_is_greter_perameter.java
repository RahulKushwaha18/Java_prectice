import java.util.Scanner;
public class area_is_greter_perameter {
    public static void main(String[] args) {
        System.out.println("enter length");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        System.out.println("enter breadth");
        int breadth=sc.nextInt();
        int area=length*breadth;
        int perimeter=2*(length*breadth);
        if(area>perimeter){
              System.out.println("area is greter then perimeter"+ area);
        }else{
            System.out.println("perimeter is greter then area " + perimeter);
        }
    }
}
