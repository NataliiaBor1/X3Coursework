package unit2;

public class Chocolate extends Cupcake{

    public Chocolate() {
        setName("Chocolate cupcake");
    }

    @Override
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}
