import java.util.*;
public class Artist {
    private String name;
    private String nationality;
    private List<Album> albums;
    public Artist(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
        albums= new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public int numOfAlbums()
    {
        return albums.size();
    }
    public void addAlbum(Album album)
    {
        albums.add(album);
    }
    public void removeAlbum(Album album)
    {
        albums.remove(album);
    }
    public void listAlbums()
    {
        System.out.println("Albums of the Artist "+name+":");
        for(Album a:albums)
        {
            System.out.print("- "+a.getTitle());
        }
        System.out.println(" -");
    }
}
