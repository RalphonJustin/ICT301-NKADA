// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package OCP.after;

public class Circle implements Shape {
   private double radius;

   public Circle(double radius) {
      this.radius = radius;
   }

   public double calculateArea() {
      return Math.PI * this.radius * this.radius;
   }
}
