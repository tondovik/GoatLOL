import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Enter your age");
        String age = input.nextLine();

        int ageConverted = Integer.parseInt(age);
        System.out.println("Next year " + name + " will be: " + (ageConverted + 1));

        System.out.println("What is your height in meters?");
        double height = Double.parseDouble(input.nextLine());
        System.out.println("You are " + height + " meters tall.");

        // Challenge 1
        System.out.println("Enter two words:");
        String word1 = input.next();
        String word2 = input.next();

        System.out.println("Enter two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int combined = (num1 + num2) % 100;
        String email = word1 + word2 + combined + "@yahoo.com";

        System.out.println("Generated email: " + email);

        // Challenge 2
        System.out.println("Enter two numbers to divide:");
        double div1 = input.nextDouble();
        double div2 = input.nextDouble();

        double result = div1 / div2;
        System.out.println("Result of division: " + result);

        // Challenge 3
        System.out.println("Enter the diameter of a circle:");
        double diameter = input.nextDouble();
        double radius = diameter / 2.0;
        double area = Math.PI * radius * radius;

        System.out.println("Area of the circle: " + area);

        input.close();
    }
}
