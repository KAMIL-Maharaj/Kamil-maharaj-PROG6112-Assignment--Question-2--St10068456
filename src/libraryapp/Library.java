/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;

/**
 *
 * @author kamil
 */
import java.util.ArrayList;
import java.util.List;



import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

 public void addBook(Book book) {
    if (books.size() < capacity) {
        books.add(book);
        System.out.println("Book added successfully!");
    } else {
        System.out.println("Library is full. Cannot add more books.");
    }
}

    public Book searchBook(String keyword) {
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getISBN().contains(keyword)) {
                return book;
            }
        }
        return null;
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
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



