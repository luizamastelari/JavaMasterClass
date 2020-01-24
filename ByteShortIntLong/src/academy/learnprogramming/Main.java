package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Concept of OVERFLOW  and UNDERFLOW
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1) );
        System.out.println("Busted Min Value = " + (myMinIntValue - 1) );

        //if try to put a number larger than the maximum or smaller than the minimum (values in Java), the computer just
        // skips to the next number

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        long mLongValue = 100L; //tem de haver uma letra, pois o java continua tratando como int
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        int MyTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue / 2); //CASTING -> treats like a INT


    }
}
