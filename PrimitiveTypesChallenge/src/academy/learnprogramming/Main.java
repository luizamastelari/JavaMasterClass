package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte myByteChallenge  = 100;
        short myShortChallenge = 30000;
        int myIntChallenge = 20000000;
        long myLongChallenge = (50000 + 10*(myByteChallenge + myShortChallenge + myIntChallenge));

        System.out.println(myLongChallenge);

    }
}
