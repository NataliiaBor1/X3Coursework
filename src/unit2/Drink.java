package unit2;

public class Drink {

    public double price;
    public String name = "Bottle of water";

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
        System.out.println("A bottle of water");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
