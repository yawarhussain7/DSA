import java.util.Scanner;
class tutorial_02 {
    
    public static void main(String args[])
    {
        //Output
        System.out.println("Hello WOrld");

        System.out.print("Hello World");
        System.out.print("Hello world \n with java ");

        //Variable              this is comment it will ignore when code run
        String name = "Yawar Hussian";
        int ages = 21;
        // float weight = 57.3;
        double height = 5.6;
        char favorit_letter = 'y';

        //input
        Scanner input = new Scanner(System.in);

        int age ;
        System.out.print("Enter you age :> ");
        age = input.nextInt();

        System.out.println("Your age is :> "+age);
        

    }
}
