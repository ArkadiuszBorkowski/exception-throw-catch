package lessonThrow;

class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.refuel(600);
        } catch (IllegalArgumentException e) {
            System.err.println("Nie można zatankować pojazdu");
        }

        System.out.println(car);

        try {
            car.drive();
            car.drive();
            car.drive();
        } catch (IllegalStateException e) {
            System.err.println("Brak paliwa");
        }
        System.out.println(car);
    }
}
