import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hippo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hippo extends Actor
{
    /**
     * Act - do whatever the Hippo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter = 0;
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
            move(3);
        }if(Greenfoot.isKeyDown("left")){
            move(-3);
        }if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 3);
        }if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 3);
        }
        
        if (isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            //if (++countCollected == 3) getWorld().removeObject(this);
        }
        

    }
}


