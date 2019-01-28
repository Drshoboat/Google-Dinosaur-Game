import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactii here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactii extends Actor
{
    /**
     * Act - do whatever the Cactii wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    
    public void act() 
    {
        // when game starts wait 5 secs, start moving left, move in groups of 2, 3, || 4
        move();
    }
   
    
    public void move() {
       int x = getX();
       int y = getY();
       
       x -= 8;
       
       setLocation(x, y);
    }
    
    
}
