import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gnomus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gnomus extends Actor
{
    /**
     * Act - do whatever the Gnomus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    
    
    
    public void act() 
    {
        int random;
        move(5);

        if(atWorldEdge()){
            move(-5);
            setRotation();
        }   
        else{
            random = Greenfoot.getRandomNumber(100);
            if(random < 2){setRotation(getRotation() + Greenfoot.getRandomNumber(180));}
            if(random > 98){setRotation(getRotation() - Greenfoot.getRandomNumber(180));}
        }
    }
    
    
    protected void setRotation(){
            move(-5);
            if(Greenfoot.getRandomNumber(100) < 50){
                setRotation(getRotation() + Greenfoot.getRandomNumber(180));
            }
            else{
                setRotation(getRotation() - Greenfoot.getRandomNumber(180));
            }
        }

    public boolean atWorldEdge(){
        int x, y, i, wx, wy;
        //declaratie
        x = getX();
        y = getY();
        i = getImage().getWidth()/2;
        wx = getWorld().getWidth() - i;
        wy = getWorld().getHeight() - i;

        // Does Gnomus touch the left side?
        if(x <= i) {
            // Is x gelijk aan 0?
            return true;
            //Geef true terug
        }

        // Does Gnomus touch the right side?
        if(x >= wx){
            return true;
        }

        if(y <= i) {
            // Is x gelijk aan 0?
            return true;
            //Geef true terug
        }

        // Does Gnomus touch the right side?
        if(y >= wx){
            return true;
        }

        return false;
        //Dief staat niet aan een rand van de wereld dus false teruggeven

    }
    
    public Gnomus(){
    setRotation();
    }
}
