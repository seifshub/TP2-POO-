public class TestOnlineMusicPlatform {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Pink Floyd", "England");
        Artist artist2 = new Artist("Tool", "USA");
        Artist artist3 = new Artist("Radiohead", "England");

        Song song1 = new Song("The great gig in the sky", 1973, 317, "English", "Psychedelic Rock", artist1);
        Song song2 = new Song("Breathe", 1973, 370, "English", "Psychedelic Rock", artist1);
        Song song3 = new Song("Jambi", 2006, 448, "English", "Metal", artist2);
        Song song4 = new Song("The Pot", 2006, 390, "English", "Metal", artist2);
        Song song5 = new Song("Vicarious", 2006, 280, "English", "Metal", artist2);
        Song song6 = new Song("Weird fishes", 2007, 320, "English", "Rock", artist3);

        song1.displayInfo();

        Album album1 = new Album("The dark side of the moon", 1973, "Rock");
        Album album2 = new Album("10,000 Days", 2006, "Metal");
        Album album3 = new Album("In rainbows", 2007, "Rock");
        //adding songs to an album
        album1.addSong(song1);
        album1.addSong(song2);
        album2.addSong(song3);
        album2.addSong(song4);
        album2.addSong(song5);
        album3.addSong(song6);
        //listing songs of an album
        album1.listSongs();
        album2.listSongs();
        album3.listSongs();
        //removing a song from an album
        album1.removeSong(song1);
        album1.listSongs();
        System.out.println("The album :"+album2.getTitle()+" contains "+ album2.numOfTracks()+" tracks and its total duration is "+album2.getTotalDurationInSeconds()+" seconds.");

        artist1.addAlbum(album1);
        artist2.addAlbum(album2);
        artist3.addAlbum(album3);

        artist1.listAlbums();
        System.out.println("The artist "+artist1.getName()+" have "+artist1.numOfAlbums()+" albums.");

        User user1= new FreeUser("seif","user1@gmail.com","1234");
        User user2= new PremiumUser("farouk","user2@gmail.com","0000");

        Playlist playlist1= new Playlist("playlist1");
        Playlist playlist2= new Playlist("playlist2");

        user1.addPlaylist(playlist1);
        user2.addPlaylist(playlist2);

        user1.addToPlaylist(song1,playlist1);
        user1.addToPlaylist(song2,playlist1);

        user2.addToPlaylist(song3,playlist2);
        user2.addToPlaylist(song4,playlist2);
        user2.addToPlaylist(song5,playlist2);

        user1.listPlaylists();

        playlist2.listSongs();
        playlist2.shufflePlaylist();
        playlist2.listSongs();

        user1.listen(song1);

        ((PremiumUser)user2).sharePlaylist(playlist2,user1);
        user1.listPlaylists();
        user1.deletePlaylist(playlist1);








    }
}