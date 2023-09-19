/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libraryapp;

/**
 *
 * @author kamil
 */
import java.util.List;
import java.util.Scanner;





public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(100);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addBook(scanner, library);
                    break;
                case 2:
                    searchBook(scanner, library);
                    break;
                case 3:
                    library.listBooks();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Library Management System");
        System.out.println("1. Add a book");
        System.out.println("2. Search for a book");
        System.out.println("3. List all books");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addBook(Scanner scanner, Library library) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String ISBN = scanner.nextLine();
        Book newBook = new Book(title, author, ISBN);
        library.addBook(newBook);
    }

    private static void searchBook(Scanner scanner, Library library) {
        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine();
        Book foundBook = library.searchBook(keyword);
        if (foundBook != null) {
            System.out.println("Book found:");
            System.out.println("Title: " + foundBook.getTitle());
            System.out.println("Author: " + foundBook.getAuthor());
            System.out.println("ISBN: " + foundBook.getISBN());
        } else {
            System.out.println("Book not found.");
        }
    }
}
