package Library_management_system;

import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. List Books");
            System.out.println("5. Search Book by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    Book newBook = new Book(id, title, author);
                    library.addBook(newBook);
                    break;
                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    id = scanner.nextLine();
                    library.issueBook(id);
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    id = scanner.nextLine();
                    library.returnBook(id);
                    break;
                case 4:
                    library.listBooks();
                    break;
                case 5:
                    System.out.print("Enter Book ID to search: ");
                    id = scanner.nextLine();
                    Book book = library.searchBookById(id);
                    if (book != null) {
                        System.out.println("Book found: " + book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
