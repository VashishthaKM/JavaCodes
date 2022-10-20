import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        try(Scanner vm=new Scanner(System.in)){
            System.out.println("Enter the three numbers");
            System.out.println("Enter the Number A= ");
            int a=vm.nextInt();
            System.out.println("Enter the Number B= ");
            int b=vm.nextInt();
            System.out.println("Enter the Number C= ");
            int c=vm.nextInt();
            if(a>b & a>c){
                System.out.print("A is Greater among ABC "+ a);
            }
            if(b>a & b>c){
                System.out.print("B is Greater among ABC "+ b);
            }
            if(c>a & c>b){
                System.out.print("C is Greater among ABC "+ c);
            }
        }
    }
}
