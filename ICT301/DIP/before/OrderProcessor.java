package DIP.before;

public class OrderProcessor {
   private MySQLDatabase database = new MySQLDatabase(); // Dépendance forte (Problème DIP)

   public void processOrder(String order) {
      System.out.println("Traitement de la commande...");
      this.database.save(order);
   }
}