import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dirt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dirt extends Actor
{
    /**
     * Act - do whatever the Dirt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    }    
    
    public void move() {
        int x = getX();
       int y = getY();
       
       x -= 10;
       
       setLocation(x, y);
    }
}
