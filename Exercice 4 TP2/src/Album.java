import java.util.*;

public class Album {
    private String title;
    private int releaseYear;
    private String genre;
    private List<Song> songs;

    public Album(String title, int releaseYear, String genre) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        songs= new ArrayList<>();
    }
    public String getTitle() {
        return title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public String getGenre() {
        return genre;
    }
    public boolean isEmpty()
    {
        return songs.isEmpty();
    }
    public int numOfTracks()
    {
        return songs.size();
    }
    public int getTotalDurationInSeconds()
    {
        int t=0;
        for(Song s:songs)
        {
            t+=s.getDurationInSeconds();
        }
        return t;
    }
    public void addSong(Song song)
    {
        songs.add(song);
    }
    public void removeSong(Song song)
    {
        songs.remove(song);
    }
    public void listSongs()
    {
        System.out.println("Songs in the album :"+title);
        for(Song s:songs)
        {
            System.out.print(" - "+s.getTitle());
        }
        System.out.println(" -");
    }

    public void displayInfo (){
        System.out.println("Album{" + "title='" + title + ", releaseYear=" + releaseYear + ", genre='" + genre+ '}');
    }
}
