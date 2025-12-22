// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package OCP.before;

import java.io.PrintStream;

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      System.out.println("===== AVANT REFACTORING OCP =====\n");
      AreaCalculator calculator = new AreaCalculator();
      Rectangle rectangle = new Rectangle(5.0, 4.0);
      Circle circle = new Circle(3.0);
      PrintStream var10000 = System.out;
      double var10001 = calculator.calculateArea(rectangle);
      var10000.println("Aire du rectangle: " + var10001);
      var10000 = System.out;
      var10001 = calculator.calculateArea(circle);
      var10000.println("Aire du cercle: " + var10001);
   }
}
