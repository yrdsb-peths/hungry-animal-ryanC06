import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hippo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hippo extends Actor
{
    GreenfootSound hippoSound = new GreenfootSound ("sound.mp3");
    //GreenfootImage idle = new GreenfootImage("hippoSprite.png");
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
        hippoSound.play();
        }
    }
}


