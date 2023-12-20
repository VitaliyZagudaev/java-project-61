package hexlet.code;

public class Game {

    private static String gameManual;
    private static String gameResult;
    private static String gameQuestion;
    private static String userAnswer;
    private static int gameRandom;

    Game(String manual, String result, String question, String answer, int random) {
        gameManual = manual;
        gameResult = result;
        gameQuestion = question;
        userAnswer = answer;
        gameRandom = random;
    }

    public static void setGameManual(String manual) {
        gameManual = manual;
    }
    public static void setGameResult(String result) {
        gameResult = result;
    }
    public static void setGameQuestion(String question) {
        gameQuestion = question;
    }
    public static void setUserAnswer(String answer) {
        userAnswer = answer;
    }
    public static void setGameRandom(int random) {
        gameRandom = random;
    }

    public static String getGameManual() {
        return gameManual;
    }
    public static String getGameResult() {
        return gameResult;
    }
    public static String getGameQuestion() {
        return gameQuestion;
    }
    public static String getUserAnswer() {
        return userAnswer;
    }
    public static int getGameRandom() {
        return gameRandom;
    }
}
