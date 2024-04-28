import java.util.Scanner;

class tutorial_3_1{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int num1,num2;
        System.out.print("Enter the value of num1 :> ");
        num1 = input.nextInt();
        System.out.print("\nEnter the value of num2 :> ");
        num2 = input.nextInt();

        if(num1 > num2)
        {
            System.out.print(num1+ "  is Greater then "+num2);
        }
        else if(num1 < num2)
        {
            System.out.print(num1+ "  is Less then "+num2);
        }
        else if(num1 == num2)
        {
            System.out.print(num1+ "  is Equal then "+num2);
        }
    }
}