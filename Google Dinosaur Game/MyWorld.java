import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.lang.Math;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, false);
        GreenfootImage bob = new GreenfootImage("", 45,new Color(150, 148, 148), new Color(150, 148, 148));
        
        setBackground(bob);

        prepare();

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MemeDinoBoi memeDinoBoi = new MemeDinoBoi();
        //CurrentScore score = new CurrentScore();
        Cactii cactii = new Cactii();
        //addObject(score, getWidth() - 100, 200);
        addObject(new Cloud(), 800, 50);
        addObject(new floor(), 400,285);
        addObject(memeDinoBoi, 99, getHeight()/2);
        
        addObject(new Cactii(), 850, getHeight()/2);
        addObject(new Cactii(), 900, getHeight()/2);
        addObject(new Dirt(), 750, 500);
        addObject(new Dirt(), 2000, 475);
    }

    public void act(){
        if(getObjects(Cactii.class).get(0).getX() < -100) {
            removeObjects(getObjects(Cactii.class));
            for(int i = 0; i < (int)(Math.random() * 2) + 2; i++){
                addObject(new Cactii(), (int)(Math.random()* 110) + 850, getHeight()/2);
            }
        }
        
        addObject(new Dirt(), (int)(Math.random()* 500) + 800, (int)(Math.random() * 600) + 380);
        if(getObjects(Dirt.class).get(0).getX() < -1000) {
            //removeObjects(getObjects(Dirt.class));
            for(int i = 0; i < (int)(Math.random() * 6); i++){
                addObject(new Dirt(), (int)(Math.random()* 600) + 800, (int)(Math.random() * 800) + 380);
            }
            
        }
        
         if(getObjects(Cloud.class).get(0).getX() < -50) {
            removeObjects(getObjects(Cloud.class));
            for(int i = 0; i < (int)(Math.random() * 5) + 2; i++){
                addObject(new Cloud(), (int)(Math.random()* 110) + 1000, (int)(Math.random() * 75) + 50);
            }
        }
    }
}
