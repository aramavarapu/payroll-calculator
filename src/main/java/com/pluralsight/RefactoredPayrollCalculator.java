package com.pluralsight;
import java.util.Scanner;
public class RefactoredPayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getName(scanner);
        double workedHours = getWorkedHours(scanner);
        double payRate = getPayRate(scanner);



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
}
