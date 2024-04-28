import java.util.Scanner;

class tutorial_03{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int age ;
        System.out.print("Enter your age :> ");
        age = input.nextInt();

        if(age > 18 )
        {
            System.out.print("\nAdult");
        }
        else{
            System.out.print("\nChild");
        }
    }
}