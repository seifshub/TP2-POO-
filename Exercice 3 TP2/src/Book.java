
abstract public class Book {
    protected String title;
    protected String authorName;
    protected int yearOfPublication;
    protected int numberOfPages;
    protected boolean borrowed=false ;
    public Book()
    {
        title="";
        authorName="";
        yearOfPublication=0;
        numberOfPages=0;
    }
    public Book(String title,String authorName,int yearOfPublication,int numberOfPages)
    {
        this.title=title;
        this.authorName=authorName;
        this.yearOfPublication=yearOfPublication;
        this.numberOfPages=numberOfPages;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public boolean isBorrowed()
    {
        return borrowed;
    }
    public void setBorrowed(boolean b)
    {
        this.borrowed=b;
    }
    public String to_string() {
        return "Book: "+"title="+title+", authorName="+authorName+", yearOfPublication="+yearOfPublication+", numberOfPages=" +numberOfPages;
    }
    abstract void displayInformation();
}
