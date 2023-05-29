import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    int speed = 1;
    
    public int fallTime=0;     
    private int actCount=0;
    public void act(){
        if(actCount>fallTime)
        {
            setLocation(getX(),getY()+speed);   // note to self changeing the +1 to someother # will change the falling speed.
        }
        actCount++;
        
        //Remove apple and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()){
            world.gameOver();
            world.removeObject(this);
        }
        
    }
    
    public void setSpeed(int spd){
        speed=spd;
    }
}
