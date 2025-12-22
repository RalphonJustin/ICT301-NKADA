// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package DIP.after;

public class MySQLDatabase implements Database {
   public MySQLDatabase() {
   }

   public void save(String data) {
      System.out.println("Saving to MySQL: " + data);
   }
}
