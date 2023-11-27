import java.util.*;
public class Playlist{
    private List<Song> playlist;
    private String title;

    public Playlist(String title) {
        this.title = title;
        playlist = new ArrayList<>();
    }
    public String getTitle() {
        return title;
    }
    public void addToPlaylist(Song song) {
        playlist.add(song);
    }
    public void removeFromPlaylist(Song song)
    {
        playlist.remove(song);
    }
    public void shufflePlaylist()
    {
        System.out.println("shuffling...");
        Collections.shuffle(playlist);
    }
    public void listSongs()
    {
        System.out.println("Songs in the playlist :"+title);
        for(Song s:playlist)
        {
            System.out.print(" - "+s.getTitle());
        }
        System.out.println(" -");
    }
}
