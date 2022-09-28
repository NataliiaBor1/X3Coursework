package unit2;

public class Soda extends Drink {

    public Soda () {
        setName("Bottle of soda");
    }

    @Override
    public void type() {
        System.out.println("A bottle of soda");
    }
}
