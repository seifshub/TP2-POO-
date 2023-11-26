public class Textbook extends Book{
    private String subject;
    public Textbook(String title, String authorName, int yearOfPublication, int numberOfPages, String subject) {
        super(title, authorName, yearOfPublication, numberOfPages);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public void displayInformation()
    {
        System.out.println(super.to_string()+", Subject: "+getSubject());
    }
}
