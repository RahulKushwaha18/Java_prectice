import java.util.Scanner;
public class yungerposion {
    public static void main(String[] args) {
    System.out.println("enter Rame Age");
    Scanner  sc=new Scanner(System.in) ;
    int ramAge=sc.nextInt();
    System.out.println("enter Shyam age");
    int Shyam=sc.nextInt();
    System.out.println("enter Ajay Age ");
    int Ajay=sc.nextInt();    
    if (ramAge<Shyam&&ramAge<Ajay){
        System.out.println("ram is yungest ");

    } else if(Shyam<ramAge&&Shyam<Ajay){
        System.out.println(
        "shyame is yungest");


    }else {
        System.out.println("Ajay is yungest");
    }
          }    
}
