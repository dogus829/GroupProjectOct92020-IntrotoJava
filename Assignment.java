
// Ayumi Tanaka -- Alperen Gulec

import java.util.Scanner;
import java.lang.Math;

public class Assignment {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("Hello and welcome to the two player math game, would you like to play? (y/n)");
            String response = s.next();

            if (response.equalsIgnoreCase("y")) {

                int userScore1 = 3;
                int userScore2 = 3;

                System.out.println("You each have 3 lives");

                while (userScore1 != 0 && userScore2 != 0) {

                    int random1 = (int) ((Math.random() * 100) + 1);
                    int random2 = (int) ((Math.random() * 100) + 1);

                    System.out.println("User 1: what is " + random1 + " + " + random2 + " ?");
                    int nextLine2 = s.nextInt();
                    int answer = random1 + random2;
                    if (nextLine2 == answer) {
                        System.out.println("User1 is correct the answer is " + answer);
                    } else {
                        System.out.println("User1 is wrong the answer is " + answer);
                        userScore1--;
                        System.out.println(
                                "The lives: Player 1: " + userScore1 + "/3" + " Player 2: " + userScore2 + "/3");
                    }
                    int random3 = (int) ((Math.random() * 100) + 1);
                    int random4 = (int) ((Math.random() * 100) + 1);

                    int answer2 = random3 + random4;
                    System.out.println("User 2: what is " + random3 + " + " + random4 + " ?");
                    int nextLine3 = s.nextInt();
                    if (nextLine3 == answer) {
                        System.out.println("User2 is correct the answer is " + answer2);
                    } else {
                        System.out.println("User2 is wrong the answer is " + answer2);
                        userScore2--;
                        System.out.println(
                                "The lives: Player 1: " + userScore1 + "/3" + " Player 2: " + userScore2 + "/3");
                    }
                    if (userScore1 == 0) {
                        System.out.println("user2 WON");
                    } else if (userScore2 == 0) {
                        System.out.println("user1 WON");
                    }
                }

                break;

            } else if (response.equalsIgnoreCase("n")) {
                System.out.println("Goodbye");
                break;
            }
        }
    }
}