//  Enter 3 numbers from the user & make a function to print their average
 import java.util.Scanner;

 class Exe_1_1{
    public static void average(int x,int y,int z)
    {
        float result = (x + y + z)/3;
        System.out.print("Average is :> "+result);
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int x,y,z;
        System.out.print("Enter the value of x :> ");
        x = input.nextInt();
        System.out.print("\nEnter the value of y :> ");
        y = input.nextInt();
        System.out.print("\nEnter the value of z :> ");
        z = input.nextInt();


        average(x, y, y);
    }
 }