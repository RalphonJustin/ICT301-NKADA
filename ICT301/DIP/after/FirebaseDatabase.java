// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package DIP.after;

public class FirebaseDatabase implements Database {
   public FirebaseDatabase() {
   }

   public void save(String data) {
      System.out.println("Saving to Firebase: " + data);
   }
}
