import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strawberry extends Actor
{
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    public int fallTime = 0 ;
    private int actCount = 0;
    public void act()
    {
        if(actCount>fallTime){
            setLocation(getX(),getY()+speed); 
        }
        
        actCount++;
        
        //Remove Strawberry and draw game over when Strawberry gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()){
            
            world.removeObject(this);
            
        }
        
    
    }
    public void setSpeed(int spd){
        speed=spd;
    }
}
