package ex1;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double a = 0;
        double b = 0;
        String operator = null;

        boolean readComplete = false;

        while (!readComplete) {
            try {
            System.out.println("Podaj pierwszą liczbę");
            a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj operator");
            operator = scanner.nextLine();
            System.out.println("Podaj drugą liczbę");
            b = scanner.nextDouble();
            readComplete = true;
        } catch (InputMismatchException e) {
                System.err.println("Wprowadzono blędne dane, spróbuj ponownie");
                scanner.nextLine();
            }
        }

        try {
            double result = Calc.calculate(a, b, operator);
            System.out.println(a + operator + b + "=" + result);
        } catch (UnknownOperatorException | ArithmeticException e) {
            System.err.println(e.getMessage());
            System.err.println("Nie udało się obliczyć wyrażenia " + a + operator + b);

        }
    }
}