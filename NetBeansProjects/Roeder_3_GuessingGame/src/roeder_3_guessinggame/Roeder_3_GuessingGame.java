/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roeder_3_guessinggame;
import java.util.Scanner;
import java.util.Random;
import static roeder_3_guessinggame.Roeder_3_GuessingGame.counter;

/**
 *
 * @author aroeder
 */
public class Roeder_3_GuessingGame {
static int counter;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int counter = 5;
        name();
        easygame();
        normalgame();
        hardgame(); 
        while(counter < 0){
        counter--; 
        easygame();
        normalgame();
        hardgame();
        
       
         
        }
    }
    static void name() {
        Scanner name = new Scanner(System.in);
        System.out.print("What is your name?\n>>");
        String x = name.nextLine();
        System.out.print(" Hello " + x);
    }
    static void easygame(){
        boolean itsthe1stboolean = true;
        while (itsthe1stboolean){
        System.out.print(" Pick a number between 1 and 10.");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tries = 5;
        int count = 0;
        counter--;
        int Q = sc.nextInt();
        Random number = new Random();
        int randomNum = rand.nextInt(11);
        if(Q == randomNum){
            System.out.println("You WEEEEN!!!");
         itsthe1stboolean = false;   
        }
        if(Q != randomNum ){
            System.out.println("You're a LOOOOOOOser");{
        System.out.println("You have "+counter+"lives remaining" );
            
        }
        }
    }
    }
        
        static void normalgame() {
      boolean itsa2ndboolean = true;
        while (itsa2ndboolean){
        System.out.print(" Pick a number between 1 and 50 ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int Q = sc.nextInt();
        Random number = new Random();
        int randomNum = rand.nextInt(10);
        if(Q == randomNum){
            System.out.println("You WEEEEEEEN Lvl 2");
         itsa2ndboolean = false;   
        }
        if(Q != randomNum ){
            System.out.println("You're a LOOOOOser");
            counter--;
            System.out.println("You have "+counter+"lives remaining" );
        }
        }
        }
        
        static void hardgame() {
      boolean itsa3rdboolean = true;
        while (itsa3rdboolean){
        System.out.print(" Pick a number between 1 and 100 ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int Q = sc.nextInt();
        Random number = new Random();
        int randomNum = rand.nextInt(10);
        if(Q == randomNum){
            System.out.println("You WEEEEEEEEEN Lvl 3");
         itsa3rdboolean = false;   
        }
        if(Q != randomNum ){
            System.out.println("You're a LOOOOOOOser");
            counter--;
            System.out.println("You have "+counter+"lives remaining" );
        }
        }
        }
}

    
    

