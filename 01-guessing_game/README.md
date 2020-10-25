# Random Number Guessing Game
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to NumberGame!");
       
        String name;
        
        Scanner SC=new Scanner(System.in);
       
        System.out.print("Enter your name: ");
        name= SC.nextLine();
       
        System.out.println("Available levels of difficulty:");
        System.out.println("\t1. easy");
        System.out.println("\t2. normal");
        System.out.println("\t3. hard");
       
        
        
        int difficulty = input.nextInt();

        int min;
        int max;

        
        if (difficulty == 1) {
             min = 1;
             max = 10;
        } else if (difficulty == 2) {
             min = 1;
             max = 50;
        } else {
             min = 1;
             max = 500;
        }

        int secretNumber = getRandom(min, max);

        int numGuesses;

        if (difficulty == 1) {
             numGuesses = 4;
        } else if (difficulty == 2) {
             numGuesses = 5;
        } else {
             numGuesses = 8;
        }

        

        int tries = 0;
        int guess;
        do {
             System.out.printf("your guess (%d tries left): ", numGuesses - tries);
             guess = input.nextInt();
             tries++;

             if (guess == secretNumber) {
                  System.out.println( name + " win!");

                  if (tries == 1) {
                       System.out.println("Wow! Are you cheating " + name  );
                  }

                  break;
  
             } else if ( secretNumber % 2 == 0 ) {
                 System.out.println("Hint , the secret number is even");
             } else if ( secretNumber % 3 == 0 ) {
                System.out.println("Hint , the secret number is odd ");
             } else if ( guess > secretNumber ) {
                 System.out.println("Your guess is too high " + name  );
             } else {
                  System.out.println("Your guess is too low " + name  );
             }
        } while (tries < numGuesses);

        if (guess != secretNumber) {
             System.out.println(name + "You lose ! The secret number was " +
                                secretNumber);
        }
    }

    
    public static int getRandom(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
}


