import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

    public void act() 
    {
        //setImage(images[action]);
        //action += increment;
    }  

    public Explosion(){
        int size = 0, baseSize, verschil, teller;
        
        images = new GreenfootImage[8];
        verschil = baseSize / 8;
        increment = 1;size = 0;
        for(teller = 0; teller < 8;teller++){
            size += verschil;
            images[teller] = new GreenfootImage(baseImage);
            images[teller].scale(size, size);
        }
    }

}
