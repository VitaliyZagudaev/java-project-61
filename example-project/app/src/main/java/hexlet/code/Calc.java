package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("What is the result of the expression?");

        int index = 0;
        while (index < 3) {
            int number1 = Generator.generator();
            int number2 = Generator.generator();

            int operation = Generator.generatorThree();

            String operator = "";
            int result = 0;

            if (operation == 1) {
                operator = "+";
                result = (number1 + number2);

            } else if (operation == 2) {
                operator = "-";
                result = (number1 - number2);

            } else if (operation == 3) {
                operator = "*";
                result = (number1 * number2);
            }

            System.out.println("Question: " + number1 + " " + operator + " " + number2);
            System.out.print("Your answer: ");

            String answer = scanner.next();
            int answerInt = Integer.parseInt(answer);

            if (answerInt == result) {
                System.out.println("Correct!");
                index++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                break;
            }
        }
        if (index == 3) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }

    }
}
