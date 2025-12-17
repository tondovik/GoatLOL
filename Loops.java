import java.util.Scanner;

public class Loops {
    

    public static void main(String[] args) {



        // break
        // continue
        // return
        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < 5; j++) {
                
                    System.out.print(j);
                

            }
            System.out.print('\n');








        }




        // for (int i = 0; i < 5 || j == 5; i++)
        
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        
        }

        boolean isContinuing = true;
        int z = 0;
        
        while (isContinuing) {
            z++;
            if (z == 20) {
                isContinuing = false;
            }
            System.out.println(z);
        }





        // Foobar
        // 1 to 100
        // i % 3 foo,
        // if i is divisble by 5 bar
        // if both divisble by 3 and 5 print foobar

 for (int e = 1; e <= 100; e++) {

            if (e % 3 == 0 && e % 5 == 0) {
                System.out.println("foobar");
            } else if (e % 3 == 0) {
                System.out.println("foo");
            } else if (e % 5 == 0) {
                System.out.println("bar");
            } else {
                System.out.println(e);
            }
        }
        
for (int row = 1; row <= 12; row++) {
            for (int col = 1; col <= 12; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }
        
    // Challenge 3
    // Guessing game between 3 numbers. 
    // if you guess the number correctly then you win
    // if not then keep playing the game

Scanner scanner = new Scanner(System.in);

int winningNumber = 2; // number between 1 and 3
int guess = 0;

while (guess != winningNumber) {
    System.out.print("Guess a number between 1 and 3: ");
    guess = Integer.parseInt(scanner.nextLine());

    if (guess == winningNumber) {
        System.out.println("You win!");
    } else {
        System.out.println("Wrong guess. Try again.");
    }
}
        scanner.close();

    }
}

