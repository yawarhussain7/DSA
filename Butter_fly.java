import java.util.Scanner;

class Butter_fly{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int range;
        System.out.print("Enter the range of array :> ");
        range = input.nextInt();
      
        // upper 
        for(int i = 1; i <= range; i++)
        {
            for(int j = 1; j <=i ; j++)
            {
                System.out.print("* ");
            }
            int space = 2*(range - i);
            for(int k = 1; k <= 2*space;k++)
            {
                System.out.print("_");
            }
            for(int j = 1; j <=i ; j++)
            {
                System.out.print("* ");
            }
            
         

            System.out.println();          
        }

        // lower half 
        for(int i = range; i >=1; i--)
        {
            for(int j = 1; j <=i ; j++)
            {
                System.out.print("* ");
            }
            int space = 2*(range - i);
            for(int k = 1; k <= 2*space;k++)
            {
                System.out.print("_");
            }
            for(int j = 1; j <=i ; j++)
            {
                System.out.print("* ");
            }
            
         

            System.out.println();          
        }
    }
}