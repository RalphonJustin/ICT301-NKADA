// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package OCP.before;

public class AreaCalculator {
   public AreaCalculator() {
   }

   public double calculateArea(Object shape) {
      if (shape instanceof Rectangle rectangle) {
         return rectangle.getWidth() * rectangle.getHeight();
      } else if (shape instanceof Circle circle) {
         return Math.PI * circle.getRadius() * circle.getRadius();
      } else {
         throw new IllegalArgumentException("Unknown shape");
      }
   }
}
