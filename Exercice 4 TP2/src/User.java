public interface User {
    void listen(Song song);
    void addToPlaylist(Song song,Playlist playlist);
    void removeFromPlaylist(Song song,Playlist playlist);
    void addPlaylist(Playlist playlist);
    void deletePlaylist(Playlist playlist);
    void listPlaylists();
    String getUsername();
}
