
import java.util.*;
public class Library {
    private List<Book> books;
    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public void addBook(Book book, int index)
    {
        books.add(index,book);
    }
    public void  removeBook(Book book)
    {
        books.remove(book);
    }
    public void displayBooks()
    {
        System.out.println("Books currently in the library:");
        for(Book b :books)
        {
            System.out.print(" - "+b.getTitle());
        }
        System.out.println(" -");
    }
    public int numberOfBooks()
    {
        return books.size();
    }
    public boolean isEmpty()
    {
        return books.isEmpty();
    }
}
