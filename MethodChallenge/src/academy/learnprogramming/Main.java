package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


        /*int returnNumberPosition = calculateHighScorePosition(1500);
        System.out.println(returnNumberPosition);

        returnNumberPosition = calculateHighScorePosition(900);
        System.out.println(returnNumberPosition);

        returnNumberPosition = calculateHighScorePosition(400);
        System.out.println(returnNumberPosition);

        returnNumberPosition = calculateHighScorePosition(50);
        System.out.println(returnNumberPosition);*/

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Luiza", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Lais", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Niede", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Flavia", highScorePosition);


    }

    public static void displayHighScorePosition( String namePlayer, int position) {
        System.out.println( namePlayer + " managed to get into position " + position + " on the high score table ");

    }

    public static int calculateHighScorePosition(int scorePlayer){
        if (scorePlayer >= 1000){
            return 1;
        } else if (scorePlayer >= 500){
            return 2;
        } else if (scorePlayer >= 100){
            return 3;
        }
        return 4;

    }
}

