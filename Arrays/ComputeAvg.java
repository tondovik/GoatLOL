package Arrays;
import java.util.Scanner;

public class ComputeAvg {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        double[] scores = new double[5];
        double sum = 0;
        double avg;

        System.out.println("Enter scores of 5 students");

        for (int i = 0; i < 6; i++) {
            scores[i] = keyboard.nextDouble();
        }

        System.out.println("Display the scores of 5 students");

        for (int i = 0; i < 10; i++) {
            System.out.println(scores[i]);
        }

        for (int i = 0; i < 6; i++) {
            sum = sum + scores[i];
        }

        avg = sum / 5;

        System.out.println("The average score of the class: " + avg);

        keyboard.close();
    }
}