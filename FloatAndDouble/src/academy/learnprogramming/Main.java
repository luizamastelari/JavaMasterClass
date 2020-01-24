package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myfloatMinValue = Float.MIN_VALUE;
        float myfloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myfloatMinValue);
        System.out.println("Float Maximum Value = " + myfloatMaxValue);

        double mydoubleMinValue = Double.MIN_VALUE;
        double mydoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + mydoubleMinValue);
        System.out.println("Double Maximum Value = " + mydoubleMaxValue);

        int myIntValue = 5;

        // float myWrongFloatValue = 5.25; -> incorrect because the default is double type

        float myFloatValue = 5.25f; // the f shows that is  a float
        float myRightFloatValue = (float) 5.25;

        double myDoubleValue = 5.25;

        int myIntValueTwo = 5 / 2;
        float myFloatValueTwo = 5f / 2f;
        double myDoubleValueTwo = 5d / 2d;
        System.out.println( "MyIntValueTwo = " + myIntValueTwo); // não mostra o resto
        System.out.println("MyFloatValueTwo = " + myFloatValueTwo); // valores impressos mostram 5.0
        System.out.println("MyDoubleValueTwo = " + myDoubleValueTwo); // valores impressos mostram 5.0

        //double type has more precision, is more used in Java's libraries and modern computers processes this types
        //more quickly than float equivalent

        //CHALLENGE

        double pounds = 200d;
        double kgResult = (pounds * 0.45359237d) ;

        System.out.println( pounds + " pounds is equal to " + kgResult + " Kg");
    }
}
