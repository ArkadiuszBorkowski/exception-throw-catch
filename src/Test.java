import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = 0;
        boolean error = true;

        do {
            try {
                number = sc.nextInt();
                error = false;
                System.out.println("Wczytano poprawną liczbę");
            } catch (InputMismatchException ex) {
                System.err.println("Podana wartość nie jest liczbą całkowitą");
                sc.nextLine();
                //ex.printStackTrace(); //metoda z wskazaniem szczegółów błędu;
            }
        } while (error);


        System.out.println("Podałeś liczbę " + number);
        sc.close();

    }
}
