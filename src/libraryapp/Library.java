/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;

/**
 * This class represents a Library that can hold a collection of books.
 * It provides methods for adding books, searching for books, and listing the books in the library.
 * @author kamil
 */
import java.util.ArrayList;
import java.util.List;

public class Library {
    // Private fields to store the list of books and the library's capacity.
    private List<Book> books;
    private int capacity;

    /**
     * Constructs a new Library object with the specified capacity.
     * @param capacity The maximum number of books that the library can hold.
     */
    public Library(int capacity) {
        // Initialize the list of books with the specified capacity.
        this.books = new ArrayList<>(capacity);
        // Set the library's capacity.
        this.capacity = capacity;
    }

    /**
     * Adds a book to the library if there is space.
     * @param book The Book object to be added.
     */
    public void addBook(Book book) {
        if (books.size() < capacity) {
            // If there is space, add the book to the list and print a success message.
            books.add(book);
            System.out.println("Book added successfully!");
        } else {
            // If the library is full, print a message indicating that no more books can be added.
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    /**
     * Searches for a book in the library based on a keyword (title, author, or ISBN).
     * @param keyword The keyword to search for in book titles, authors, and ISBNs.
     * @return The first matching Book object found, or null if no match is found.
     */
    public Book searchBook(String keyword) {
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getISBN().contains(keyword)) {
                // If a matching book is found, return it.
                return book;
            }
        }
        // If no matching book is found, return null.
        return null;
    }

    /**
     * Lists the books currently in the library.
     */
    public void listBooks() {
        if (books.isEmpty()) {
            // If there are no books in the library, print a message indicating that.
            System.out.println("No books in the library.");
        } else {
            // Otherwise, list the books in the library with their titles, authors, and ISBNs.
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println();
            }
        }
    }
}
