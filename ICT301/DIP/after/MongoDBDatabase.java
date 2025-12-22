// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package DIP.after;

public class MongoDBDatabase implements Database {
   public MongoDBDatabase() {
   }

   public void save(String data) {
      System.out.println("Saving to MongoDB: " + data);
   }
}
