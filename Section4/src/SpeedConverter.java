public class SpeedConverter {
    public static long toMilesPerHour(double kmIn){
        if(kmIn<0d) return -1l;
        else {
            return Math.round(kmIn/1.609);
        }
    }
    public static void printConversion(double kmIn){
        long tMPH;
        tMPH = toMilesPerHour(kmIn);
        String outStr = (tMPH>=0l) ? kmIn+" km/h = "+tMPH+" mi/h" : "Invalid Value";
        System.out.println(outStr);
    }
}
