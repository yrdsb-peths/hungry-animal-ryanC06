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
    GreenfootImage idleRight = new GreenfootImage("hippo_sprite.png");
    GreenfootImage idleLeft = new GreenfootImage("hippo_sprite.png");
    private int counter = 0;
    
    //direction the hippo is facing 
    String facing = "left";
    
    public Hippo(){
        idleRight.scale(100,100);
        setImage(idleRight);
        
        idleLeft.scale(100,100);
        setImage(idleLeft);
        idleLeft.mirrorHorizontally();
    }
    public void act(){
        if(Greenfoot.isKeyDown("right")){
            move(5);
            facing = "right";
        }if(Greenfoot.isKeyDown("left")){
            move(-5);
            facing = "left";
        }if(Greenfoot.isKeyDown("D")){
            move(5);
            facing = "right";
        }if(Greenfoot.isKeyDown("A")){
            move(-5);
            facing = "left";
        }
        
        if(facing.equals("left")){
            setImage(idleLeft);
        }
        else if(facing.equals("right")){
            setImage(idleRight);
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
        
        if (isTouching(Strawberry.class)){
        removeTouching(Strawberry.class);
        MyWorld world = (MyWorld) getWorld();
        //world.creatStrawberry();
        hippoSound.play();
        world.gameOver();
        }
    }
}




