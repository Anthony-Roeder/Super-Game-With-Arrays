package MazeWalk;
import java.util.ArrayList;
import org.newdawn.slick.Color;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.tiled.TiledMap;
class blocked2 {
	public static boolean[][] blocked2;
	public static boolean[][] getblocked() {
		return blocked2;
	}
};
public class MazeWalker_Lvl2 extends BasicGameState {
	public Item1 healthpotion, healthpotion1, healthpotion2, healthpotion3, healthpotion4, healthpotion5, healthpotion6, healthpotion7;
	public win2 antidote2;
        public static Player player;
        public Orb magic8ball, orb1;
        public Enemy one, two, three, four, five, six, seven, eight;
        public Treasure money1, money2, money3, money4, money5, money6, money7;
        public Traps mine1, mine2, mine3, mine4, mine5 , mine6, mine7, mine8, mine9, mine10, mine11, mine12, mine13, mine14;
        public ArrayList <Enemy> Enemyz = new ArrayList();
        public ArrayList <Treasure> moneyz = new ArrayList();
        public ArrayList<Item1> stuff = new ArrayList();
        public ArrayList<Traps> minez = new ArrayList();
	public ArrayList<win2> stuffwin2 = new ArrayList();
       	private boolean[][] hostiles;
	private static TiledMap grassMap2;
	private static AppGameContainer app;
	private static Camera camera;
	public static int counter = 0;
        private static final int SIZE = 64;
	private static final int SCREEN_WIDTH = 1000;
	private static final int SCREEN_HEIGHT = 750;
	public MazeWalker_Lvl2(int xSize, int ySize) {
	}
	public void init(GameContainer gc, StateBasedGame sbg)
	throws SlickException {	
		 gc.setTargetFrameRate(60);
		gc.setShowFPS(false);
		grassMap2 = new TiledMap("res/SlickExam2.tmx");	
		camera = new Camera(gc, grassMap2);
                player = new Player();   
                blocked2.blocked2 = new boolean[grassMap2.getWidth()][grassMap2.getHeight()];
		for (int xAxis = 0; xAxis < grassMap2.getWidth(); xAxis++) {
			for (int yAxis = 0; yAxis < grassMap2.getHeight(); yAxis++) {
				int tileID = grassMap2.getTileId(xAxis, yAxis, 1);
				String value = grassMap2.getTileProperty(tileID,
				"blocked2", "false");
				if ("true".equals(value)) {				
					blocked2.blocked2[xAxis][yAxis] = true;
				}

			}
                }					
		antidote2 = new win2(3983,544); stuffwin2.add(antidote2);
		mine1 = new Traps(60,160); mine2 = new Traps(303,483);
                mine3 = new Traps(192, 1691); mine4 = new Traps(679, 1120);
                mine5 = new Traps(1393, 960); mine6 = new Traps(2825,104);
                mine7 = new Traps(1817,1760); mine8 = new Traps(2496, 2782);
                mine9 = new Traps(3440, 2592); mine10 = new Traps(2028, 2688);
                mine11 = new Traps(2068,2592); mine12 = new Traps(2564, 2784);
                mine13 = new Traps(2176, 2191); mine14 = new Traps(2239, 2191); 
                minez.add(mine1); minez.add(mine2); minez.add(mine3);
                minez.add(mine4); minez.add(mine5); minez.add(mine6);
                minez.add(mine7); minez.add(mine8); minez.add(mine9);
                minez.add(mine10); minez.add(mine11); minez.add(mine12);
                minez.add(mine13); minez.add(mine14);
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
                 money1 = new Treasure(100,500);
                 money2 = new Treasure(1251,2519);
                 money3 = new Treasure(4271,256);
                 money4 = new Treasure(3767,104);
                 money5 = new Treasure(1956, 2600);
                 money6 = new Treasure(4096,2439);
                 money7 = new Treasure(2216, 2071);
                 moneyz.add(money1);
                 moneyz.add(money2);
                 moneyz.add(money3);
                 moneyz.add(money4);
                 moneyz.add(money5);
                 moneyz.add(money6);
                 moneyz.add(money7);
                healthpotion = new Item1(100, 100);
		healthpotion1 = new Item1(450, 400);
                healthpotion2 = new Item1(125, 500);
                healthpotion3 = new Item1(1276, 2519);
                healthpotion4 = new Item1(4296, 256);
                healthpotion5 = new Item1(3792, 104);
                healthpotion6 = new Item1(4120, 2439);
                healthpotion7 = new Item1(2239, 2071);
		stuff.add(healthpotion);
		stuff.add(healthpotion1);
                stuff.add(healthpotion2);
                stuff.add(healthpotion3);
                stuff.add(healthpotion4);
                stuff.add(healthpotion5);
                stuff.add(healthpotion6);
                stuff.add(healthpotion7);
                orb1 = new Orb((int) player.x + 5, (int) player.y - 5);
   }
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
	throws SlickException {
		camera.centerOn((int) player.x, (int) player.y);
		camera.drawMap();
		camera.translateGraphics();
		player.sprite.draw((int) player.x, (int) player.y);
		g.drawString("Health: " + player.health/1000, camera.cameraX + 10,camera.cameraY + 10);
                g.drawString("Chests Collected: " + player.getChestscollected(), camera.cameraX + 10, camera.cameraY + 25);
		g.drawString("time passed: " +counter/1000, camera.cameraX +600,camera.cameraY );
		for (Item1 i : stuff) {
			if (i.isvisible) {
				i.currentImage.draw(i.x, i.y);
			}
		}
		for (win2 w: stuffwin2) {
			if (w.isvisible) {
				w.currentImage.draw(w.x, w.y);
			}
		}
                 if (orb1.isIsVisible()) {
                    orb1.orbpic.draw(orb1.getX(), orb1.getY());
                }
                for (Enemy e: Enemyz) {
			if (e.isvisible) {
				e.currentanime.draw(e.Bx, e.By);
                for (Treasure t: moneyz) {
			if (t.isvisible) {
				t.currentImage.draw(t.x, t.y);
                for (Traps r: minez){
                        if (r.getboom() && r.gettimeExists2() > 0){
                                r.mineboom.draw(r.x, r.y);
                                r.countdown();
                 }
                        else if (r.isvisible){
                r.minepic.draw(r.x, r.y);
                         }
                }
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
		double rightlimit = (grassMap2.getWidth() * SIZE) - (SIZE * 0.75);
		float projectedright = player.x + fdelta + SIZE;
		boolean cangoright = projectedright < rightlimit;
                for (Enemy e : Enemyz){
                e.move();
                if (input.isKeyDown(Input.KEY_UP)) {
                        player.setDirection(0);   
			player.sprite = player.up;
			float fdsc = (float) (fdelta - (SIZE * .15));
			if (!(isBlocked(player.x, player.y - fdelta) || isBlocked((float) (player.x + SIZE + 1.5), player.y - fdelta))) {
				player.sprite.update(delta);
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
			if (cangoright
					&& (!(isBlocked(player.x + SIZE + fdelta,
					player.y) || isBlocked(player.x + SIZE + fdelta, player.y
							+ SIZE - 1)))) {
				player.sprite.update(delta);
				player.x += fdelta;
			} 
		} else if (input.isKeyPressed(Input.KEY_SPACE)){
                    //orb1.setLocation(player.x, player.y);
                    orb1.setDirection(player.getDirection());
                    orb1.settimeExists(1000);
                    orb1.setX((int)player.x);
                    orb1.setY((int) player.y);
                    orb1.hitbox.setX(orb1.getX());
                    orb1.hitbox.setY(orb1.getY());
                    orb1.setIsVisible(!orb1.isIsVisible());
                }
		player.rect.setLocation(player.getPlayershitboxX(),
				player.getPlayershitboxY());
		for (Item1 i : stuff) {
			if (player.rect.intersects(i.hitbox)) {
				//System.out.println("yay");
				if (i.isvisible) {
					player.health += 100000;
					i.isvisible = false;
				}
			}
		}
                for (Traps r : minez){
                    if (player.rect.intersects(r.hitbox)) {                    
                        player.health -= 1000;    
                        r.setboom(true);
                        r.settimeExists2(50);
                        r.isvisible = false;
                    }
                }
                for (Treasure t : moneyz) {
			if (player.rect.intersects(t.hitbox)) {
				//System.out.println("yay");
				if (t.isvisible) {
                                     player.chestscollected += 1;
					t.isvisible = false;
				}
			}
		}               
			if (player.rect.intersects(e.rect)) {
				//System.out.println("yay");
				if (e.isvisible) {
					player.health -= 250;				
				}
			}	
		for (win2 w : stuffwin2) {
			if (player.rect.intersects(w.hitbox)) {
				//System.out.println("yay");
				if (w.isvisible) {
					w.isvisible = false;
					makevisible();
					sbg.enterState(3, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));				
				}
			}
		}
                if(player.health <= 0){    
			makevisible();
			sbg.enterState(2, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));            
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
                }
         }
                
               
        public int getID() {           
		return 4;
	}
	public void makevisible(){ 
		for (Item1 i : stuff) {		
			i.isvisible = true;}
		}
	private boolean isBlocked(float tx, float ty) {
		int xBlock = (int) tx / SIZE;
		int yBlock = (int) ty / SIZE;
		return blocked2.blocked2[xBlock][yBlock];
	}
}
    

