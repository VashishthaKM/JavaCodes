import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        try(Scanner vm=new Scanner(System.in)){
            System.out.print("Enter n term= ");
            int n=vm.nextInt();
            int a=0,b=1,c;
            for(int i=1; i<=n; ++i){
                c=a+b;
                System.out.print(" "+ c);
                a=b;
                b=c;           
            }
        }
    }   
}
