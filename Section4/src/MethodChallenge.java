public class MethodChallenge {
    public static void main(String[] args){
        int score = 1500;
        int positionOut = calculateHighScorePosition(score);
        displayHighScorePosition("playerName", positionOut);
    }
    public static void displayHighScorePosition(String playername, int position){
        System.out.println(playername+" managed to get into position "+position);
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>=1000) return 1;
        else if(playerScore > 500) return 2;
        else if(playerScore > 100) return 3;
        else {
            return 4;
        }
    }

}
