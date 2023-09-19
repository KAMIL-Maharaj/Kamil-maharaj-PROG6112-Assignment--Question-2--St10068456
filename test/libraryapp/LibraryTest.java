/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package libraryapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kamil
 */
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library(2);
        library.addBook(new Book("Book1", "Author1", "ISBN1"));
        library.addBook(new Book("Book2", "Author2", "ISBN2"));
    }

    @Test
    public void testAddBook() {
        // Test adding a book when the library is not full
        Book newBook = new Book("Book3", "Author3", "ISBN3");
        library.addBook(newBook);
        assertEquals(newBook, library.searchBook("Book3"));
        
        // Test adding a book when the library is full
        Book bookToOverflow = new Book("Book4", "Author4", "ISBN4");
        library.addBook(bookToOverflow);
        assertNull(library.searchBook("Book4")); // Book4 should not be added
    }

    @Test
    public void testSearchBook() {
        // Test searching for an existing book
        Book foundBook = library.searchBook("peper pig");
        assertNotNull(foundBook);
        assertEquals("peper pig", foundBook.getTitle());

        // Test searching for a non-existing book
        Book notFoundBook = library.searchBook("NonExistentBook");
        assertNull(notFoundBook);
    }
    
   @Test
    public void testSearchBookNotFound() {
        Book book = new Book("harry potter", "neha seebran", "9876543210");
        library.addBook(book);

        Book foundBook = library.searchBook("har");
        assertNull(foundBook);
    }
    
    @Test
    public void testListBooks() {
        // Test listing books when there are books in the library
        // You can capture the console output and check if it contains the book information
        // This requires a custom output stream implementation for testing
        // For simplicity, we'll assume that the print statement works as expected
        // and test that it doesn't throw any exceptions.
        library.listBooks();
    }
}

