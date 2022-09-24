package lessonThrow;

class Car {
    private static final double FUEL_CONSUMPTION = 8; //8L NA 100 KM
    private static final double MAX_FUEL = 50;
    private double fuel;

    public void refuel(double additionalFuel) {
        if (fuel + additionalFuel > MAX_FUEL)
            throw new IllegalArgumentException();
  //          System.out.println("Nie możesz zatankować tyle paliwa. Zmieści się jeszcze maksymalnie " + (MAX_FUEL -
            //          fuel));
        else
            fuel += additionalFuel;
    }

    public void drive() {
        if (fuel - FUEL_CONSUMPTION < 0)
            throw new IllegalStateException();
            //System.out.println("Masz za mało paliwa");
        else
        fuel -= FUEL_CONSUMPTION;
    }

    public String toString() {
        return "Stan paliwa:" + fuel;
    }

}
