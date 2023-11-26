import java.util.*;
public class Student implements LibraryUser{
    private String name;
    private int studentID;
    private LibraryCard studentLibraryCard;
    private int yearOfEnrollment;
    private List<Book> borrowedBooks;
    public Student(String name, int studentID,int yearOfEnrollment){
        this.name = name;
        this.studentID = studentID;
        this.yearOfEnrollment=yearOfEnrollment;
        this.studentLibraryCard =new LibraryCard(this.studentID,yearOfEnrollment+5);
        borrowedBooks=new ArrayList<>();
    }
    @Override
    public void borrowBook(Book book) {
        if (book.isBorrowed()) {
            System.out.println("The book is not available.");
        } else {
            System.out.println(name + " with Student ID " + studentID + " has borrowed the book " + book.getTitle() + ".");
            book.setBorrowed(true);
            borrowedBooks.add(book);
        }
    }
    @Override
    public void returnBook(Book book){
        if(borrowedBooks.contains(book)) {
            System.out.println(name + " with Student ID " + studentID + " has returned the book " + book.getTitle() + ".");
            book.setBorrowed(false);
            borrowedBooks.remove(book);
        }
        else {
            System.out.println("This book is not borrowed by the student");
        }
    }
    public void displayInfo() {
        System.out.println("Student:  " +"name: "+ name+", student ID: "+studentID+", year Of Enrollment: "+yearOfEnrollment+", Library Card: "+studentLibraryCard.to_string());
    }
}
