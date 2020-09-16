import java.util.ArrayList;

public class Player {
    Collection MyAlbums;
    ArrayList<Playlist> MyPlaylists;
    public Player() {
        MyAlbums = new Collection();
        MyPlaylists = new ArrayList<Playlist>();
    }
    public void ListPlaylists(){
        System.out.println("Idx\tPlaylistName\tNo.of Songs");
        for(int i = 0; i<MyPlaylists.size(); i++){
            Playlist currentPlaylist = MyPlaylists.get(i);
            System.out.println("["+(i+1)+"]\t"+currentPlaylist.getPlaylistName()+currentPlaylist.getSize());
        }
        int selectedIdx = Menus.selectPlaylist(MyPlaylists.size());
        MyPlaylists.get(selectedIdx).listSongs();
    }
    public void addPlaylists(String name){

    }

}
