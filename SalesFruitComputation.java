package app.salesFruits;
import java.util.Scanner;

public class SalesFruitsComputation {
    Scanner input = new Scanner(System.in);

    public void calculateFruit(String name, double s, double m, double l) {
        double totalcost = 0;
        System.out.print("Enter " + name + " size (Small, Medium, or Large): ");
        String fruitSize = input.nextLine();

        if (fruitSize.equalsIgnoreCase("small")) {
            totalcost = s;
        } else if (fruitSize.equalsIgnoreCase("medium")) {
            totalcost = m;
        } else if (fruitSize.equalsIgnoreCase("large")) {
            totalcost = l;
        } else {
            System.out.println("Invalid size");
            return;
        }

        System.out.print("How many kilos of " + name + " will you buy? ");
        double kilos = input.nextDouble();
    
        System.out.println("Total for " + name + ": " + (totalcost * kilos));
      
    }
}
