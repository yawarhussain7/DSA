import java.util.Scanner;

class tutorial_4_3{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int range, sum =0 ;
        System.out.print("Enter the range of number :> ");
        range = input.nextInt();

        for(int i =1; i <= range;i++)
        {
            sum = sum + i;
            System.out.print(i+" ");
        }
        System.out.println("\nSum :> "+sum);

       int num;
       System.out.print("Enter the number :> ");
       num = input.nextInt();

       for(int i= 1; i <= 10;i++)
       {
        System.out.println(num+" x "+i+" = "+num * i);
       }

    }
}