package SRP.after;

public class Book {
    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    // Getters pour accéder aux données
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getContent() { return content; }
}

// Responsabilité : Uniquement l'affichage
class BookPrinter {
    public void printToScreen(Book book) {
        System.out.println("=== Affichage du livre ===");
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
    }
}

// Responsabilité : Uniquement la persistance (Base de données)
class BookRepository {
    public void save(Book book) {
        System.out.println("Sauvegarde du livre '" + book.getTitle() + "' en base de données...");
    }
}

// Responsabilité : Uniquement la logique métier (Emprunts)
class LibraryService {
    public void emprunter(Book book, String lecteur) {
        System.out.println("Emprunt du livre '" + book.getTitle() + "' par " + lecteur);
    }
}