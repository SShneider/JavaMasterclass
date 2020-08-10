public class SecondAndMinutes {
    public static String getDurationString(int minIn, int secIn){
        int hOut;
        int mOut;
        int sOut;
        if (minIn<0 || secIn<0 || secIn>59) return "Invalid Value";
        else{
            sOut = secIn%60;
            mOut = (minIn%60+secIn/60)%60;
            hOut = minIn/60+mOut/60;
        }
        return hOut+"h "+mOut+"m "+sOut+"s";
    }
    public static String getDurationString(int secIn){
        if (secIn<0) return "Invalid Value";
        else return getDurationString(secIn%60, secIn/60);
    }

}
