package SRP.before; // Indispensable pour correspondre aux .class fournis

import DIP.before.OrderProcessor;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== AVANT REFACTORING DIP =====\n");
        OrderProcessor order = new OrderProcessor(); // Dépendance directe
        order.processOrder("'Données à sauvegarder'");
    }
}