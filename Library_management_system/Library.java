package Library_management_system;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public Book searchBookById(String id) {
        for (Book book : books) {
            if (book.getId().equalsIgnoreCase(id)) {
                return book;
            }
        }
        return null;
    }

    public void issueBook(String id) {
        Book book = searchBookById(id);
        if (book != null && !book.isIssued()) {
            book.setIssued(true);
            System.out.println("Book issued: " + book);
        } else {
            System.out.println("Book not available for issue or already issued.");
        }
    }

    public void returnBook(String id) {
        Book book = searchBookById(id);
        if (book != null && book.isIssued()) {
            book.setIssued(false);
            System.out.println("Book returned: " + book);
        } else {
            System.out.println("Book not found or not issued.");
        }
    }

    public void listBooks() {
        System.out.println("Books available in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

