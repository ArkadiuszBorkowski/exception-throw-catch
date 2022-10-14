import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[2];
        boolean error = true;

        do {
            try {
                System.out.println("Podaj 1 liczbę");
                numbers[0] = sc.nextInt();

                System.out.println("Podaj 2 liczbę");
                numbers[0] = sc.nextInt();

                System.out.println("Którą liczbę chcesz wyświetlić. 1 czy 2");
                System.out.println("Liczba" + numbers[sc.nextInt() - 1]);
                error = false;

            } catch (InputMismatchException e)  {
                System.err.println("Podana wartość nie jest liczbą całkowitą. Spróbuj ponownie");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Miało być 1 lub 2. Spróbuj ponownie");
            } finally {
                sc.nextLine();
            }
        } while (error);

        sc.close();
    }
}
