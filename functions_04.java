import java.util.Scanner;

class functions_04{
    public static int fact(int x){

        int fact  = 1;
        for(int i = x; i >=1; i--)
        {
         fact = i*fact;
        }
       return fact;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num,result=0;
        System.out.print("Enter the number :> ");
        num = input.nextInt();

        result = fact(num);
        System.out.println(num+"  factorial is :> "+result);
    }
    
}