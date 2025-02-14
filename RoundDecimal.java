import java.util.Scanner;

/**
 *
 * @author  Alex Kapajika
 * @version 1.0
 * @since   2025-02-14
 */
public final class RoundDecimal {
    /*
     * @exception IllegalStateException
     * @see IllegalStateException
     */
    
    private RoundDecimal() {
        throw new IllegalStateException("Utility class");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value to calculate the radius: ");
        
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number.");
            return;
        }

        double userRadius = scanner.nextDouble();

        // Check for negative input
        if (userRadius < 0) {
            System.out.println("Negative numbers are not allowed, Try again!");
            return;
        }

        double pi = Math.PI;
        double volume = (4.0f / 3.0f) * pi * Math.pow(userRadius, 3);

        volume = Math.round(volume * 1000.0) / 1000.0;

        System.out.println("The volume of the sphere = " + volume + " cubic units");
        
        scanner.close();
    }
}