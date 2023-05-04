import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World {
    
    private int count = 0; // variable to store the count
    
    public MyWorld() {
        super(600, 400, 1);
        Hippo hippo = new Hippo();
        addObject(hippo, 50, 350);
        Apple apple = new Apple();
        addObject(apple, 100, 100);
    }
    
}

