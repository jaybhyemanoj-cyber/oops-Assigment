// ============================================================
// Question 19 - Library Book Array
// ============================================================

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title  = title;
        this.author = author;
        this.price  = price;
    }

    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.printf("Price  : Rs. %.2f%n", price);
    }
}

public class LibraryBookArray {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Question 19 - Library Book Array     ");
        System.out.println("========================================");

        Book[] books = new Book[4];
        books[0] = new Book("Java Programming",       "James Gosling",    450.00);
        books[1] = new Book("Data Structures",        "Mark Allen Weiss", 550.00);
        books[2] = new Book("Operating Systems",      "Abraham Silberschatz", 600.00);
        books[3] = new Book("Database Management",    "Ramez Elmasri",    500.00);

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + " :");
            books[i].display();
            System.out.println("-------------------");
        }
    }
}
