package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void even() {

        Greet.greet();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int index = 0;
        while (index < 3) {
            int number = Generator.generator();
            String result = ((number % 2) == 0) ? "yes" : "no";

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");

            String answer = scanner.next();

            if (answer.equals(result)) {
                System.out.println("Correct!");
                index++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                break;
            }
        }
        if (index == 3) {
            System.out.println("Congratulations, " + User.getUserName() + "!");
        } else {
            System.out.println("Let's try again, " + User.getUserName() + "!");
        }

    }
}
