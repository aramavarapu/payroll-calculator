package com.pluralsight;
import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the hours worked: ");
        double workedHours = scanner.nextDouble();
        System.out.print("Enter the pay rate: ");
        double payRate = scanner.nextDouble();

        double grossPay;
        if (workedHours > 40) {
            double overtime = workedHours - 40;
            grossPay = (40 * payRate) + (overtime * payRate * 1.5);
        } else {
            grossPay = workedHours * payRate;
        }

        System.out.println("Employee: " + name);
        System.out.printf("Gross pay: $%.2f%n", grossPay);

    }
}
