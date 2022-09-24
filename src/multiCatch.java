import java.util.InputMismatchException;
import java.util.Scanner;

class multiCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean error = true;

        do {
            try {
                System.out.println("Podaj pierwszą liczbę:");
                numbers[0] = sc.nextInt();
                System.out.println("Podaj drugą liczbę:");
                numbers[1] = sc.nextInt();

                System.out.println("Którą z tych 2 liczb chcesz wyświetlić");
                System.out.println("Liczba " + numbers[sc.nextInt()-1]);

                error = false;

            } catch (InputMismatchException ex) {
                System.out.println("Nie podałęś liczby całkowitej");

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Miało być 1 lub 2");

            } finally {
                sc.nextLine();
            }
        } while (error);
        sc.close();
    }
}
//number = sc.nextInt();
//                error = false;
//

/*    System.err.println("Podana wartość nie jest liczbą całkowitą");
            sc.nextLine();*/
//ex.printStackTrace(); //metoda z wskazaniem szczegółów błędu;