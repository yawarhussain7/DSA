// Write a function which takes in 2 numbers and returns the greater of those
//  two.

import java.util.Scanner;

class functions_05{

    public static int max(int x,int y){

        if(x > y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int x,y;
        System.out.print("Enter the value of x :> ");
        x = input.nextInt();
        System.out.print("\nEnter the value of y :> ");
        y = input.nextInt();

        int result = max(x,y);
        System.out.print("Max number is :> "+result);
    }
}