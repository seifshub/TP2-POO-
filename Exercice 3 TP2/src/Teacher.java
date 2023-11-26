import java.util.ArrayList;
import java.util.List;

public class Teacher implements LibraryUser{
    private String name;
    private int teacherID;
    private LibraryCard teacherLibraryCard;
    private int yearOfEndOfContract;
    private List<Book> borrowedBooks;
    public Teacher(String name, int teacherID,int yearOfEndOfContract) {
        this.name = name;
        this.teacherID = teacherID;
        this.yearOfEndOfContract=yearOfEndOfContract;
        teacherLibraryCard=new LibraryCard(this.teacherID,yearOfEndOfContract);
        borrowedBooks=new ArrayList<>();
    }
    public void displayCardInfo()
    {
        System.out.println("Teacher:"+this.name+"card's"+teacherLibraryCard.to_string());
    }
    @Override
    public void borrowBook(Book book) {
        if (book.isBorrowed()) {
            System.out.println("The book is not available.");
        } else {
            System.out.println(name + " with teacher ID " +teacherID + " has borrowed the book " + book.getTitle() + ".");
            book.setBorrowed(true);
            borrowedBooks.add(book);
        }
    }
    @Override
    public void returnBook(Book book){
        if(borrowedBooks.contains(book))
        {
            System.out.println(name + " with teacher ID " + teacherID + " has returned the book " + book.getTitle() + ".");
            book.setBorrowed(false);
            borrowedBooks.remove(book);
        }
        else {
            System.out.println("This book is not borrowed by the teacher");
        }
    }
    public void displayInfo() {
        System.out.println("teacher:  " +"name: "+ name+", teacher ID: "+teacherID+", year Of End Of Contract: "+yearOfEndOfContract+", Library Card: "+teacherLibraryCard.to_string());
    }
}
