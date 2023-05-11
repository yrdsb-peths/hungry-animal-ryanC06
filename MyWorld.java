import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World {
    
    private int score = 0; 
    Label scoreLable; 
    public MyWorld() {
        super(600, 400, 1);
        //make hippo and add hippo
        Hippo hippo = new Hippo();
        addObject(hippo, 300, 300);
        
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
    }
    
    
    /**
     * Inscrease score 
     */
    public void increaseScore(){
        
        score++;
        scoreLable.setValue(score);
        
    }
    /**
     * Creat a new apple at rendom location at top of screen
     */
    public void creatApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple,x,y);
    }
    
    
    
}


