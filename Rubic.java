import java.util.Scanner;

class Rubic{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int size; 
        System.out.print("Enter the size :> ");
        size = input.nextInt();

        int space = size;
        for(int i = 0 ; i < size; i++)
        {
            for(int k = 0; k < space-1;k++)
            {
                System.out.print("_");
            }
            space--;
            for(int j = 0; j <=i ;j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j <=i ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    
        for(int i = size ; i >= 1; i--)
        {
            for(int k = 0; k < space-1;k++)
            {
                System.out.print("_");
            }
            space++;
            for(int j = 0; j <=i ;j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j <=i ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}