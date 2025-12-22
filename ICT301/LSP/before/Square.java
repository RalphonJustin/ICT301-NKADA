// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package LSP.before;

public class Square extends Rectangle {
   public Square() {
   }

   public void setWidth(int width) {
      super.setWidth(width);
      super.setHeight(width);
   }

   public void setHeight(int height) {
      super.setWidth(height);
      super.setHeight(height);
   }
}

