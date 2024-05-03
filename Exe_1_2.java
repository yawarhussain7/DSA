//  Write a function to print the sum of all odd numbers from 1 to n.

 import java.util.Scanner;

 class Exe_1_2{

    public static void sum(int x)
    {
        int sum = 0;

        for(int i = 1; i <= x; i++)
        {
            if((i % 2) == 0)
            {
                continue;
            }
            else{
                sum = sum + i;
            }
        }
        System.out.print("Sum =:> "+sum);
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int odd;
        System.out.print("Enter your number :> ");
        odd = input.nextInt();
        sum(odd);
    }
 }