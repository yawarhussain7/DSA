import java.util.Scanner;

class Pattern_01{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int range;
        System.out.print("Enter the range :> ");
        range = input.nextInt();

        int space = range;
        for(int i =0; i < range ;i++)
        {
           
            for(int j = 0; j < space;j++)
            {
                System.out.print("_");
            }
            space--;
            for(int k = 0; k < range;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}