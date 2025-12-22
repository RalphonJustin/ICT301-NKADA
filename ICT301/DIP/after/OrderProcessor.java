// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package DIP.after;

public class OrderProcessor {
   private Database database;

   public OrderProcessor(Database database) {
      this.database = database;
   }

   public void processOrder(String order) {
      System.out.println("Traitement de la commande...");
      this.database.save(order);
   }
}

