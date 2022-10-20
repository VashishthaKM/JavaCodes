import java.util.Scanner;
public class ex12 {
    public static void main(String[] args){
        try(Scanner vm=new Scanner(System.in)){
            System.out.print("Enter the size of array= ");
            int as=vm.nextInt();
            int j=0;
            int myar[]= new int[as];
            System.out.println("Enter the elements of array= ");
            for(int i=0; i<as; i++){
                myar[i]=vm.nextInt();
            }
            for(int i=0; i<myar.length; i++){
                if(myar[i]==0){
                    myar[j++]=myar[i];
                }
            }
            while(j<myar.length){
                myar[j++]=1;
            }
            System.out.println(" ");
            for(int i=0; i<as; i++){
                System.out.print(myar[i]+" ");
            }
        }
    }   
}