import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Garp extends Actor
{
    int  speed = 2;
    private GreenfootImage imageLeft;
    private GreenfootImage imageRight;
    /**
     * Act - do whatever the Garp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public Garp(){
    
    imageLeft = new GreenfootImage("GarpLeft.png");
    imageRight = new GreenfootImage("GarpRight.png");
    }
    
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")){
            if(getImage() == imageLeft){
             setImage(imageRight);   
            }
            setRotation(-90);
            move(speed);
            
        }
        
        if(Greenfoot.isKeyDown("down")){
            if(getImage() == imageLeft){
             setImage(imageRight);   
            }
            setRotation(90);
            move(speed);
            
        }
        
        
        if(Greenfoot.isKeyDown("left")){
            if(getImage() == imageRight){
            setImage(imageLeft);
        }
            setRotation(0);
            move(-speed);
        }
        
        if(Greenfoot.isKeyDown("right")){
            if(getImage() == imageLeft){
             setImage(imageRight);   
            }
            setImage(imageRight);
            setRotation(0);
            move(speed);
        }
    }    
}
