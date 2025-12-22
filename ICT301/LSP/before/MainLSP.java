// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package LSP.before;

public class MainLSP {
   public MainLSP() {
   }

   public static void main(String[] args) {
      System.out.println("===== AVANT REFACTORING LSP =====\n");
      Rectangle rectangle = new Rectangle();
      rectangle.setWidth(5);
      rectangle.setHeight(4);
      System.out.println("Aire du Rectagle =" + rectangle.getArea());
      Rectangle rectangle1 = new Square();
      rectangle1.setWidth(5);
      rectangle1.setHeight(4);
      System.out.println("Aire du Carré =" + rectangle1.getArea());
   }
}

