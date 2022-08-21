import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    @Override
    public int validatorAnswerUser(int answersLength) {
        Scanner scanner = new Scanner(System.in);
        int userAnswer = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                userAnswer = scanner.nextInt();
                if (userAnswer > 0 && userAnswer < answersLength + 1) {
                    return userAnswer;
                } else {
                    System.out.println("Введите число из варианта ответа");
                }
            } else {
                System.out.println("Введите число из варианта ответа");
                scanner.next();
            }
        }
        return userAnswer;
    }


}
