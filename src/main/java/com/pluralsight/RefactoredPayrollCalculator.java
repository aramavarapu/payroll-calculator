package com.pluralsight;
import java.util.Scanner;
public class RefactoredPayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getName(scanner);
        double workedHours = getWorkedHours(scanner);
        double payRate = getPayRate(scanner);

        double grossPay = solutionGrossPay(workedHours, payRate);

        results(name, grossPay);



    }
    public static String getName(Scanner scanner) {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }
    public static double getWorkedHours(Scanner scanner) {
        System.out.print("Enter the hours worked: ");
        return scanner.nextDouble();
    }
    public static double getPayRate(Scanner scanner) {
        System.out.print("Enter the pay rate: ");
        return scanner.nextDouble();

    }

    public static double solutionGrossPay(double workedHours, double payRate) {
        if (workedHours > 40) {
            double overtime = workedHours - 40;
            return (40 * payRate) + (overtime * payRate * 1.5);
        } else {
            return workedHours * payRate;
        }
    }
    public static void results(String name, double grossPay) {
        System.out.println("Employee: " + name);
        System.out.printf("Gross pay: $%.2f%n", grossPay);
    }
}
