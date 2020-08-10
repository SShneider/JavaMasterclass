public class Main {
    public static void main(String[] args) {
        SpeedConverter.printConversion(55.0);
        MegaBytesConverter.printMegaBytesAndKiloBytes(50000);
        boolean upOrNot = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(upOrNot);
    }
}
