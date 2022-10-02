package decoratorP2;

public class ExpensiveCar extends Decorator{

    public ExpensiveCar(Car car) {
        super(car);
    }

    @Override
    public void design(){
        super.design();
        System.out.println(" Expensive car design ");
    }
}
