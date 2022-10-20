import java.util.Scanner;

public class ex1 
{
    public static void main(String[] args) 
    {
        try (Scanner vm = new Scanner(System.in)) 
       {
           System.out.print("Entre Value of a=");
           int a=vm.nextInt();
           System.out.print("Enter Value of b=");
           int b=vm.nextInt();
           int c=a*b;
           System.out.println(c);
        }
    }
}