public class Song {
    private String title;
    private int releaseYear;
    private int durationInSeconds;
    private String language;
    private Artist artist;
    private String genre;
    public Song()
    {
        this.title = "";
        this.releaseYear = 0;
        this.durationInSeconds =0;
        this.language ="";
        this.genre = "";
    }

    public Song(String title, int releaseYear, int durationInSeconds, String language, String genre,Artist artist) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.durationInSeconds = durationInSeconds;
        this.language = language;
        this.genre = genre;
        this.artist=artist;
    }
    public String getTitle() {
        return title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public int getDurationInSeconds() {
        return durationInSeconds;
    }
    public String getLanguage() {
        return language;
    }
    public String getGenre() {
        return genre;
    }
    public void playSong()
    {
        System.out.println("The Song "+title+" is playing...");
    }
    public void displayInfo() {
        System.out.println("Song{" +"title:" + title+ ", releaseYear:" + releaseYear + ", durationInSeconds:" + durationInSeconds + ", language=" + language +", genre=" + genre + '}');
    }
}
