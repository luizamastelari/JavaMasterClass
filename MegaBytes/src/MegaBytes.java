public class MegaBytes {

    public static void printMegaBytesAndKiloBytes (int KiloBytes){
        if (KiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int MbValue = (KiloBytes / 1024);
            int restKiloBytes = (KiloBytes % 1024);
            System.out.println(KiloBytes + " KB = " + MbValue + " MB and " + restKiloBytes + " KB");
        }

    }
}
