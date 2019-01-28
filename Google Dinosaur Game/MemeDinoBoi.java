import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MemeDinoBoi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MemeDinoBoi extends Actor
{
    /**
     * Act - do whatever the MemeDinoBoi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final int GRAVITY = 1;
    private int velocity;
    
    public MemeDinoBoi() {
        velocity = 0;
    }
    public void act() 
    {
       fall();
       if(Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight() -getWorld().getHeight()/2) {
           jump();
        }
       hitDetection();
    } 
    
    public void fall() {
        setLocation(getX(), getY() + velocity);
        if(getY() > getWorld().getHeight() -getWorld().getHeight()/2) {
            velocity = 0;
        } else {
            velocity += GRAVITY;
        }
    }
    
    public void jump() {
        velocity = -22;
    }
    
    public void hitDetection() {
        //boolean stopped = false;
        if(isTouching(Cactii.class)) {
            getWorld().removeObjects(getWorld().getObjects(null));
            
            //setImage(new GreenfootImage("GameOver!!! Press Space to restart", 35, Color.BLACK, null));
            //setLocation(getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.setWorld(new GameOver());
            
            //stopped = true;
        }
        

    }
    

}
