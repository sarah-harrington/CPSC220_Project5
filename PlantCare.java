
/**
 * Takes in user input for: plant name, water given, light given, and fertilized status
 * Compare this information to the recommended amounts from Plants 
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.ArrayList;

public class PlantCare extends Plants
{   
    /**
     * Constructor for objects of class PlantCare
     */
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Plants> inputPlants = new ArrayList<Plants>();
        
        //User input plant name
        // while loop
        System.out.println("Do you want to input a plant (y/n)?");
        String start = scan.nextLine();
        boolean input = start.toLowerCase().equals("y");
        
        while(input == true){
            
            System.out.println("Input the name of the plant: ");
            String inputName = scan.nextLine();
            
            // make plant object using the name of plant - DONE            
            Plants inputPlant = new Plants(inputName);
            System.out.println(inputPlant.GetName());
            
            // check and see if the plant was actually made ( aka we typed in a valid name )
            // aka aka check if the getName is not null
            // if it is a valid plant ( has a name ) add to plant list
            if(inputPlant.IsValidPlant()){
                inputPlants.add(inputPlant);
                System.out.println("Added to plants list");
            }

            System.out.println("Continue? y/n: ");
            inputName = scan.nextLine();
            input = inputName.toLowerCase().equals("y");
        }
        
        for(int i = 0; i < inputPlants.size(); i++){
            
            Plants plantName = inputPlants.get(i);
            
            plantName.Instructions();
        }

        /*
        //User input water given
        System.out.println("Input cups of water given to plant (round up): ");
        water = scan.nextInt();
        
        //User input light given
        System.out.println("Input light given to plant (BRIGHT, INDIRECT, or LOW): ");
        String light = scan.nextLine();
        
        //User input if fertilizer given to plant
        System.out.println("Input if plant given fertilizer ( y/n ): ");
        String boolInput = scan.nextLine();
        boolean fertilized = false;
        if(boolInput.toLowerCase() == "y"){
            fertilized = true;
        }
        */
    }
  
    

   
}
