package unit2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {

        System.out.println("Hello customer. Would you like to place an order? (Y or N)");

        Scanner input = new Scanner(System.in);
        String placeOrder = input.nextLine();

        ArrayList<Object> order = new ArrayList<Object>();

        if (placeOrder.equalsIgnoreCase("Y")) {
            order.add(LocalDate.now());
            order.add(LocalTime.now());

            System.out.println("Here is the menu.\n");
            System.out.println("CUPCAKES:");

            int itemNumber = 0;
            for (int i = 0; i < cupcakeMenu.size(); i++) {
                itemNumber++;
                System.out.print(itemNumber + ".");
                cupcakeMenu.get(i).type();
                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());
                System.out.println();
            }

            System.out.println("__________________________\n");

            System.out.println("DRINKS: ");
            for (int i = 0; i < drinkMenu.size(); i++) {
                itemNumber++;
                System.out.println(itemNumber + ".");
                drinkMenu.get(i).type();
                System.out.println("Price: $" + drinkMenu.get(i).getPrice());
                System.out.println();
            }
            System.out.println("__________________________\n");

            boolean ordering = true;

            while (ordering) {
                System.out.println("What would you like to order? " +
                        "Please use the number associated with each item to order.");
                int orderChoice = input.nextInt();
                input.nextLine();

                if (orderChoice == 1) {
                    order.add(cupcakeMenu.get(0));
                    System.out.println("Item " + cupcakeMenu.get(0) + " is added to order");
                } else if (orderChoice == 2) {
                    order.add(cupcakeMenu.get(1));
                    System.out.println("Item " + cupcakeMenu.get(1) + " is added to order");
                } else if (orderChoice == 3) {
                    order.add(cupcakeMenu.get(2));
                    System.out.println("Item " + cupcakeMenu.get(2) + " is added to order");
                } else if (orderChoice == 4) {
                    order.add(drinkMenu.get(0));
                    System.out.println("Item " + drinkMenu.get(0) + " is added to order");
                } else if (orderChoice == 5) {
                    order.add(drinkMenu.get(1));
                    System.out.println("Item " + drinkMenu.get(1) + " is added to order");
                } else if (orderChoice == 6) {
                    order.add(drinkMenu.get(2));
                    System.out.println("Item " + drinkMenu.get(2) + " is added to order");
                } else {
                    System.out.println("Sorry, we don’t seem to have that on the menu.");
                }
                System.out.println("Would you like to continue ordering? (Y/N)");

                String continueOrder = input.nextLine();

                if (!continueOrder.equalsIgnoreCase("Y")) {
                    ordering = false;
                }
            }
            System.out.println("__________________________\n");
            System.out.println("YOUR INITIAL ORDER: ");
            for (Object x : order) {
                System.out.println(x);
            }
            System.out.println("__________________________\n");

            System.out.println("YOUR FINAL ORDER: ");
            System.out.println("TODAY IS: " + order.get(0));
            System.out.println("CURRENT TIME IS: " + order.get(1));
            System.out.println("ITEMS YOU ORDERED: ");

            double subtotal = 0.0;

            for (int i = 2; i < order.size(); i++) {
                if (order.get(i).equals(cupcakeMenu.get(0))) {
                    cupcakeMenu.get(0).type();
                    cupcakeMenu.get(0).getPrice();
                    subtotal = subtotal + cupcakeMenu.get(0).getPrice();
                } else if (order.get(i).equals(cupcakeMenu.get(1))) {
                    cupcakeMenu.get(1).type();
                    cupcakeMenu.get(1).getPrice();
                    subtotal = subtotal + cupcakeMenu.get(1).getPrice();
                }
                else if (order.get(i).equals(cupcakeMenu.get(2))) {
                    cupcakeMenu.get(2).type();
                    cupcakeMenu.get(2).getPrice();
                    subtotal = subtotal + cupcakeMenu.get(2).getPrice();
                }
                else if (order.get(i).equals(drinkMenu.get(0))) {
                    drinkMenu.get(0).type();
                    drinkMenu.get(0).getPrice();
                    subtotal = subtotal + drinkMenu.get(0).getPrice();
                }
                else if (order.get(i).equals(drinkMenu.get(1))) {
                    drinkMenu.get(1).type();
                    drinkMenu.get(1).getPrice();
                    subtotal = subtotal + drinkMenu.get(1).getPrice();
                }
                else if (order.get(i).equals(drinkMenu.get(2))) {
                    drinkMenu.get(2).type();
                    drinkMenu.get(2).getPrice();
                    subtotal = subtotal + drinkMenu.get(2).getPrice();
                }
            }
            System.out.println("SUBTOTAL AMOUNT : $" + subtotal + "\n");
            System.out.println("__________________________\n");
            System.out.println("THANK YOU FOR SHOPPING WITH US TODAY!");
            String y = Character.toString( 128_512 );
            System.out.println("HAVE A GREAT DAY! " + y);
            System.out.println("__________________________\n");

            new CreateFile();
            new WriteToFile(order);
        }
        else {
            System.out.println("Have a nice day then.");
        }

    }
}
