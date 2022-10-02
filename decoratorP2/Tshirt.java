package decoratorP2;

public class Tshirt extends HumanClothes{

    public Tshirt(Human human) {
        super(human);
    }

    public String toClothe(){
        return super.dressHuman() + toClotheWithTshirt();
    }

    private String toClotheWithTshirt(){
        return " with Tshirt";
    }
}
