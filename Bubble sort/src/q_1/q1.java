package q_1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n,x;

        System.out.println("Enter the number of numbers you want to insert");
        Scanner numofnumbers=new Scanner(System.in);
        Scanner input=new Scanner(System.in);
        n=numofnumbers.nextInt();
        System.out.println("Enter your first number");
        x=input.nextInt();
        int[] array=new int[n-1];
        for (int
             i=x; i<=n+x; i++){
            n++;
            array[n]=i;



        }






    }
}