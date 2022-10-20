import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        try(Scanner vm = new Scanner(System.in)){
            System.out.print("Enter the No= ");
            int i, a=vm.nextInt();
            System.out.print("Table Of "+a+" is= ");
            for(i=1; i<=10; i++){
                System.out.print(a*i+" ");
            }
        }
    }
}
