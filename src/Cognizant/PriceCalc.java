package Cognizant;
import java.util.Scanner;

public class PriceCalc {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number of pizzas bought: ");
       int pizzas = sc.nextInt();

       System.out.println("Enter the number of puffs bought: ");
       int puffs = sc.nextInt();

       System.out.println("Enter te number of cool drinks bought: ");
       int coolDrinks =  sc.nextInt();

       int pizzaCost = pizzas * 100;
       int puffCost = puffs * 20;
       int cooldrinksCost = coolDrinks * 10;
       int total = pizzaCost + puffCost + cooldrinksCost;

       System.out.println("Bill Details");
       System.out.println("Number of pizzas: " + pizzaCost);
        System.out.println("Number of puffs: " + puffCost);
        System.out.println("Number of cooldrinks: " + cooldrinksCost);
        System.out.println("Total price: " + total);
    }
}
