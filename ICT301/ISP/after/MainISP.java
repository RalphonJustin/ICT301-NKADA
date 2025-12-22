// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package ISP.after;

public class MainISP {
   public MainISP() {
   }

   public static void main(String[] args) {
      HumanWorker human = new HumanWorker();
      human.work();
      human.eat();
      RobotWorker robot = new RobotWorker();
      robot.work();
   }
}
