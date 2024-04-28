import java.util.Scanner;

class tutorial_3_0{
    
   public static void main(String args[])
   {
    Scanner input = new Scanner(System.in);

    int num;
    System.out.print("Enter the number :> ");
    num = input.nextInt();

    if(num % 2 == 0)
    {
        System.out.println(num+"    is Even Number");
    }
    else{
        System.out.println(num+"    is Odd Number");
    }
   }
}