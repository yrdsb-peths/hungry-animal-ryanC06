import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World {
    
    private int count = 0; 
    //System.Logger.Level countLabel;
    int level = 1;
    int eleSpeed = 2;
    
    public MyWorld() {
        super(600, 400, 1);
        //make hippo
        Hippo hippo = new Hippo();
        //add count lable 
        //countLabel Level = new Level (0,80);
        // add hippo
        addObject(hippo, 50, 350);
        //make and add apple 
        Apple apple = new Apple();
        addObject(apple, 100, 100);
    }
    
}


