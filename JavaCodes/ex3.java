import java.util.Scanner;
public class ex3
{
    public static void main(String[] args)
    {
        try( Scanner vm = new Scanner(System.in))
        {
            System.out.print("Enter the values in inches= ");
            int inches= vm.nextInt();
            float meters =inches/39.37f;
            System.out.println(meters +" meter");
        }
    } 
}