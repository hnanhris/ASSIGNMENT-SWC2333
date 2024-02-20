
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
        Flower[] flowerArr = new Flower[10];
        
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

            //Instantiate each element of the array
            flowerArr[i] = new Flower();
            
            //call the mutator to change the object state
            flowerArr[i].setFlower(name, colour, quantity, price); 
            
            //Call the toString method
            System.out.println(flowerArr[i].toString());  
        }//end of for
        
    
    }//end of main 
}//end of class
