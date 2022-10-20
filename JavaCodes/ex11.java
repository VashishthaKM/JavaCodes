import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        try(Scanner vm= new Scanner(System.in)){
            System.out.print("Enter The Size of array= ");
            int i, a=vm.nextInt();
            int vmarr[] = new int[a];
            System.out.print("Enter The Elements of array= ");
            for( i=0; i<a; i++){
                vmarr[i]=vm.nextInt();
                if(vmarr[i]<min){
                    min=vmarr[i];
                }
                if(vmarr[i]>max){
                    max=vmarr[i];
                }
            }
            System.out.println("Maximum value of array= "+ max);
            System.out.println("Minimum value of array= "+ min);
        }
    }
}
