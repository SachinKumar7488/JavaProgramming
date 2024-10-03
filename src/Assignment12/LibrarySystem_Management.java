package Assignment12;

import java.util.ArrayList;
import java.util.Scanner;
//book class
class Book {
    private String bookTitle;
    private String bookAuthor;
    private String bookIsbn;

    // constructor
    public Book(String bookTitle, String bookAuthor, String bookIsbn) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookIsbn = bookIsbn;
    }

    // using getters method to return the value of attribute
    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }
}
//library class
class Library {
    private ArrayList<Book> bookList;

    public Library() {
        bookList = new ArrayList<>();
    }

    // method to add book in library
    public void addBook(Book book) {
        for (Book b : bookList) {
            if (b.getBookIsbn().equals(book.getBookIsbn())) {
                System.out.println("Error: Duplicate ISBN");
                return;
            }
        }
        bookList.add(book);
    }

    // method to remove book from library
    public void removeBook(String isbn) {
        for (Book b : bookList) {
            if (b.getBookIsbn().equals(isbn)) {
                bookList.remove(b);
                System.out.println("Book is removed from the list.");
                return;
            }
        }
        System.out.println("Error: Book not found");
    }

    // condition to check book availability
    public void listBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (Book b : bookList) {
                System.out.println("Title: " + b.getBookTitle() + ", Author: " + b.getBookAuthor() + ", ISBN: " + b.getBookIsbn());
            }
        }
    }
}
//main class
public class LibrarySystem_Management {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. List books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: // method to add book
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    Book book = new Book(title, author, isbn);
                    library.addBook(book);
                    break;
                    //method to remove book
                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    String removeIsbn = scanner.nextLine();
                    library.removeBook(removeIsbn);
                    break;
                    //list book
                case 3:
                    library.listBooks();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}