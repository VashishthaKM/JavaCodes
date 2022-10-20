import java.util.Scanner;
public class ex4 
{
    public static void main(String[] args) 
    {
        try(Scanner vm= new Scanner(System.in))
        {
            System.out.println("Enter the three values=");
            int a= vm.nextInt();
            int b= vm.nextInt();
            int c= vm.nextInt();
            if(a>=b & a>=c)
            System.out.println("Greatest is "+a);
            if(b>=a & b>=c)
            System.out.println("Greatest is "+b);
            if(c>=a & c>=b)
            System.out.println("Greatest is "+c);
            //System.out.println(a + b + c);
        }        
    }
}