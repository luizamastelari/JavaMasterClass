package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

	// strings are a type of class, and not a primitive type

        String myString = "This is a String";
        System.out.println("My String is equal to " + myString);
        myString = myString + ", ans this is more.";
        System.out.println("My String is equal to " + myString);
        myString = myString + "\u00A7 2020";
        System.out.println("My String is equal to " + myString);

    }
}
