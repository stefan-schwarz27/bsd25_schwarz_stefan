package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Application started");
        logger.error("Example error log entry");

        Calculator calculator = new Calculator();

        System.out.println("Stefan Schwarz");

        System.out.println("Add: " + calculator.add(10, 5));
        System.out.println("Subtract: " + calculator.subtract(10, 5));
        System.out.println("Divide: " + calculator.divide(10, 5));
        System.out.println("Multiply: " + calculator.multiply(10, 5));
        System.out.println("Divide by zero: " + calculator.divide(10, 0));
	logger.info("Application finished");
    }
}
