public class TeenNumberChecker {
    public static boolean hasTeen(int One, int Two, int Three){
     if (isTeen(One)) return true;
     if (isTeen(Two)) return true;
     if (isTeen(Three)) return true;
     return false;
    }
    public static boolean isTeen(int numIn){
        if(numIn>12 && numIn<20) return true;
        return false;
    }
}
