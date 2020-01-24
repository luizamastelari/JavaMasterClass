package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previous result = " + previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);

        System.out.println("previous result = " + previousResult );

        // result and previous result are independent, so the value on line 16 doesn`t change, even after result value modification

        result++; // result = result + 1
        System.out.println("result++ = " + result);

        result+= 2; //result = result + 2
        System.out.println("result+= = " + result);

        result-=3; // result = result - 3
        System.out.println("result-= = " + result);

        result += 6;

        result /= 4;
        System.out.println(result);

        result *= 2;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("I'm relief!");
            System.out.println("And I'm scared of them...");
        }

        // é importante criar bloco utilizando {}. Além de evitar futuros bugs, o java só deixa de executar
        // a linha subsequente ao if, executando as demais...

        boolean isCar = false;
        if (isCar){  // this is a a short way to say isCar == true , so youre saying that its true
            System.out.println("This shouldnt happen");
        }

        boolean isNice = false;
        if (!isCar){ // !LALALA is equal to isCar == false
            System.out.println("Shortcut to say no!");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

        int ageOfClient = 18;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
        if (isEighteenOrOver){
            System.out.println("you may enter");
        }

        //CHALLENGE

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double resultOperator = (firstValue + secondValue) * 100.00d;
        double theRemainder = (resultOperator % 40.00d);
        System.out.println("The Remainder is = " + theRemainder);

        boolean theOutput = (theRemainder == 0) ? true : false;
        System.out.println(theOutput);
        if (!theOutput){
            System.out.println("Got some remainder");
        }




    }
}

