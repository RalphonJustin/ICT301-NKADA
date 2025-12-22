// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package LSP.after;

public class Rectangle implements Shape {
   private int width;
   private int height;

   public Rectangle(int width, int height) {
      this.width = width;
      this.height = height;
   }

   public int getArea() {
      return this.width * this.height;
   }
}
