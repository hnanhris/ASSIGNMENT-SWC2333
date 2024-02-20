
/**
 * Program Purpose: To demonstrate the implementation of instance variables and 
 *                  methods of the class named Flower
 * Programmer: HananHaris
 * Date: 20 February 2024
 */

//import the respective package
import javax.swing.JOptionPane;

//Driver class
public class FlowerShop
{
    //Driver method
    public static void main(String[] args)
    {
        //Declaration of an array of size 10 named flowerArr
        String[] flowers = new String[10];
        double[] price = {.50, .75, 1.50, .50, .80 , .45 , .67 , .8 , .34 , .12};
        
        //Declaration of all variables
        String name, colour, str; 
        int quantity;
        double price;
        
        for(int i = 0; i < 10; i++)
        {
            name = JOptionPane.showInputDialog("Enter the name of flower " + (i+1) + " : ");
            colour = JOptionPane.showInputDialog("Enter the colour of flower : ");
            quantity = Integer.parseInt(str); //wrap from string to integer
            price = 

            
            //Call the toString method
            System.out.println(flowerArr[i].toString());  
            
            System.out.println("What kind of flower would you " +
            "like to purchase? \nPetunia, Pansy, Rose," +
            " Violet, or Carnation?");
        }//end of for
    

        double total = count * price.length;
        System.out.println("The cost for " + count  +  index  + " is " + total);
        
        
        
    }//end of main 
}//end of class
