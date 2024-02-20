
/**
 * Program Purpose: To define the attributes and behaviours of the Flower class
 * Programmer: HananHaris
 * Date: 20 February 2024
 */

//import the respective package
import javax.swing.JOptionPane;

public class Flower
{
    //Declaration of the instance variables
    private String name; 
    private String colour;
    private double price; 
    private int quantity;
    
    //Constructor without param
    public Flower()
    {
        name = null; 
        colour = null;
        price = 0;
        quantity = 0;   
    }//end of constructor

    
    //Constructors with param
    public Flower(String name, String colour, double price, int quantity)
    {
        this.name = name; 
        this.colour = colour;
        this.price = price;  
        this.quantity = quantity;
    }//end of constructor
    
    
    //Accessor/getter
    public String getName()
    {
        return name;        
    }//end of accessor
    
    public String getColour()
    {
        return colour;        
    }//end of accessor
    
    public double getPrice()
    {
        return price;
    }//end of accesssor
    
    public int getQuantity()
    {
        return quantity;
    }//end of accessor
    
    
    //Mutator for all data members
    public void setFlower(String name, String colour, double price, int quantity)
    {
        this.name = name; 
        this.colour = colour;
        this.price = price;  
        this.quantity = quantity;   
    }//end of mutator
    
   
    //toString method
    public String toString()
    {
        return ("Flower name = " + name +
                "\nColour = " + colour +
                "\nPrice = " + price +
                "\nQuantity = " + quantity);
    }//end of toString
}//end of class