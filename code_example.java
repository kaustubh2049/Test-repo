/**
 * Class representing a simple Book object.
 */
class Book {
    // Fields (Attributes)
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;

    // Constructor
    public Book(String title, String author, String isbn, int publicationYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
    
    // Custom toString() method for easy printing
    @Override
    public String toString() {
        return "Book{" +
               "title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", year=" + publicationYear +
               ", isbn='" + isbn + '\'' +
               '}';
    }
}

/**
 * Class to manage a collection of Book objects (a simple library).
 */
import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    
    // Data structure to hold the books
    private List<Book> books;

    // Constructor to initialize the list
    public LibraryManager() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a new book to the library collection.
     * @param book The Book object to add.
     */
    public void addBook(Book book) {
        this.books.add(book);
        System.out.println("Added: " + book.getTitle());
    }

    /**
     * Prints all books currently in the library.
     */
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }
        System.out.println("\n--- Library Collection ---");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("--------------------------");
    }

    /**
     * Finds and prints books by a specific author.
     * @param authorName The author's name to search for.
     */
    public void findBooksByAuthor(String authorName) {
        System.out.println("\n--- Books by " + authorName + " ---");
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(authorName)) {
                System.out.println(book.getTitle() + " (" + book.getIsbn() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found for author: " + authorName);
        }
        System.out.println("--------------------------");
    }

    /**
     * Main method to run the program and demonstrate functionality.
     */
    public static void main(String[] args) {
        // 1. Create the library manager
        LibraryManager manager = new LibraryManager();

        // 2. Add some books
        Book book1 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "978-0345391803", 1979);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", "978-0141439518", 1813);
        Book book3 = new Book("The Restaurant at the End of the Universe", "Douglas Adams", "978-0345391810", 1980);
        
        manager.addBook(book1);
        manager.addBook(book2);
        manager.addBook(book3);

        // 3. Display the full collection
        manager.displayAllBooks();

        // 4. Search for a specific author
        manager.findBooksByAuthor("Douglas Adams");
    }
}