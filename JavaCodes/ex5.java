import java.util.Scanner;
public class ex5 
{
    public static void main(String[] args) 
    {
        try(Scanner vm = new Scanner(System.in))
        {
            System.out.print("Enter the year= ");
            int a= vm.nextInt();
            if(a%400==0)
            {
                System.out.println(a +" is leap year");
            }
            else if(a%100==0)
            {
                System.out.println(a +" is not leap year");
            }
            else if(a%4==0)
            {
                System.out.println(a +" is leap year");
            }
            else
            {
                System.out.println(a +" is not leap year");
            }
        } 
    }   
}
