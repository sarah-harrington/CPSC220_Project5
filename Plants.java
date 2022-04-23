
/**
 * Define the Biome and Light types
 * Each plant name has a method containing its needs 
 * To be called in CareInstructions for comparison to care given input by user
 *
 * @Sarah Schindler
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Plants
{
    public enum Light {BRIGHT, INDIRECT, LOW}

    // instance variables 
    private String name;
    private int waterNeeds;
    private Light lightNeeds;
    private boolean fertilized;    
  
    public Plants(){
        //default constructor
    }
    
    public Plants(String inputName)
    {
        
        
        if(inputName.equals("snake plant")){
            SnakePlant();
        }
        
        else if(inputName.equals("pothos")){
            Pothos();
        }
        
        else if(inputName.equals("monstera")){
            Monstera();
        }
        
        else if(inputName.equals("cactus")){
            Cactus();
        }
        
        else if(inputName.equals("orchid")){
            Orchid();
        }
        
    }
    
    public String GetName(){
        return name;
    }
    
    public boolean IsValidPlant(){
        // check if its a valid plant ( aka all the stuff is filled in right )
        boolean output = false;
        
        try{
            if(name.length() > 0){
                output = true;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return output;
    }
    
    // make public method that returns care instructions
    public void Instructions()
    {
        System.out.println("Recommended care for " + name + " plant: ");
        System.out.println(waterNeeds + " cups of water");
        System.out.println(lightNeeds + " light");
        System.out.println("Needs fertilizer: " + fertilized);
    }
    
    private void SnakePlant()
    {
        name = "Snake Plant";
        waterNeeds = 1;
        lightNeeds = Light.LOW;
        fertilized = false;
    }
    
    public void Pothos()
    {
        name = "Pothos";
        waterNeeds = 2;
        lightNeeds = Light.INDIRECT;
        fertilized = false;
    }
    
    public void Monstera()
    {
        name = "Monstera";
        waterNeeds = 5;
        lightNeeds = Light.BRIGHT;
        fertilized = true;
    }
    
    public void Cactus()
    {
        name = "Cactus";
        waterNeeds = 1;
        lightNeeds = Light.BRIGHT;
        fertilized = false;
    }
    
    public void Orchid()
    {
        name = "Orchid";
        waterNeeds = 3;
        lightNeeds = Light.BRIGHT;
        fertilized = true;
    }
}
