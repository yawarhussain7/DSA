import java.util.Scanner;

class functions_03{

    public static int product(int x,int y)
    {
        int prod = x * y;
        return prod;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int num1,num2;
        System.out.print("Enter the first value :> ");
        num1 = input.nextInt();
        System.out.print("\nEnter the second value :> ");
        num2 = input.nextInt();

        int result = product(num1, num2);
        System.out.print(num1 +" x "+ num2 +" = "+result);
    }
}