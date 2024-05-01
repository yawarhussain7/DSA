import java.util.Scanner;

class prymaid{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int range;
        System.out.print("Enter the range of array :> ");
        range = input.nextInt();

        int space = range;
        for(int i= 1; i <= range;i++)
        {
            for(int j =1 ; j <=space;j++)
            {
                System.out.print(" ");
            }
            space--;

            for(int j = 1; j <=i;j++)
            {
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}