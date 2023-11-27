import java.util.*;
public class PremiumUser implements User{
    private String username;
    static int id=1;
    private int userId;
    private String email;
    private String password;
    private List<Playlist> playlists;

    public PremiumUser(String username,String email,String password) {
        this.username=username;
        this.userId =id;
        this.email=email;
        this.password=password;
        playlists=new ArrayList<>();
        id++;
    }
    public String getUsername()
    {
        return username;
    }
    public void listen(Song song)
    {
        System.out.println("User :"+username+" is listening to a song...");
        song.playSong();
    }
    public void addPlaylist(Playlist playlist)
    {
        System.out.println("User "+username+" added playlist "+playlist.getTitle());
        playlists.add(playlist);
    }
    public void deletePlaylist(Playlist playlist)
    {
        System.out.println("User "+username+" deleted playlist "+playlist.getTitle());
        for(Playlist p:playlists)
        {
            if(p==playlist)
            {
                playlists.remove(p);
            }
        }
    }
    public void addToPlaylist(Song song,Playlist playlist)
    {
        if(!playlists.contains(playlist))
        {
            System.out.println("The requested playlist does not exist.");
        }
        else {
            System.out.println("User "+username+" added the song "+song.getTitle()+" to the playlist "+playlist.getTitle());
            (playlists.get(playlists.indexOf(playlist))).addToPlaylist(song);
        }
    }
    public void removeFromPlaylist(Song song,Playlist playlist)
    {
        if(!playlists.contains(playlist))
        {
            System.out.println("The requested playlist does not exist.");
        }
        else
        {
            System.out.println("User "+username+" removed the song "+song.getTitle()+" from the playlist "+playlist.getTitle());
            (playlists.get(playlists.indexOf(playlist))).removeFromPlaylist(song);
        }

    }
    public void listPlaylists()
    {
        System.out.println("Playlists of user :"+username);
        for(Playlist p:playlists)
        {
            System.out.print(" - "+p.getTitle());
        }
        System.out.println(" -");
    }

    //feature available only for premium users. It allows them to share a playlist to another user
    public void sharePlaylist(Playlist playlist,User user)
    {
        System.out.println("User "+username+" shared "+playlist.getTitle()+" with user "+user.getUsername());
        for(Playlist p:playlists)
        {
            if(p.equals(playlist))
            {
                user.addPlaylist(playlist);
            }
        }
    }
}