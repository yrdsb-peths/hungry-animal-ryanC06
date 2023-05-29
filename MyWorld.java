import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World {
    
    private int Score = 0; 
    Label scoreLable; 
    int level = 1;
    public MyWorld() {
        super(600, 400, 1, false);
        //make hippo and add hippo
        Hippo hippo = new Hippo();
        addObject(hippo, 300, 300);
        
        GreenfootImage bg = new GreenfootImage("images/background2.jpg");
        setBackground(bg);
        
        // creat a label 
        scoreLable = new Label(0, 80);
        addObject(scoreLable, 50 , 50);
        
        
        creatApple();
        
    }
    
    /**
     * End the game and Draw "GameOver"
     */
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        Greenfoot.stop();
    }
    /**
     * Inscrease score 
     */
    public void increaseScore(){
        
        Score++;
        scoreLable.setValue(Score);
        
        if(Score % 5 == 0){
            level += 1;
        }
        if(Score % 2 ==0){
            creatStrawberry();
        }
    }
    /**
     * Creat a new apple at rendom location at top of screen
     */
    public void creatApple(){
        Apple apple = new Apple();
        apple.setSpeed (level);
        int x = Greenfoot.getRandomNumber(500);
        int y = 0;
        addObject(apple,x,y);
    }
    
    public void creatStrawberry(){
        Strawberry strawberry = new Strawberry();
        strawberry.setSpeed (level+=1);
        int x = Greenfoot.getRandomNumber(500);
        int y = 0;
        addObject(strawberry,x,y);
    }

}


