package decoratorP2;

public abstract class HumanClothes implements Human{

    private Human human;

    public HumanClothes(Human human) {
    }

    @Override
    public String dressHuman(){
        return human.dressHuman();
    }
}
