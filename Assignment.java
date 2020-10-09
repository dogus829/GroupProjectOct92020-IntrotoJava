
// Ayumi Tanaka -- Alperen Gulec - Group Assignment -2020- October 9 - Friday
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome, Would you like to Play , PRESS ANY BUTTON TO PLAY!!");
        String nextLine1 = s.nextLine();

        // --------------------------------------------

        int userScore1 = 3;
        int userScore2 = 3;

        while (userScore1 != 0 && userScore2 != 0) {
            System.out.println(" YOU EACH HAVE 3 LIVES...");
            int random1 = (int) (Math.random() * 101);
            int random2 = (int) (Math.random() * 101);
            System.out.println("What is " + random1 + " + " + random2 + " ?");
            int nextLine2 = s.nextInt();

            int answer = random1 + random2;

            if (nextLine2 == answer) {
                System.out.println("User1 is correct the answer is " + answer);
            } else {
                System.out.println("User1 is wrong the answer is " + answer);
                userScore1--;
                System.out.println(" User1 has " + userScore1 + " lives left ");
            }
            int random3 = (int) (Math.random() * 101);
            int random4 = (int) (Math.random() * 101);

            int answer2 = random3 + random4;
            System.out.println("What is " + random3 + " + " + random4 + " ?");
            int nextLine3 = s.nextInt();

            if (nextLine3 == answer) {
                System.out.println("User2 is  correct the answer is " + answer2);
            } else {
                System.out.println("User2 is wrong the answer is " + answer2);
                userScore2--;
                System.out.println(" User2 has " + userScore2 + " lives left ");

            }
            if (userScore1 == 0) {
                System.out.println(" user2 WON ");
            } else if (userScore2 == 0) {
                System.out.println(" user1 WON ");
            }
        }
    }
}

// Two numbers that random

// User makes a guess, If it matches, It is correct, othewise, it is Wrong.

// Best of three, Whoever wins two rounds, WINS.