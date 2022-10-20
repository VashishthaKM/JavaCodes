import java.util.Scanner;
public class ex2 
{
    public static void main(String[] args)
    {
        try (Scanner vm = new Scanner(System.in)) 
        {
            System.out.print("Enter Radius of the circle=");
            double radius=vm.nextDouble();
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;
            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);
        }
    }
}