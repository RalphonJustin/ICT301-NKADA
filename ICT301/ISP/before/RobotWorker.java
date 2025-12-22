// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package ISP.before;

class RobotWorker implements Worker {
   RobotWorker() {
   }

   public void work() {
      System.out.println("Les Robots travaillent sans fatigue");
   }

   public void eat() {
      System.out.println("l'on ne doit pas faire manger un robot");
      throw new UnsupportedOperationException("Les Robots ne mangent pas");
   }
}
