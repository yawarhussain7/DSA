package Question;
import java.util.Scanner;

// Create two variable and get value from user after that print there sum 
public class Tutorial_02 {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);

        int num1,num2,sum=0;
        System.out.print("Enter the value of num1 :> ");
        num1 = input.nextInt();
        System.out.print("\nEnter the value of num2 :> ");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.println("SUm = "+sum);
    }
}
