package app.salesFruits;
import java.util.Scanner;

public class SalesFruitsComputation {
    Scanner input = new Scanner(System.in);

    public void calculateFruit(String name, double small, double medium, double large) {
        double totalcost = 0;
        System.out.print("Enter " + name + " size (Small, Medium, or Large): ");
        String fruitSize = input.nextLine();

        if (fruitSize.equalsIgnoreCase("small")) {
            totalcost = small;
        } else if (fruitSize.equalsIgnoreCase("medium")) {
            totalcost = medium;
        } else if (fruitSize.equalsIgnoreCase("large")) {
            totalcost = large;
        } else {
            System.out.println("Invalid size");
            return;
        }

        System.out.print("How many kilos of " + name + " will you buy? ");
        double kilos = input.nextDouble();
    
        System.out.println("Total for " + name + ": " + (totalcost * kilos));
      
    }
}
