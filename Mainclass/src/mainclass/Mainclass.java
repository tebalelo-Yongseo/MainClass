/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

/**
 *
 * @author TEBALELO MADUMETSA
 */
public class Mainclass {

    private static String quantity;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creating a Sandwich object
      Sandwich sandwich = new Sandwich("Tuna", "Wheat", 4.99);

      // Displaying the initial values
      System.out.println("Main Ingredient: " + sandwich.getMainIngredient());
      System.out.println("Bread Type: " + sandwich.getBreadType());
      System.out.println("Price: $" + sandwich.getPrice());

      // Setting new values using setters
      sandwich.setMainIngredient("Chicken");
      sandwich.setBreadType("White");
      sandwich.setPrice(6.99);

      // Displaying the updated values
      System.out.println("\nUpdated Main Ingredient: " + sandwich.getMainIngredient());
      System.out.println("Updated Bread Type: " + sandwich.getBreadType());
      System.out.println("Updated Price: $" + sandwich.getPrice());

      // Calculating the total price for 5 sandwiches
      //int 5;
      double totalPrice = sandwich.calculateTotalPrice(quantity);

      System.out.println("\nTotal Price for " + quantity + " sandwiches: $" + totalPrice);

    }
    
}
