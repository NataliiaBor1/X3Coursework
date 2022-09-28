package unit2;

public class RedVelvet extends Cupcake{

    public RedVelvet() {
        setName("Red Velvet");
    }

    @Override
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting");
    }
}
