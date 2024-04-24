import java.util.Scanner;
public class tutorial_02_1 {
    
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        String name;
        int age;
        float height;
        double weight;
        char fav_letter;

        System.out.println("Enter your name :> ");
        name = input.nextLine();
        System.out.println("Enter your age :> ");
        age = input.nextInt();
        System.out.println("Enter your height :> ");
        height = input.nextFloat();
        System.out.println("Enter your weight :> ");
        weight = input.nextFloat();
    }
}
