package GlobalWarmingQuiz;

import java.util.Scanner;

public class FactQuizTest {

    public static void main(String[] args) {
        int score = 0;
        FactQuiz factQuiz = new FactQuiz();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
                System.out.println(factQuiz.displayQuestionOne);
                System.out.println("input your Answer");
                String userAnswer = scanner.next();
                if (userAnswer.equalsIgnoreCase("A")) {
                    score++;
                }
            case 2:
                System.out.println(factQuiz.displayQuestionTwo);
                System.out.println("input your Answer");
                String userAnswer2 = scanner.next();
                if (userAnswer2.equalsIgnoreCase("B")) {
                    score++;
                }

            case 3:
                System.out.println(factQuiz.displayQuestionThree);
                System.out.println("input your Answer");
                String userAnswer3 = scanner.next();
                if (userAnswer3.equalsIgnoreCase("C")) {
                    score++;
                }
            case 4:
                System.out.println(factQuiz.displayQuestionFour);
                System.out.println("input your Answer");
                String userAnswer4 = scanner.next();
                if (userAnswer4.equalsIgnoreCase("D")) {
                    score++;
                }
            case 5:
                System.out.println(factQuiz.displayQuestionFive);
                System.out.println("input your Answer");
                String userAnswer5 = scanner.next();
                if (userAnswer5.equalsIgnoreCase("D")) {
                    score++;
                }
                System.out.println("you scored  :  "+ score + "\n" +"Remark  : " + factQuiz.displayScore(score));

        }
    }
}
