// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package LSP.after;

public class Square implements Shape {
   private int side;

   public Square(int side) {
      this.side = side;
   }

   public int getArea() {
      return this.side * this.side;
   }
}
