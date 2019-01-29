import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;
/**
 * Write a description of class CurrentScore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentScore extends Actor
{
    /**
     * Act - do whatever the CurrentScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int score = 0;
    public int hscore = 0;
    private UserInfo player;

    public  CurrentScore() {
        if (UserInfo.isStorageAvailable()) {
                player = UserInfo.getMyInfo();
                player.setScore(0);//hscore
                player.store();
            }
        
    }

    public void act()
    {
        whatsDaScore();//29
        if(getWorld().getObjects(null).size() == 0) {
            highScore();
        }
    }

    public void addedToWorld(World world)
    {
        highScore();
        updateScore();
        getWorld().showText("Hi-Score: " + player.getScore(), 550,25);
        getWorld().showText("Score: " + score, 725, 25);
    }

    public void whatsDaScore() {

        long start = System.nanoTime() / 10000;
        long end = (System.nanoTime() / 10000)  - start;
        score += (int)end;
        //player.setScore(score);//43
        //player.store();
        updateScore();

    }

    public void  highScore() {
       if(getWorld().getObjects(null).size() == 0 && score > hscore) {
           hscore = score;

           player.setScore(hscore);
           player.store();
           updateScore();
           //System.out.println(player.getScore());
        }

    }

    public void updateScore() {
        getWorld().showText("Hi-Score: " + player.getScore(), 550,25);
        getWorld().showText("Score: " + score, 725, 25);
    }

}
