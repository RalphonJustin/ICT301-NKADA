package DIP.after;

public class Main {
   public static void main(String[] args) {
      // Utilisation de MySQL
      Database mysqlDatabase = new MySQLDatabase();
      OrderProcessor order = new OrderProcessor(mysqlDatabase);
      order.processOrder("'Données à sauvegarder'");

      // Utilisation de MongoDB
      Database mongoDatabase = new MongoDBDatabase();
      OrderProcessor order1 = new OrderProcessor(mongoDatabase);
      order1.processOrder("'Données à sauvegarder'");

      // Utilisation de Firebase
      Database firebaseDatabase = new FirebaseDatabase();
      OrderProcessor order2 = new OrderProcessor(firebaseDatabase);
      order2.processOrder("'Données à sauvegarder'");
   }
}