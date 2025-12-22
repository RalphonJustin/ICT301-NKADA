package OCP.after;

public class Main {
 
    public static void main(String[] args) {
    // Exemple d’utilisation :
    AreaCalculator2 calculator = new AreaCalculator2();

    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4, 6);

    System.out.println("Aire du cercle : " + calculator.calculateArea(circle));
    System.out.println("Aire du rectangle : " + calculator.calculateArea(rectangle));
}
    
}
