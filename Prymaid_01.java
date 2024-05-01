import java.util.Scanner;

class Prymaid_01{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int size;
        System.out.print("Enter the size :> ");
        size = input.nextInt();

        int space = size;

        for(int i =1 ;i <=size;i++)
        {
            for(int k = 1; k <= space -1;k++)
            {
                System.out.print(" ");
            }
            space--;
            for(int j = i; j >=1; j--)
            {
                System.out.print(j);
            }
            for(int j = 2; j <=i; j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }
        
    }
}