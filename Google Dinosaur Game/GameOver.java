import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    private UserInfo player;
    public int playerHiScore;
    /**
     * Constructor for objects of class GameOver.
     *
     */
    public GameOver()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        if(UserInfo.isStorageAvailable()) {
            player = UserInfo.getMyInfo();
        }
        act();
        showScore();
    }
    public void showScore(){
        playerHiScore = player.getScore();
        showText("" + playerHiScore,400,250);
    }
    

    
    public void act() {
        if(Greenfoot.isKeyDown("space")) {
            Greenfoot.delay(0);
            Greenfoot.setWorld(new MyWorld());
            showScore();
            
        }
    }
}
