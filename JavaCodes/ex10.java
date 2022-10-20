import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        try(Scanner vm= new Scanner(System.in)){
            System.out.print("Enter The Size of array= ");
            int i,sum=0, a=vm.nextInt();
            int sunny[] = new int[a];
            System.out.print("Enter The Elements of array= ");
            for( i=0; i<a; i++){
                sunny[i]=vm.nextInt();
            }
            for(int j=0; j<a; j++){
                sum=sum+sunny[j];
            }
            System.out.println("Sum of the array elements is= "+sum);
        }
    }
}
