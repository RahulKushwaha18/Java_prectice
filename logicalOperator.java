
public class logicalOperator {
    public static void main(String[] args) {
        int a=6;
        int b=3;
        if((a%b==0)&&(a/b!=0)){
            System.out.println( "velid");
        }else{
            System.out.println("envelid");
        }
        if((a%b==0)||(a!=b)){
            System.out.println("velid");
        }else{
            System.out.println("invelid");
        }
        }
}
