import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * My first Greenfoot project.
 * 
 * @author: Daan Klein
 * @version: v1.0
 */
public class GarpsWorld extends World
{
    
private GreenfootSound sound;



    /**
     * Constructor for objects of class GarpsWorld.
     * 
     */
    public GarpsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        populateTheWorld();
        sound = new GreenfootSound("septic_shock_c418.mp3");

    }

    
    public void started(){
        sound.playLoop(); 
    }
    protected void populateTheWorld(){
        //addObject(new Garp(), getWorld().getWidth()/2, getWorld().getHeight() / 2);
        addObject(new Garp(), 200, 200);
        addObject(new Gnomus(),Greenfoot.getRandomNumber(370)+15,
            Greenfoot.getRandomNumber(370)+15);

        for(int i = 0; i < 10; i++){
            addObject(new Diamond(),Greenfoot.getRandomNumber(400),
                Greenfoot.getRandomNumber(400));
        }
        
        for(int j = 0; j < 5; j++){
            addObject(new Rock(),Greenfoot.getRandomNumber(400),
                Greenfoot.getRandomNumber(400));
        }
        
        for(int j = 0; j < 4; j++){
            addObject(new Bomb(),Greenfoot.getRandomNumber(400),
                Greenfoot.getRandomNumber(400));
        }
        
    }
}
