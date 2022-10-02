package decoratorP2;

public class CheapCar implements Car{

    @Override
    public void design() {
        System.out.println(" basic car ");
    }
}
