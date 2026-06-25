package at.campus02.bsd;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Stefan Schwarz");
        System.out.println("Add: " + calculator.add(10, 5));
        System.out.println("Subtract: " + calculator.subtract(10, 5));
        System.out.println("Divide: " + calculator.divide(10, 5));
        System.out.println("Multiply: " + calculator.multiply(10, 5));
    }
}
