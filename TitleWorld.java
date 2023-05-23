import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TitleWorld extends World
{

    Label titleLabel = new Label ("Hungry Hippo",60);
    Label label = new Label ("Use A -- and D to Move",60); 
    public TitleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        
        GreenfootImage bg = new GreenfootImage("images/background3.jpg");
        setBackground(bg);
        bg.scale(600,400);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld (gameWorld);
        }
    }
}
