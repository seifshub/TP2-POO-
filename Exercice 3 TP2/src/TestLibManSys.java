public class TestLibManSys {
    public static void main(String[] args) {
        Book book1 = new Novel("The alchimist", "Paulo Coelho", 1988, 253,"philosophy");
        Book book2 = new Textbook("java", "seif chouchane", 2022,300, "programming");
        Library library = new Library();

        book1.displayInformation();
        book2.displayInformation();

        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();

        library.removeBook(book1);
        library.displayBooks();

        library.addBook(book1,0);
        library.displayBooks();

        System.out.println("There are "+library.numberOfBooks()+" in the library.");
        System.out.println("Is the library currently empty? "+library.isEmpty());

        LibraryUser user1=new Student("seif",1,2023);
        LibraryUser user2 = new Teacher("ahmed",1,2019);

        user1.displayInfo();
        user2.displayInfo();

        user1.borrowBook(book1);
        user2.borrowBook(book2);

        user1.returnBook(book1);
        user1.returnBook(book2);
        user1.borrowBook(book2);

    }
}