/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeWalk;


import org.newdawn.slick.Color;


import org.newdawn.slick.Game;


import org.newdawn.slick.GameContainer;



import static MazeWalk.MazeWalker_Lvl2.player;

import static MazeWalk.Player.chestscollected;

import org.newdawn.slick.Graphics;


import org.newdawn.slick.Input;


import org.newdawn.slick.SlickException;


import org.newdawn.slick.state.BasicGameState;


import org.newdawn.slick.state.StateBasedGame;


import org.newdawn.slick.state.transition.FadeInTransition;


import org.newdawn.slick.state.transition.FadeOutTransition;



public class win extends BasicGameState {


    


    private StateBasedGame game;


    


     public win(int xSize, int ySize) {



    }



    


    public void init(GameContainer container, StateBasedGame game)


            throws SlickException {


        this.game = game;



// TODO AutoÃ¢â‚¬Âgenerated method stub


    }



   


    public void render(GameContainer container, StateBasedGame game, Graphics g)


            throws SlickException {


// TODO AutoÃ¢â‚¬Âgenerated method stub


        g.setColor(Color.white);


        g.drawString("You Have Successfully Escaped", 380, 200);
        g.drawString("The Poisonous Maze With The Treasure", 380, 250);
        g.drawString("You Collected"+chestscollected+"/7", 380, 300);
        g.drawString("Please Restart to play again", 380, 350);


       


    }



    


    public void update(GameContainer container, StateBasedGame game, int delta)


            throws SlickException {


// TODO AutoÃ¢â‚¬Âgenerated method stub


    }



  


    public int getID() {


// TODO AutoÃ¢â‚¬Âgenerated method stub


        return 3;


    }



    @Override


    public void keyReleased(int key, char c) {


        switch (key) {


            case Input.KEY_1:

                player.health  = 1000000;
                player.speed = .06f;
                MazeWalker_Lvl1.counter = 0;
                player.x = 96f;
                player.y = 228f;
                
                
                //item.isvisible = true;
                //item1.isvisible = true;
                Itemwin.isvisible = true;
                game.enterState(1, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));


                break;


            case Input.KEY_2:


// TODO: Implement later


                break;


            case Input.KEY_3:


// TODO: Implement later


                break;


            default:


                break;


        }


    }


}
