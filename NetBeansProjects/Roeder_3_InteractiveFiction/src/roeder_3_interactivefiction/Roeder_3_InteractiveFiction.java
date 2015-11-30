/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roeder_3_interactivefiction;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author aroeder
 */
public class Roeder_3_InteractiveFiction {
    static Scanner S = new Scanner (System.in);
    static String answer;
    static boolean goodAnswer = false ;
    static Scanner Sc = new Scanner (System.in);
    static boolean goodAnswer2 = false ;
    static String answer2;
    static boolean goodAnswer3 = false;
    static String answer3;
            static Scanner Sca = new Scanner (System.in);
    static boolean goodAnswer4 = false;
    static String answer4;
    static Scanner Scan = new Scanner (System.in);
    static boolean beentoCavern = false ;
    static boolean goodAnswer5 = false;
    static String answer5;
    static Scanner Scann = new Scanner (System.in);
    static Random randy = new Random() ;
    static Scanner Scanne = new Scanner (System.in);
    static String answer6;
            static boolean goodAnswer6 = false;
    public static int counterHP;
    public static int counterMP;
    public static int HP;
    public static int MP;
    public static int ElfHP;
    public static int ElfMP;
    public static int counterElfHP;
    public static int counterElfMP;
    public static int OrcHP;
    public static int DemonHP;
    static String answer7;
            static String answer8;
    static boolean goodAnswer7;
    static boolean goodAnswer8;
    static Scanner Scanner = new Scanner (System.in);
    static Scanner S1 = new Scanner (System.in);



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
       // System.out.println("000000000");                                      
//      objective();                                                            
//        System.out.println("0000100000");                                     
//      scene1();                                                               
//        System.out.println("0000200000");                                     
//      scene1_2();                                                             
//        System.out.println("0000030000");                                     
//      scene1_3();                                                             
//        System.out.println("0000400000");                                     
//      scene2();                                                               
//        System.out.println("0000050000");                                     
    }
    public static void start() {     //#Method1
 while (!goodAnswer) {//#while
        System.out.println(" Do you want to play a game? ");
       answer = S.nextLine().toLowerCase();
        if(answer.contains("yes")){
            goodAnswer = true;
            System.out.println("Great let's get er goin"); //#new Protagonist
           } else if (answer.contains("no")) {
            goodAnswer = true;
       System.out.println("Bye");
           } else{
            System.out.println("I don't understand");
            //start();                               
          }
      }
      objective();
    }

        public static void objective() { // # Method2
            boolean scene1=false;
             boolean scene1_2=false;
            boolean scene1_3=false;
            while (!goodAnswer2) {//#while
                System.out.println("Your objective is to take over a species."); //#Win
                System.out.println("You have one of three choices The Dark Forest, the Caverns, and the Demon Realm. ");
                System.out.println("Ok, Where would you like to go?");
                answer2 =  Sc.nextLine().toLowerCase();
                if(answer2.contains("the dark forest")){
                    goodAnswer2 = true;
                    System.out.println("Great choice let's go to the Forest.");
                    scene1 = true;
                } else if (answer2.contains("the caverns")) {
                    goodAnswer2 = true;
                    System.out.println("Good choice let's go to the Caverns.");
                     scene1_2 = true;
                } else if (answer2.contains("the demon realm")) {
                    goodAnswer2 = true;
                    System.out.println("Amazing choice let's go to the Demon Realm");
                    scene1_3 = true;
                } else {
                    System.out.println("I don't understand your answer");
                }

            }
            if (scene1){
                scene1();

            }else if(scene1_2){
                scene1_2();

            } else if(scene1_3){
                scene1_3();

            }
        }

      public static void scene1() {   //#Method3
          while (!goodAnswer3 & !beentoCavern) {//#while
          System.out.println("The Dark Forest is mostly made up of Elves but they won't just follow you just cause you said so.");
          System.out.println("You must first defeat their King to show them you are more powerful than them. ");
          System.out.println("These elves are mostly Magic users and potion makers, their HP is low but they have high MP as well as high magic defense.");
          System.out.println("But before you can battle you need a weapon.");
          System.out.println("You have 3 Choices 1. A Bow, 2. A Sword, or 3. A Magic Staff ");
          System.out.println("What would you like to use?");
          answer3 = Sca.nextLine().toLowerCase();
          if (answer3.contains("a bow")) {
                  goodAnswer3 = true;
                  System.out.println("An Archer eh, should be intresting.");
                  scene2();
              }else if (answer3.contains("a sword")){
                  goodAnswer3 = true;
                  System.out.println("Want to be a Swordsman eh, this will be intresting.");
                  scene2();
              }else if (answer3.contains("a magic staff")) {
                  goodAnswer3 = true ;
                  System.out.println("You want to be a Sorcerer, this will be intresting.");
                  scene2();
              }else{
                  System.out.println("I Don't understand please choose again ");

              }

          }
      }




      public static void scene1_2() {  //#Method4
          while (!goodAnswer4) {//#while
              System.out.println("The Caverns mostly contain orcs and monsters but in order to have them follow your orders you need to defeat the Orc King.");
              System.out.println("The inhabitants of the Caverns are HIGH Physical attackers and have high HP but their MP is low as is their Magic defense. ");
              System.out.println("But before you can defeat the Orc King you need a weapon.");
              beentoCavern = true;
              System.out.println("You have 3 Choices 1. A Bow, 2. A Sword, or 3. A Magic Staff ");
          System.out.println("What would you like to use?");
          answer4 = Scan.nextLine().toLowerCase();
          if(answer4.contains("a bow")){
              goodAnswer4 = true ;
              System.out.println("An Archer eh, this should be interesting.");
              scene2_1();
          }else if (answer4.contains("a sword")) {
              goodAnswer4 = true;
                 System.out.println("Want to be a swordsmen eh, ok this will be interesting.");
                 scene2_1();
          }else if (answer4.contains("a magic staff")) {
              goodAnswer4 = true;
              System.out.println("Sorcerer eh, certainly unexpected this will be interesting.");
              scene2_1();
          }else{
              System.out.println("I don't understand what your asking.");
              }

          }

      }
 public static void scene1_3(){ //#Method5
          while (!goodAnswer5) {//#while
          System.out.println("Welcome to the Demon Realm most of the things in this realm aren't actually horrifying demons, they're actually human like demons with retractable wings.");
          System.out.println("These people possess both physical and magical abilities with normal HP, and MP but some of the demons rise above others and have sacred gears so hope your lucky.");
          System.out.println("However before they start following your orders you must first defeat the demon king");
          System.out.println("But before you can defeat the Orc King you need a weapon.");

              System.out.println("You have 3 Choices 1. A Bow, 2. A Sword, or 3. A Magic Staff ");
          System.out.println("What would you like to use?");
          answer5 = Scann.nextLine().toLowerCase();
          if(answer5.contains("a bow")){
              goodAnswer5 = true ;
              System.out.println("An Archer eh, this should be interesting.");
              scene2_2();
          }else if (answer5.contains("a sword")) {
              goodAnswer5 = true;
                 System.out.println("Want to be a swordsmen eh, ok this will be interesting.");
                 scene2_2();
          }else if (answer5.contains("a magic staff")) {
              goodAnswer5 = true;
              System.out.println("Sorcerer eh, certainly unexpected this will be interesting.");
              scene2_2();
          }else{
              System.out.println("I don't understand what your asking.");
      }
          }
}
      public static void scene2() { //#Method6

          boolean hitboolean = true;
            int hit = randy.nextInt(26);
          int hit2 = randy.nextInt(40);
          ElfHP = 50-hit;
          HP= 150-hit2;


        Scanner num = new Scanner(System.in) ;
          System.out.println("OK, you must defeat the Elf king to gain the leadership he has.");
          System.out.println("ELF KING: So you believe you can defeat me well come on and give me a go." );
          System.out.println("Type hit to attack.");
          while (hitboolean){
          String choice;
          Scanner attack = new Scanner(System.in);          // #EnemyObject
          choice = attack.nextLine().toLowerCase();
          hit = randy.nextInt(36);
          hit2 = randy.nextInt(40);
              System.out.println("Elf King took " + hit + " amount of damage");
              System.out.println("Elf King attacks and you take " + hit2 + " amount of damage");

              HP-= hit2;
              ElfHP-= hit;
              System.out.println("You have " + HP + " HP remaining");
              System.out.println("The King has " + ElfHP +" HP remaining");
               if (ElfHP<=0) {
              System.out.println("You won congrats");
              System.out.println("Would you like to continue");
              answer6 = Scanne.nextLine().toLowerCase();
              if (answer6.contains("yes")) {
                  goodAnswer6 = true;
                  scene3();
              if(HP <= 0){
                  System.out.println("You Lost");
                  while (!goodAnswer6){//#while
                  System.out.println("Would you like to try again?");
                  answer6 = Scanne.nextLine().toLowerCase();
                  if (answer6.contains("yes"));
                  goodAnswer6 = true;
                      System.out.println("Good Luck you only get one retry!");
                      scene2();
                  if (answer6.contains("no")) {
                  goodAnswer6=true;
                  System.out.println("GAME OVER"); //#Lose #fortheloss

	      }	
 
              }

              }
          }
          }
          }
      }
      public static void scene2_1() { //#Method7
      boolean hitboolean = true;
            int hit = randy.nextInt(26);
          int hit2 = randy.nextInt(40);
          OrcHP = 50-hit;
          HP= 150-hit2;


        Scanner num = new Scanner(System.in) ;
          System.out.println("OK, you must defeat the Orc king to gain the leadership he has.");
          System.out.println("ORC KING: So you believe you can defeat me well come on and give me a go." );
          System.out.println("Type hit to attack.");
          while (hitboolean){//#while
          String choice;
          Scanner attack = new Scanner(System.in);
          choice = attack.nextLine().toLowerCase();
          hit = randy.nextInt(36);
          hit2 = randy.nextInt(40);
              System.out.println("Orc King took " + hit + " amount of damage");
              System.out.println("Orc King attacks and you take " + hit2 + " amount of damage");
              HP-= hit2;

	      OrcHP-= hit;
           System.out.println("You have " + HP + " HP remaining");

              System.out.println("The King has " + OrcHP +" HP remaining");
             if (OrcHP<=0){
              System.out.println("You won congrats");
              System.out.println("Would you like to continue");
              answer7 = Scanner.nextLine().toLowerCase();
              if (answer7.contains("yes")) {
                  goodAnswer7 = true;
                  scene3();
              if(HP <= 0){
                  System.out.println("You Lost");
                  while (!goodAnswer7){//#while
                  System.out.println("Would you like to try again?");
                  answer7 = Scanner.nextLine().toLowerCase();
                  if (answer7.contains("yes"));
                  goodAnswer7 = true;
                      System.out.println("Good Luck you only get one retry!");
                      scene2();
                  if (answer7.contains("no")) {
                  goodAnswer7=true;
                  System.out.println("GAME OVER"); //#Lose #fortheloss

	      }	
                  }
              }
          }
      }
          }
}


         public static void scene2_2() { //#Method8
              boolean hitboolean = true;
            int hit = randy.nextInt(26);
          int hit2 = randy.nextInt(40);
         DemonHP = 50-hit;
          HP= 150-hit2;


        Scanner num = new Scanner(System.in) ;
          System.out.println("OK, you must defeat the Demon king to gain the leadership he has.");
          System.out.println("DEMON KING: So you believe you can defeat me well come on and give me a go." );
          System.out.println("Type hit to attack.");
          while (hitboolean){
          String choice;
          Scanner attack = new Scanner(System.in);
          choice = attack.nextLine().toLowerCase();
          hit = randy.nextInt(36);
          hit2 = randy.nextInt(40);
              System.out.println("Demon King took " + hit + " amount of damage");
              System.out.println("Demon King attacks and you take " + hit2 + " amount of damage");
              HP-= hit2;

              DemonHP-= hit;

              System.out.println("You have " + HP + " HP remaining");

              System.out.println("The King has " + DemonHP +" HP remaining");
              if (DemonHP<=0){
              System.out.println("You won congrats");
              System.out.println("Would you like to continue");
               answer8 = S1.nextLine().toLowerCase();
              if (answer8.contains("yes")) {
                  goodAnswer8 = true;
                  scene3();
              if(HP <= 0){
                  System.out.println("You Lost");
                  while (!goodAnswer8){ //#while
                  System.out.println("Would you like to try again?");
                  answer8 = S1.nextLine().toLowerCase();
                  if (answer8.contains("yes"));
                  goodAnswer8 = true;
                      System.out.println("Good Luck you only get one retry!");
                      scene2();
                  if (answer8.contains("no")) {
                  goodAnswer6=true;
                  System.out.println("GAME OVER"); //#Lose #fortheloss


          }
}
              }
          }
}
          }
         }
             
         public static void scene3() { //#Method9
             System.out.println("ok CONGRATS on beating my game you have successfully conquered your Kingdom now lead with and iron fist.");
             System.out.println("Please exit the game.");// #Win #Forthewin

    }
}
    
    
    
    
    

