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
    public int hscore;
    private UserInfo player;

    public  CurrentScore() {
        if (UserInfo.isStorageAvailable()) {
                player = UserInfo.getMyInfo();
                player.getScore();//hscore
                player.store();
            }
        hscore = player.getScore();
    }

    public void act()
    {
        whatsDaScore();//29
        highScore();
    }

    public void addedToWorld(World world)
    {
        highScore();
        updateScore();
        getWorld().showText("Hi-Score: " + highScore(), 550,25);
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
    
    
    public int  highScore() {
       if(getWorld().getObjects(null).size() == 0 && score > hscore) {
           player.setScore(score);//sets highscore
           player.store();
           hscore = score;
           updateScore();
           
           //System.out.println(player.getScore());
        }
        if(score > hscore) {
           player.setScore(score);
           player.store();
           updateScore();
        }
        return hscore;
    }

    public void updateScore() {
        getWorld().showText("Hi-Score: " + player.getScore(), 550,25);
        getWorld().showText("Score: " + score, 725, 25);
    }

}
