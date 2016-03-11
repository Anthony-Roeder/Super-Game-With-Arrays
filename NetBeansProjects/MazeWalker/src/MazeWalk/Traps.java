/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeWalk;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import static MazeWalk.MazeWalker_Lvl1.player;

/**
 *
 * @author aroeder
 */
public class Traps {

    public int x;
    public int y;
    boolean[][] eblocked = blocked.getblocked();
    Shape hitbox;

    public Animation minepic, mineboom;
    private int timeExists2;

    int SIZE = 64;
    
    boolean isvisible = true;

    Animation currentAnime = new Animation();
    private boolean goboom = false;

    Traps(int a, int b) throws SlickException {
        this.x = a;
	this.y = b;
	this.hitbox = new Rectangle(a, b, 32, 32);
        this.timeExists2 = 0;
        
        


       Image mine_1 = new Image("res/traps/mine/mine_1.png");
       Image mine_2 = new Image("res/traps/mine/mine_2.png");
       Image explosion_1 = new Image("res/traps/mine/explosion_1.png");
       Image explosion_2 = new Image("res/traps/mine/explosion_2.png");
       Image explosion_3 = new Image("res/traps/mine/explosion_3.png");
       Image explosion_4 = new Image("res/traps/mine/explosion_4.png");
       Image explosion_5 = new Image("res/traps/mine/explosion_5.png");
       Image explosion_6 = new Image("res/traps/mine/explosion_6.png");
       Image explosion_7 = new Image("res/traps/mine/explosion_7.png");

        minepic = new Animation();

        minepic.setAutoUpdate(true);

        minepic.addFrame(mine_1, 500);
        minepic.addFrame(mine_2, 500);
        
        mineboom = new Animation();
        
        mineboom.setAutoUpdate(true);
      
        mineboom.addFrame(explosion_1, 100);
        mineboom.addFrame(explosion_2, 100);
        mineboom.addFrame(explosion_3, 100);
        mineboom.addFrame(explosion_4, 100);
        mineboom.addFrame(explosion_5, 100);
        mineboom.addFrame(explosion_6, 100);
        mineboom.addFrame(explosion_7, 100);
        

        

    
    }

    public int gettimeExists2(){

        return this.timeExists2;
    }
    
     public void settimeExists2(int t){
        this.timeExists2 = t;
     }
    public void countdown(){
        this.timeExists2--;
    }

   public void setboom(boolean a){
       this.goboom = a;
   }
   public boolean getboom(){
       return this.goboom;
   }
}

   


   

    


   


   


    


    

        
    

   



    

	


    

