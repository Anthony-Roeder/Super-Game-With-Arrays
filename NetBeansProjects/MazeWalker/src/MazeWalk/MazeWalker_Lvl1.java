package MazeWalk;



import java.util.ArrayList;


import org.newdawn.slick.Color;

import org.newdawn.slick.AppGameContainer;


import org.newdawn.slick.GameContainer;

import org.newdawn.slick.Graphics;


import org.newdawn.slick.Input;

import org.newdawn.slick.SlickException;

import org.newdawn.slick.SpriteSheet;


import org.newdawn.slick.state.BasicGameState;

import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

import org.newdawn.slick.tiled.TiledMap;

class blocked {

	public static boolean[][] blocked;

	public static boolean[][] getblocked() {

		return blocked;

	}

};




public class MazeWalker_Lvl1 extends BasicGameState {

	
	public Item1 healthpotion, healthpotion1;
	public Itemwin antidote;
        public static Player player;
        public Orb magic8ball, orb1;
        public Enemy one;
        public Enemy two;
        public Enemy three;
        public Enemy four;
        public Enemy five;
        public Enemy six;
        public Enemy seven;
        public Enemy eight;
        public Treasure money;
       
        
        public ArrayList <Enemy> Enemyz = new ArrayList();
        
        public ArrayList <Treasure> moneyz = new ArrayList();

	public ArrayList<Item1> stuff = new ArrayList();


	
	public ArrayList<Itemwin> stuffwin = new ArrayList();
        
        

	private boolean[][] hostiles;

	private static TiledMap grassMap;

	private static AppGameContainer app;

	private static Camera camera;
	
	public static int counter = 0;

	// Player stuff

	//private Animation sprite, up, down, left, right, wait;

	/**
	 * 
	 * The collision map indicating which tiles block movement - generated based
	 * 
	 * on tile properties
	 */

	// changed to match size of sprites & map

	private static final int SIZE = 64;

	// screen width and height won't change

	private static final int SCREEN_WIDTH = 1000;

	private static final int SCREEN_HEIGHT = 750;

	public MazeWalker_Lvl1(int xSize, int ySize) {

	}

	public void init(GameContainer gc, StateBasedGame sbg)

	throws SlickException {
		
		 gc.setTargetFrameRate(60);
 
		gc.setShowFPS(false);

		// *******************

		// Scenerey Stuff

		// ****************

		grassMap = new TiledMap("res/SlickExam.tmx");

		// Ongoing checks are useful

		

		camera = new Camera(gc, grassMap);
                
                player = new Player();

		// *********************************************************************************

		// Player stuff --- these things should probably be chunked into methods
		// and classes

		// *********************************************************************************

		

		// System.out.println("Horizontal count: "
		// +runningSS.getHorizontalCount());

		// System.out.println("Vertical count: " +runningSS.getVerticalCount());

		

		// *****************************************************************

		// Obstacles etc.

		// build a collision map based on tile properties in the TileD map

		blocked.blocked = new boolean[grassMap.getWidth()][grassMap.getHeight()];

		// System.out.println("Map height:" + grassMap.getHeight());

		// System.out.println("Map width:" + grassMap.getWidth());

		// There can be more than 1 layer. You'll check whatever layer has the
		// obstacles.

		// You could also use this for planning traps, etc.

		// System.out.println("Number of tile layers: "
		// +grassMap.getLayerCount());

		

		for (int xAxis = 0; xAxis < grassMap.getWidth(); xAxis++) {

			for (int yAxis = 0; yAxis < grassMap.getHeight(); yAxis++) {

				// int tileID = grassMap.getTileId(xAxis, yAxis, 0);

				// Why was this changed?

				// It's a Different Layer.

				// You should read the TMX file. It's xml, i.e.,human-readable
				// for a reason

				int tileID = grassMap.getTileId(xAxis, yAxis, 1);

				String value = grassMap.getTileProperty(tileID,

				"blocked", "false");

				if ("true".equals(value)) {

					

					blocked.blocked[xAxis][yAxis] = true;

				}

			}

		}

		

		// A remarkably similar process for finding hostiles

		
					
				
			
		
		
		
					
		
		

	         one = new Enemy(50,50);
                 two = new Enemy(629,1513);
                 three = new Enemy(839,2242);
                 four = new Enemy (597,3824);
                 five = new Enemy (1017,2975);
                 six = new Enemy (1187,4634);
                 seven = new Enemy (1883,1917);
                 eight = new Enemy (4076,201);
                 Enemyz.add(one);
                 Enemyz.add(two);
                 Enemyz.add(three);
                 Enemyz.add(four);
                 Enemyz.add(five);
                 Enemyz.add(six);
                 Enemyz.add(seven);
                 Enemyz.add(eight);
                 money = new Treasure(603,4473);	
                 moneyz.add(money);
                
                healthpotion = new Item1(100, 100);
		healthpotion1 = new Item1(450, 400);
		stuff.add(healthpotion);
		stuff.add(healthpotion1);
                orb1 = new Orb((int) player.x + 5, (int) player.y - 5);
               
               
		
		antidote = new Itemwin(4454,184);
		stuffwin.add(antidote);
                
               
                
             
                
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)

	throws SlickException {

		camera.centerOn((int) player.x, (int) player.y);

		camera.drawMap();

		camera.translateGraphics();
                
               

		// it helps to add status reports to see what's going on

		// but it gets old quickly

		// System.out.println("Current X: " +player.x + " \n Current Y: "+ y);

		player.sprite.draw((int) player.x, (int) player.y);
		
		//g.drawString("x: " + (int)Player.x + "y: " +(int)Player.y , Player.x, Player.y - 10);

		g.drawString("Health: " + player.health/1000, camera.cameraX + 10,
				camera.cameraY + 10);

		//g.draw(player.rect);

		g.drawString("time passed: " +counter/1000, camera.cameraX +600,camera.cameraY );
		// moveenemies();

		for (Item1 i : stuff) {
			if (i.isvisible) {
				i.currentImage.draw(i.x, i.y);
				// draw the hitbox 
				//g.draw(i.hitbox);
              

			}
		}
		
		
		
				// draw the hitbox
				//g.draw(h.hitbox)
		
               
		for (Itemwin w: stuffwin) {
			if (w.isvisible) {
				w.currentImage.draw(w.x, w.y);
				// draw the hitbox
				//g.draw(w.hitbox);

			}
		}
               
                if (orb1.isIsVisible()) {
                    orb1.orbpic.draw(orb1.getX(), orb1.getY());
                }
                
                for (Enemy e: Enemyz) {
			if (e.isvisible) {
				e.currentanime.draw(e.Bx, e.By);
				// draw the hitbox
				//g.draw(w.hitbox);
                for (Treasure t: moneyz) {
			if (t.isvisible) {
				t.currentImage.draw(t.x, t.y);
             
            //    }                
                   
                
                                
              

			}
		}

                }
                }
        }
                
        

	public void update(GameContainer gc, StateBasedGame sbg, int delta)

	throws SlickException {
		
		counter += delta;

		Input input = gc.getInput();

		float fdelta = delta * player.speed;

		player.setpdelta(fdelta);

		double rightlimit = (grassMap.getWidth() * SIZE) - (SIZE * 0.75);

		// System.out.println("Right limit: " + rightlimit);

		float projectedright = player.x + fdelta + SIZE;

		boolean cangoright = projectedright < rightlimit;
                
                for (Enemy e : Enemyz){
                    
                    
                    e.move();
                    

		// there are two types of fixes. A kludge and a hack. This is a kludge.

		if (input.isKeyDown(Input.KEY_UP)) {
                        player.setDirection(0);   
			player.sprite = player.up;

			float fdsc = (float) (fdelta - (SIZE * .15));

			if (!(isBlocked(player.x, player.y - fdelta) || isBlocked((float) (player.x + SIZE + 1.5), player.y - fdelta))) {

				player.sprite.update(delta);

				// The lower the delta the slower the sprite will animate.

				player.y -= fdelta;

			}

		} else if (input.isKeyDown(Input.KEY_DOWN)) {
                        player.setDirection(2);
			player.sprite = player.down;

			if (!isBlocked(player.x, player.y + SIZE + fdelta)

			|| !isBlocked(player.x + SIZE - 1, player.y + SIZE + fdelta)) {

				player.sprite.update(delta);

				player.y += fdelta;

			}

		} else if (input.isKeyDown(Input.KEY_LEFT)) {
                        player.setDirection(3);
			player.sprite = player.left;

			if (!(isBlocked(player.x - fdelta, player.y) || isBlocked(player.x

			- fdelta, player.y + SIZE - 1))) {

				player.sprite.update(delta);

				player.x -= fdelta;

			}

		} else if (input.isKeyDown(Input.KEY_RIGHT)) {
                        player.setDirection(1);
			player.sprite = player.right;

			// the boolean-kludge-implementation

			if (cangoright
					&& (!(isBlocked(player.x + SIZE + fdelta,

					player.y) || isBlocked(player.x + SIZE + fdelta, player.y
							+ SIZE - 1)))) {

				player.sprite.update(delta);

				player.x += fdelta;

			} // else { System.out.println("Right limit reached: " +
				// rightlimit);}

		} else if (input.isKeyPressed(Input.KEY_SPACE)){
                    //orb1.setLocation(player.x, player.y);
                    orb1.setDirection(player.getDirection());
                    orb1.settimeExists(1000);
                    orb1.setX((int)player.x);
                    orb1.setY((int) player.y);
                    orb1.hitbox.setX(orb1.getX());
                    orb1.hitbox.setY(orb1.getY());
                    orb1.setIsVisible(!orb1.isIsVisible());
                    //magic8ball.setIsVisible(true);
                    
                }

		player.rect.setLocation(player.getPlayershitboxX(),
				player.getPlayershitboxY());

		for (Item1 i : stuff) {

			if (player.rect.intersects(i.hitbox)) {
				//System.out.println("yay");
				if (i.isvisible) {

					player.health += 1000;
					i.isvisible = false;
				}

			}
		}
               
                
                for (Treasure t : moneyz) {

			if (player.rect.intersects(t.hitbox)) {
				//System.out.println("yay");
				if (t.isvisible) {

					t.isvisible = false;
				}

			}
		}
                

			if (player.rect.intersects(e.rect)) {
				//System.out.println("yay");
				if (e.isvisible) {

					player.health -= 25000;
					e.isvisible = false;
				}

			}
		
		
		
		for (Itemwin w : stuffwin) {

			if (player.rect.intersects(w.hitbox)) {
				//System.out.println("yay");
				if (w.isvisible) {
					w.isvisible = false;
					makevisible();
					sbg.enterState(4, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
					
				}

			}
		}
                 for (Enemy y :Enemyz) {
                    if(orb1.hitbox.intersects(y.rect)){
                        y.isvisible = false;
                    }
                }
                 
                 if(orb1.isIsVisible()) {
                     if (orb1.gettimeExists() > 0){
                         if (player.getDirection() == 0){
                             
                             orb1.setX((int) player.x);
                             orb1.setY(orb1.getY() - 5);
                         } else if (player.getDirection() == 2){
                         orb1.setX ((int) player.x);
                         orb1.setY(orb1.getY() + 5);
                         }else if (player.getDirection() == 3){
                         orb1.setX(orb1.getX() - 5);
                         orb1.setY(orb1.getY());
                     }else if (player.getDirection() == 1){
                     orb1.setX(orb1.getX() + 5);
                     orb1.setY(orb1.getY());
                 }
                 
                 orb1.hitbox.setX(orb1.getX());
                 orb1.hitbox.setY(orb1.getY());
                 orb1.countdown();
                     } else {
                 
                 orb1.setIsVisible(false);
                     }
                 }
        
               
		if(player.health <= 0){    
			makevisible();
			sbg.enterState(2, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
		}

                }
        }
        

	public int getID() {
            
		return 1;

	}

	public void makevisible(){ 
		for (Item1 i : stuff) {
			
			i.isvisible = true;}
		}
	
	private boolean isBlocked(float tx, float ty) {

		int xBlock = (int) tx / SIZE;

		int yBlock = (int) ty / SIZE;

		return blocked.blocked[xBlock][yBlock];

		// this could make a better kludge

	}

}
