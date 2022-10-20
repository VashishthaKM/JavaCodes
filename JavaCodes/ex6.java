import java.util.Scanner;
public class ex6 
{
    public static void main(String[] args)
    {
        try(Scanner vm = new Scanner(System.in))
        {
            System.out.print("Enter the value of a=");
            int a=vm.nextInt();
            System.out.print("Enter the value of b=");
            int c, b=vm.nextInt();
            c=b;
            b=a;
            a=c;
            System.out.println("Enter the value of a=" + a);
            System.out.println("Enter the value of b=" + b);
        }   
    }
}
