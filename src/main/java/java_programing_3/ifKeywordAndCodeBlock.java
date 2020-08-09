package java_programing_3;

public class ifKeywordAndCodeBlock {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
//        calculateScore(true, 10000, 8, 200);

        String playerName;
        int playerNumber;

//        --- SOLUTION ---

        displayHighScorePosition("Sponge Bob", calculatedHighScorePosition(1500));
        displayHighScorePosition("Skalmar", calculatedHighScorePosition(400));
        displayHighScorePosition("Patryk", calculatedHighScorePosition(80));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
//            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println("Player " + playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculatedHighScorePosition(int playerScore) {

//        if (playerScore > 1000) {
//            return 1;
//        } else if (playerScore > 500) {
//            return 2;
//        } else if (playerScore > 100) {
//            return 3;
//        }
//        return 4;

        int position = 4; // assiuming position 4 will be returned
        if (playerScore > 1000) {
            position = 1;
        } else if (playerScore > 500) {
            position = 2;
        } else if (playerScore > 100) {
            position = 3;
        }
        return position;
    }

}
