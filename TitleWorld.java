import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TitleWorld extends World
{

    Label titleLabel = new Label ("Hungry Hippo",60);
    Label label = new Label ("Use A -- and D -- to Move",30); 
    Label labelc = new Label ("Press <space> to Start",30);
    public TitleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 295, 60);

        addObject(label, 295, 320);
        addObject(labelc, 295, 350);

        GreenfootImage bg = new GreenfootImage("images/background3.jpg");
        setBackground(bg);
        bg.scale(600,400);
        prepare();
    }

    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld (gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
}
