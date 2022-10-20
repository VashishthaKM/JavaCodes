import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        try(Scanner vm = new Scanner(System.in)){
            System.out.print("Enter your marks=");
            int marks=vm.nextInt();
            if(marks>=90 & marks<=100)
            System.out.println("Outstanding and You got 1st garde & A+= "+ marks);
            if(marks>=80 & marks<=89)
            System.out.println("You got 1st garde & A= "+ marks);
            if(marks>=75 & marks<=79)
            System.out.println("You got 1st garde & B+= "+ marks);
            if(marks>=70 & marks<=74)
            System.out.println("You got 1st garde & B= "+ marks);
            if(marks>=65 & marks<=69)
            System.out.println("You got 1st garde & C+= "+ marks);
            if(marks>=60 & marks<=64)
            System.out.println("You got 1st garde & C= "+ marks);
            if(marks>=55 & marks<=59)
            System.out.println("You got 2nd garde & D+= "+ marks);
            if(marks>=50 & marks<=54)
            System.out.println("You got 2nd garde & D= "+ marks);
            if(marks>=34 & marks<=49)
            System.out.println("You got 3rd garde & E= "+ marks);
            if(marks<=33)
            System.out.println("You are Fail & Your garde is F= "+ marks);
        }
    }
}
