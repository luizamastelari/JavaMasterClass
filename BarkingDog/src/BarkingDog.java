public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking , int hourOfDay){
        if (!barking){
            return false;
        } else if ((hourOfDay < 0 ) || (hourOfDay > 24)){
            return false;
        } else if ((hourOfDay >= 8) && (hourOfDay <= 22)) {
            return false;
        }
        return true;

    }
}