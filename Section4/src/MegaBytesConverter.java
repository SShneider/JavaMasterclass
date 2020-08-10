public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        String printValue;
        if(kiloBytes<0)  printValue = "Invalid Value";
        else {
            int mbOut = kiloBytes / 1024;
            int kbOut = kiloBytes % 1024;
            printValue = kiloBytes + " KB = " + mbOut + " MB and " + kbOut + " KB";
        }
        System.out.println(printValue);
    }
}
