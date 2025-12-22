// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package ISP.before;

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      System.out.println("===== AVANT REFACTORING ISP =====\n");
      Worker human = new HumanWorker();
      human.work();
      human.eat();
      System.out.println();
      Worker robot = new RobotWorker();
      robot.work();

      try {
         robot.eat();
      } catch (UnsupportedOperationException var4) {
         System.out.println("Exception: " + var4.getMessage());
      }

   }
}
