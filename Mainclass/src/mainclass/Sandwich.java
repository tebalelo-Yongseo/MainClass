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
public class Sandwich {
    
    private String mainIngredient; // Main ingredient of the sandwich
   private String breadType; // Type of bread for the sandwich
   private double price; // Price of the sandwich

   // Default constructor
   public Sandwich() 
   {
      mainIngredient = "";
      breadType = "";
      price = 0.0;
   }

    // Parameterized constructor
   public Sandwich(String mainIngredient, String breadType, double price) 
   {
      this.mainIngredient = mainIngredient;
      this.breadType = breadType;
      this.price = price;
   }

   // Getter for mainIngredient
   public String getMainIngredient()
   {
      return mainIngredient;
   }
  // Setter for mainIngredient
   public void setMainIngredient(String mainIngredient) {
      this.mainIngredient = mainIngredient;
   }

   // breadType
   public String getBreadType() {
      return breadType;
   }

   // Setter for breadType
   public void setBreadType(String bread)
   {
      this.breadType = breadType;
   }
   public double getPrice() 
   {
      return price;
   }

    void setPrice(double d) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double calculateTotalPrice(String quantity) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


   // Method to calculate the total price of the sandwich
   public double calculateTotalPrice(int quantity) 
   {
      return price * quantity;
   }
  

}
