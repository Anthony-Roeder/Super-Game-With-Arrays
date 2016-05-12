/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10x10.pkg2d.arrays;


import java.util.Random;
import java.util.Scanner;

import static pkg10x10.pkg2d.arrays.Arrays.move;

public class Arrays {

    static Scanner direct = new Scanner(System.in);
    static Random randy = new Random() ;
    static String XnY;
    static boolean answer;
    static boolean answer2;
    public static int maxX = 40;
    public static int maxY = 40;
    static int enemyX = randy.nextInt(40);
    static int enemyY = randy.nextInt(40);;
    static int enemyX2 = randy.nextInt(40);;
    static int enemyY2 = randy.nextInt(40);;
    static int enemyX3 = randy.nextInt(40);;
    static int enemyY3 = randy.nextInt(40);;
    static int TreasureX = randy.nextInt(40);
    static int TreasureY = randy.nextInt(40);
    static String move;
    static Scanner whichway = new Scanner(System.in);
    static int TrapX = randy.nextInt(40);
    static int TrapY = randy.nextInt(40);
    static int TrapX2 = randy.nextInt(40);
    static int TrapY2 = randy.nextInt(40);
    static int TrapX3 = randy.nextInt(40);
    static int TrapY3 = randy.nextInt(40);
    

    
    Hero hero= new Hero();

    public static void main(String[] args) {
        start();
        while(true){
        MAKE();
        
     
        
        }
        
       
    }
    
    public static void start() {
        System.out.println("You can move you player by using the number pad.");
        System.out.println("For example 8 is up and 1 for downleft etc..");           
       
    }
        
   


    public static void MAKE() {
        char[][] game = new char[40][40];
        game[enemyX][enemyY]= 'x';
        game[enemyX2][enemyY2]= 'x';
        game[enemyX3][enemyY3]= 'x';
        game[TreasureX][TreasureY]= 'T';
        game[TrapX][TrapY] = '0';
        game[TrapX2][TrapY2] = '0';
        game[TrapX3][TrapY3] = '0';
        game[Hero.x][Hero.y]= '@';            
        for (int i = 0; i <= game[0].length - 1; i++) {
            for (int j = 0; j <= game[1].length - 1; j++) {
                if (j < game[1].length - 1) {
                    if (game[i][j] != '@' && game[i][j] !='x'&& game [i][j] != 'T' && game [i][j] != '0' ) {
                        System.out.print(" ");
                    } else {
                        System.out.print(game[i][j]);
                    }
                } else {
                   if (game[i][j] != '@' && game[i][j] !='x'&& game [i][j] != 'T') {

                        System.out.println(" ");
                    } else {
                        System.out.println(game[i][j]);
                    }
                }
            }
        }
        
        answer=false;
        Move();
        enemymove();
        GameOver();
        
    }

//    public static void Input() {
//        while (!answer) {//#while
//            System.out.println("A 10x10 Array has been made please choose your coordinates in the Array.");
//            System.out.println("For example 0,9");
//            XnY = direct.nextLine().toLowerCase();
//         
//                String[] parts = XnY.split(",");
//                playerX = Integer.parseInt(parts[0]);
//                playerY = Integer.parseInt(parts[1]);
//                System.out.println("Move to coordinates " + playerX + "," + playerY);
//                answer= true;
//      
//            }
//        Move();
//        }

     public static void Move() {
         while(!answer){
         move = whichway.nextLine().toLowerCase();
         if(move.contains("9")) {
         Hero.x--;
         Hero.y++;
         answer=true;
     }       else if (move.contains("3")){
             Hero.x ++;
             Hero.y++;
             answer=true;
             } else if (move.contains("1")) {
             Hero.x++;
             Hero.y--; 
             answer=true;
             } else if (move.contains("7")) {
                 Hero.y--;
                 Hero.x--;
                 answer=true;
             } else if (move.contains("8")){
                 Hero.x--; 
                 
                 answer=true;
             } else if (move.contains("4")){
                 Hero.y--;
                 answer=true;
             } else if (move.contains("2")){
                 Hero.x ++; 
                 
                 answer=true;
             } else if (move.contains("6")) {
                 Hero.y++; 
                 
                 answer=true;
             }  else  {
                 System.out.println("Please pick a direction");
                         
                      
             }
         
         }
         
     }
     public static void enemymove() {
    if(Hero.x > enemyX) {
    enemyX++;
    } else if (Hero.x < enemyX){
    enemyX--;
    } if (Hero.y > enemyY) {
    enemyY++;
    }  if (Hero.y < enemyY) {
    enemyY--;
    }  if (Hero.x > enemyX2) {
  enemyX2 ++;  
    }  if (Hero.x < enemyX2){
    enemyX2 --;
    }  if (Hero.y < enemyY2){
    enemyY2--;
    }  if (Hero.y > enemyY2) {
    enemyY2++;
    }  if (Hero.y < enemyY3) {
    enemyY3--;
    }  if (Hero.y > enemyY3) {
  enemyY3 ++;  
    }  if (Hero.x < enemyX3){
    enemyX3 --;
    }
    
     }

    public static void GameOver(){
        if (Hero.x == enemyX && Hero.y == enemyY) {
             System.out.println("      _____          __  __ ______    ______      ________ _____  _            \n" +
"     / ____|   /\\   |  \\/  |  ____|  / __ \\ \\    / /  ____|  __ \\| |           \n" +
"    | |  __   /  \\  | \\  / | |__    | |  | \\ \\  / /| |__  | |__) | |           \n" +
"    | | |_ | / /\\ \\ | |\\/| |  __|   | |  | |\\ \\/ / |  __| |  _  /| |           \n" +
"    | |__| |/ ____ \\| |  | | |____  | |__| | \\  /  | |____| | \\ \\|_|           \n" +
"     \\_____/_/    \\_\\_|  |_|______|  \\____/   \\/   |______|_|  \\_(_)           ");
            System.exit(0);
        }if(Hero.x == enemyX2 && Hero.y == enemyY2) {
             System.out.println("      _____          __  __ ______    ______      ________ _____  _            \n" +
"     / ____|   /\\   |  \\/  |  ____|  / __ \\ \\    / /  ____|  __ \\| |           \n" +
"    | |  __   /  \\  | \\  / | |__    | |  | \\ \\  / /| |__  | |__) | |           \n" +
"    | | |_ | / /\\ \\ | |\\/| |  __|   | |  | |\\ \\/ / |  __| |  _  /| |           \n" +
"    | |__| |/ ____ \\| |  | | |____  | |__| | \\  /  | |____| | \\ \\|_|           \n" +
"     \\_____/_/    \\_\\_|  |_|______|  \\____/   \\/   |______|_|  \\_(_)           ");
            System.exit(0);
        }if (Hero.x == enemyX3 && Hero.y == enemyY3) {
            System.out.println("      _____          __  __ ______    ______      ________ _____  _            \n" +
"     / ____|   /\\   |  \\/  |  ____|  / __ \\ \\    / /  ____|  __ \\| |           \n" +
"    | |  __   /  \\  | \\  / | |__    | |  | \\ \\  / /| |__  | |__) | |           \n" +
"    | | |_ | / /\\ \\ | |\\/| |  __|   | |  | |\\ \\/ / |  __| |  _  /| |           \n" +
"    | |__| |/ ____ \\| |  | | |____  | |__| | \\  /  | |____| | \\ \\|_|           \n" +
"     \\_____/_/    \\_\\_|  |_|______|  \\____/   \\/   |______|_|  \\_(_)           ");
            System.exit(0);
            }if (Hero.x == TrapX && Hero.y == TrapY) {
            System.out.println("      _____          __  __ ______    ______      ________ _____  _            \n" +
"     / ____|   /\\   |  \\/  |  ____|  / __ \\ \\    / /  ____|  __ \\| |           \n" +
"    | |  __   /  \\  | \\  / | |__    | |  | \\ \\  / /| |__  | |__) | |           \n" +
"    | | |_ | / /\\ \\ | |\\/| |  __|   | |  | |\\ \\/ / |  __| |  _  /| |           \n" +
"    | |__| |/ ____ \\| |  | | |____  | |__| | \\  /  | |____| | \\ \\|_|           \n" +
"     \\_____/_/    \\_\\_|  |_|______|  \\____/   \\/   |______|_|  \\_(_)           ");
            System.exit(0);
            }if (Hero.x == TrapX2 && Hero.y == TrapY2) {
            System.out.println("      _____          __  __ ______    ______      ________ _____  _            \n" +
"     / ____|   /\\   |  \\/  |  ____|  / __ \\ \\    / /  ____|  __ \\| |           \n" +
"    | |  __   /  \\  | \\  / | |__    | |  | \\ \\  / /| |__  | |__) | |           \n" +
"    | | |_ | / /\\ \\ | |\\/| |  __|   | |  | |\\ \\/ / |  __| |  _  /| |           \n" +
"    | |__| |/ ____ \\| |  | | |____  | |__| | \\  /  | |____| | \\ \\|_|           \n" +
"     \\_____/_/    \\_\\_|  |_|______|  \\____/   \\/   |______|_|  \\_(_)           ");
            System.exit(0);
            }if (Hero.x == TrapX3 && Hero.y == TrapY3) {
            System.out.println("      _____          __  __ ______    ______      ________ _____  _            \n" +
"     / ____|   /\\   |  \\/  |  ____|  / __ \\ \\    / /  ____|  __ \\| |           \n" +
"    | |  __   /  \\  | \\  / | |__    | |  | \\ \\  / /| |__  | |__) | |           \n" +
"    | | |_ | / /\\ \\ | |\\/| |  __|   | |  | |\\ \\/ / |  __| |  _  /| |           \n" +
"    | |__| |/ ____ \\| |  | | |____  | |__| | \\  /  | |____| | \\ \\|_|           \n" +
"     \\_____/_/    \\_\\_|  |_|______|  \\____/   \\/   |______|_|  \\_(_)           ");
         
            System.exit(0);
        }if (Hero.x == TreasureX && Hero.y == TreasureY) {
            System.out.println("▁ ▂ ▄ ▅ ▆ ▇ █ [ YOU WIN ] █ ▇ ▆ ▅ ▄ ▂ ▁");
            System.exit(0);
        }
}
}


     

    
       
     
       
         
      
       
    

       

    

    

     


       
     
 

        
   

     


     




    

    
    



   

