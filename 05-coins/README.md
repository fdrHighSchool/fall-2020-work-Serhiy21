# Coins - Earn and Spend
//Serhiy Stoperkevych
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
 
public class CoinMinute {
 
    
    static String newName;
    static int lives;
    static int answersCorrect;
    static int questionsAnswered;
    static int arithmeticAnswer;
    static int[ ] highScore;
    static String[ ] highScoreName;
    static String[ ] prevScoreName;
    static int u = 12;
    static int l = -12;
    static int menuChoice;
    static int[] prevScore = new int[10];
    static Scanner userInput = new Scanner(System.in);
 
    public static void main(String args[]) throws IOException {
        
        System.out.println("COIN GAME");
        System.out.println("Welcome to the coin game!");
        String name;
        
        Scanner SC=new Scanner(System.in);
       
        System.out.print("Enter your name: ");
        name= SC.nextLine();

        do {
            menuChoice = 0;
            newName = "Jane Doe";
            System.out.println("Press 1 to start a new game, press 2 to see the shop and instructions for the game,\n"
                    + "press 3 to see the score list, or press 4 to exit.");
            String choice = userInput.nextLine();
            menuChoice = Integer.parseInt(choice);
            if (menuChoice == 1) {
                startGame();
            } else if (menuChoice == 2) {
                printInstructions();
            } else if (menuChoice == 3) {
                printScores(highScore, highScoreName);
            } else if (menuChoice == 4) {
                System.out.println("Thanks for playing!");
            }
        } while (menuChoice != 1 && menuChoice != 4);
    }
 
    public static int startGame() throws IOException 
    {
        lives = 1;
        answersCorrect = 0;
        questionsAnswered = 0;
        do {
            System.out.println("Lives Remaining: " + lives + "\nTotal correct guesses: " + questionsAnswered);
            System.out.println("Good luck!");
            displayNewQuestion();
            System.out.print("1 is Head , 2 is Tail . Answer : ");
            String answer1 = userInput.nextLine();
            int answer = Integer.parseInt(answer1);
            if (answer != arithmeticAnswer) {
                lives--;
                questionsAnswered++;
                System.out.println("Head"
                        );
            } else {
                questionsAnswered++;
                answersCorrect++;
                System.out.println("+1 Point!");
                System.out.println("Correct Answers: " + answersCorrect);
            }
        } while (lives > 0);
        endGame(answersCorrect);
        return answersCorrect;
    }
 
    public static String endGame(int answersCorrect) throws IOException 
    {
        System.out.println("GAME OVER!");
        System.out.println("Congratulations, you reached a score of: " + answersCorrect);
        System.out.println("Please enter your name: ");
        newName = userInput.nextLine();
        System.out.println("Thanks for playing " + newName + "!");
        return (newName);
    }
    public static int[] scoreChange(int prevScore[], int answersCorrect) {
        prevScore[0] = answersCorrect;
        prevScore[0] = prevScore[1];
        return prevScore;
    }
 
     public static String[] nameChange (String prevScoreName[], String newName)
    {
        prevScoreName[0] = newName;
        prevScoreName[1] = "Jane Doe";
        prevScoreName[2] = "Jane Doe";
        return prevScoreName;
    }
 
    public static void printInstructions() { 
 
        System.out.println("Hello and welcome to the coin game program."
                + "\nIn this game, you will try to guess "
                + "which side the coin will fall .\n For each correct answer, you will receive a number of points that you can spend in the store, in order to increase your chance of winning."
                + "You start each game with three lives. Each time you get an answer wrong, one life is removed.\n"
                + "At the end of the game, your score (the number of questions you got right), and your name will be taken."
                + "\nThis information will be added to the score list. Each question is worth 1 point. Best of luck!" + "In order to increase your chance of winning by one percent, you need to score : 1) 1,000,000 coins. 2) 1,000,000 3) 1,000,000 coins ");
    }
 
    public static void printScores(int highScore[], String highScoreName[]) 
    {
       scoreChange(prevScore, answersCorrect);
       System.out.println(Arrays.toString(prevScore));
       nameChange(prevScoreName, newName);
       System.out.println(Arrays.toString(prevScoreName));
    }
 
    public static int displayNewQuestion() 
    {
        int rand1 = randomWholeNumber(u, l);
        int rand2 = randomWholeNumber(u, l);
        int operator = 1 + (int) (Math.random() * ((4 - 1) + 1));
        if (operator == 1) {
            System.out.println("The number is"+rand1 + " + " + rand2);
            arithmeticAnswer = rand1 + rand2;
        } else if (operator == 2) {
            System.out.println("The number is"+ rand1 + " - " + rand2);
            arithmeticAnswer = rand1 - rand2;
        } else if (operator == 3) {
            System.out.println("The number is"+ rand1 + " X " + rand2);
            arithmeticAnswer = rand1 * rand2;
        } else if (operator == 4) {
            do {
                rand2 = randomWholeNumber(u, l);
            } while (rand2 == 0);
            System.out.println("The number is"+ rand1 + " / " + rand2);
            arithmeticAnswer = rand1 / rand2;
            Math.floor(arithmeticAnswer);
        }
        return (arithmeticAnswer);
    }
 
    public static int randomWholeNumber(int u, int l) 
    {
        int rand = (-12) + (int) (Math.random() * ((12 - -12) + 1));
        return rand;
    }
 
}

