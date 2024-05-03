import java.util.Scanner;

class functions_02{

    public static int sum(int x,int y)
    {
        int sum = x + y;
        return sum;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int num1,num2;
        System.out.print("Enter the first value :> ");
        num1 = input.nextInt();
        System.out.print("\nEnter the second value :> ");
        num2 = input.nextInt();

        int result = sum(num1, num2);
        System.out.print(num1 +" + "+ num2 +" = "+(num1 + num2));
    }
}