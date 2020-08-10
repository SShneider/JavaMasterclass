public class PlayingCat {
    public static boolean isCatPlaying(boolean season, int temp){
        if(temp<25) return false;
        else {
            if(season){
                if(temp<46) return true;
            }
            else {
                if(temp<36) return true;
            }
        }
        return false;
    }
}
