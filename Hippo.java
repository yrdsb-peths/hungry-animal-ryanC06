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
    public void act(){
        if(Greenfoot.isKeyDown("right")){
            move(3);
        }if(Greenfoot.isKeyDown("left")){
            move(-3);
        }
        //Remove apple if elephate eats it 
        eat();
    }
    
    /**
     * Eat the apple and span new apple if an aplle is eaten 
     */
    public void eat(){
        
        if (isTouching(Apple.class)){
        removeTouching(Apple.class);
        MyWorld world = (MyWorld) getWorld();
        world.creatApple();
        world.increaseScore();
        }
    }
}


