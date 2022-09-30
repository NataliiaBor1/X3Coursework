package unit2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu = new ArrayList<> ();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. " +
                "We currently have three cupcakes on the menu but we need to decide on pricing.");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:\n");
        cupcake.type();

        System.out.println("How much would you like to charge for the Standard cupcake? (Input a numerical" +
                " number taken to 2 decimal places)");

        String priceText = input.nextLine();
        double price = Double.parseDouble((priceText));

        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our Red Velvet cupcake. Here is the description:\n");
        redVelvet.type();

        System.out.println("How much would you like to charge for the Red Velvet cupcake? (Input a numerical" +
                " number taken to 2 decimal places)");

        priceText = input.nextLine();
        double price1 = Double.parseDouble((priceText));

        redVelvet.setPrice(price1);

        System.out.println("We are deciding on the price for our Chocolate cupcake. Here is the description:\n");
        chocolate.type();

        System.out.println("How much would you like to charge for the Chocolate cupcake? (Input a numerical" +
                " number taken to 2 decimal places)");

        priceText = input.nextLine();
        double price2 = Double.parseDouble((priceText));

        chocolate.setPrice(price2);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);
        System.out.println("-------------------------");

        for (int i = 0; i < cupcakeMenu.size(); i++) {
            System.out.println(cupcakeMenu.get(i));
        }
        System.out.println("-------------------------");


    System.out.println(Arrays.toString(cupcakeMenu.toArray()));



        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the drink menu. " +
                "We currently have three drinks on the menu but we need to decide on pricing.");


        System.out.println("We are deciding on the price for Water drink. Here is the description:\n");
        water.type();

        System.out.println("How much would you like to charge for the Water drink? (Input a numerical" +
                " number taken to 2 decimal places)");

        priceText = input.nextLine();
        double price3 = Double.parseDouble((priceText));

        water.setPrice(price3);

        System.out.println("We are deciding on the price for our Soda drink. Here is the description:\n");
        soda.type();

        System.out.println("How much would you like to charge for the Soda drink? (Input a numerical" +
                " number taken to 2 decimal places)");

        priceText = input.nextLine();
        double price4 = Double.parseDouble((priceText));

        soda.setPrice(price4);

        System.out.println("We are deciding on the price for our Milk drink. Here is the description:\n");
        milk.type();

        System.out.println("How much would you like to charge for the Milk drink? (Input a numerical" +
                " number taken to 2 decimal places)");

        priceText = input.nextLine();
        double price5 = Double.parseDouble((priceText));

        milk.setPrice(price5);


        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
        System.out.println("-------------------------");

        for (int i = 0; i < drinkMenu.size(); i++) {
            System.out.println(drinkMenu.get(i));
        }
        System.out.println("-------------------------");

        new Order(cupcakeMenu, drinkMenu);
    }
}
