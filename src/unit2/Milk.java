package unit2;

public class Milk extends Drink{

    public Milk() {
        setName("Bottle of milk");
    }

    @Override
    public void type() {
        System.out.println("A bootle of milk");
    }
}
