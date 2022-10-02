package decoratorP2;

public class Main {
    public static void main(String[] args) {
        CheapCar car1 = new CheapCar();
        Car passCar = new PassengerCar(car1);

        passCar.design();
    }
}
