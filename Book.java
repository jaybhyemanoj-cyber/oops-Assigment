import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
    
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}

class Library {
    private ArrayList<Book> books;
    
    public Library() {
        books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
    
    public boolean removeBookByISBN(String ISBN) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(ISBN)) {
                Book removedBook = books.remove(i);
                System.out.println("Book removed: " + removedBook.getTitle());
                return true;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
        return false;
    }
    
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("=== Library Books ===");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
            System.out.println("Total books: " + books.size());
        }
    }
    
    public Book findBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Library library = new Library();
        
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
        Book book3 = new Book("1984", "George Orwell", "978-0-452-28423-4");
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", "978-0-14-143951-8");
        
        System.out.println("=== Adding Books ===");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        
        System.out.println("\n=== Displaying All Books ===");
        library.displayAllBooks();
        
        System.out.println("\n=== Removing a Book ===");
        library.removeBookByISBN("978-0-452-28423-4");
        
        System.out.println("\n=== Displaying All Books After Removal ===");
        library.displayAllBooks();
        
        System.out.println("\n=== Trying to Remove Non-existent Book ===");
        library.removeBookByISBN("123-456-789");
        
        System.out.println("\n=== Searching for a Book ===");
        Book foundBook = library.findBookByISBN("978-0-06-112008-4");
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}
