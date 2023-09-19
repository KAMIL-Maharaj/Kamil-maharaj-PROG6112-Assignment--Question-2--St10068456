/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package libraryapp;

import org.junit.Test;
import static org.junit.Assert.*;



public class BookTest {
    @Test
    public void testBookProperties() {
        Book book = new Book("harry potter", "kamil", "1234567890");

        assertEquals("harry potter", book.getTitle());
        assertEquals("kamil", book.getAuthor());
        assertEquals("1234567890", book.getISBN());
    }
}

