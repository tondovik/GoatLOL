package Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

        // Challenge 1
        int[] price = new int[10];

        // Challenge 2
        int[] number = new int[20];

        for (int i = 0; i < 20; i++) {
            number[i] = 4;
        }

        // Challenge 3
        int[] data = {2, 4, 6, 8, 10, 12};

        double median;
        int size = data.length;

        if (size % 2 == 0) {
            median = (data[size / 2 - 1] + data[size / 2]) / 2.0;
        } else {
            median = data[size / 2];
        }

        System.out.println("Median is: " + median);
    }
}