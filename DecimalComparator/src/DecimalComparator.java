public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo){
        if ((int)(numberOne * 1000) == (int)(numberTwo * 1000)){
            return true;

        }
        return false;
    }
}
