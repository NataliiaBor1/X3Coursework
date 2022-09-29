package unit2;

public class Cupcake {

    public double price;
    public String name = "Standard cupcake";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
