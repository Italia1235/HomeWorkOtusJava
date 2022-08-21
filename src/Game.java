
    public class Game {
        private int rightAnswerCount = 0;
        private int wrongAnswerCount = 0;

        private final Question[] questions;

        public Game() {
            questions = CreatorQuestion.getQuestion();
        }

        public void startGame() {
            for (Question question : questions) {
                if (question.run()) {
                    System.out.println("Правильный ответ");
                    rightAnswerCount++;
                } else {
                    System.out.println("Неправильный ответ");
                    wrongAnswerCount++;
                }
            }
            System.out.println("Результат: правильно " + rightAnswerCount + ", неправильно " + wrongAnswerCount);
        }


    }


