public class Novel extends Book{
    private String genre;
    public Novel(String title, String authorName, int yearOfPublication, int numberOfPages, String genre) {
        super(title, authorName, yearOfPublication, numberOfPages);
        this.genre=genre;
    }
    public String getGenre() {
        return genre;
    }
    public void displayInformation()
    {
        System.out.println(super.to_string()+", Genre: "+getGenre());
    }
}
