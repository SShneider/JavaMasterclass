import java.util.ArrayList;

public class Playlist {
    ArrayList<Song> playList;
    private String PlaylistName;
    private int size;
    public Playlist(String playlistName) {
        this.PlaylistName = playlistName;
        this.size = 0;
        this.playList = new ArrayList<Song>();
    }

    public String getPlaylistName() {
        return PlaylistName;
    }

    public int getSize() {
        return size;
    }

    public void listSongs(){
        for(int i = 0; i<playList.size(); i++){
            Song currentSong = playList.get(i);
            System.out.println("["+(i+1)+"]\t"+currentSong.getTitle()+"\t"+currentSong.getDurationSec());
        }
        return;
    }
}
