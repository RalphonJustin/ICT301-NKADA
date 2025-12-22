package DIP.before; // AJOUTER CETTE LIGNE

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      System.out.println("===== AVANT REFACTORING DIP =====\n");
      OrderProcessor order = new OrderProcessor();
      order.processOrder("'Données à sauvegarder'");
   }
}