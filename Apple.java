import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int fallTime=0;     
    private int actCount=0;
    public void act(){
        if(actCount>fallTime)
        {
            setLocation(getX(),getY()+1);   // note to self changeing the +1 to someother # will change the falling speed.
        }
        actCount++;
        
    }
}
