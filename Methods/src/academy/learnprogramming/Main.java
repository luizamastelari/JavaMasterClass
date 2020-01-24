/*
package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}*/

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

       int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Luiza", 3);

        /*double firstTry = displayHighScorePosition("Luiza" , 3);
        System.out.println(firstTry);*/

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1; // even if the condition is false, a value MUST BE RETURNED
        }

    }

    public static void displayHighScorePosition( String namePlayer, int position) {
        System.out.println( namePlayer + " managed to get into position " + position + " on the high score table ");

    }

    public static int calculateHighScorePosition(int scorePlayer){
        if (scorePlayer > 1000){
            return 1;
        } else if ((scorePlayer > 500) && (scorePlayer < 1000)){
            return 2;
        } else if ((scorePlayer >100) && (scorePlayer < 500)){
            return 3;
        }
        return 4;

    }
}
