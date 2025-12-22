package SRP.after;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== APRÈS REFACTORING SRP =====\n");
        
        // 1. Création de l'objet de donnée
        Book book = new Book("Les principes SOLID", "Etudiants de M1-GL", "Révision du SRP");

        // 2. Initialisation des services spécialisés
        BookPrinter printer = new BookPrinter();
        BookRepository repository = new BookRepository();
        LibraryService library = new LibraryService();

        // 3. Exécution des tâches via les services
        printer.printToScreen(book);
        System.out.println();
        
        repository.save(book);
        System.out.println();
        
        library.emprunter(book, "Marcial");

        System.out.println("\n===================================");
        System.out.println("Succès : Chaque classe n'a plus qu'une seule raison de changer !");
        System.out.println("===================================");
    }
}