//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class task2 {
    public task2() {
    }

    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100.0 * Math.random());
        int K = 3;
        System.out.println("Enter a number between 0 to 100.Guess the number within 3 trials.");

        int i;
        for(i = 0; i < K; ++i) {
            System.out.println("Guess the number:");
            int guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Hurray You guessed the number.");
                break;
            }

            if (number > guess && i != K - 1) {
                System.out.println("The number is greater than " + guess);
            } else if (number < guess && i != K - 1) {
                System.out.println("The number is less than " + guess);
            }
        }

        if (i == K) {
            System.out.println("You have exhausted K trials.");
            System.out.println("The number was " + number);
        }

    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}
