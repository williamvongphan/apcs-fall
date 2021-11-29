/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 *
 * USAGE:
 * Compile. Note messages generated.
 * Devise a plan of attack with your trio.
 * Code incrementally, testing each bit of new functionality as you go.
 * The only modification you should make to this driver file is moving comment bar down in main method, and filling in DISCO/QCC
 * (If you feel other changes are merited, note what and why, so that we may discuss on the 'morrow.)
 *
 * DISCO:
 *
 * QCC:
 *
 **********************************************/

 /* OUR DRIVER MODS
    0. Added code to determine Protagonist role based on player input
    1. Added code to instantiating the player's character
    2. Added code to randomize monsters
    3. Added code to display player and monster health status
    4. Added code to display the player role and which monster the player is fighting
    5. Added code to display Priest healing ability
    6. Rearranged the attack and print statements to reflect player and monster turns
*/

import java.io.*;
import java.util.*;

public class YoRPG {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

  //change this constant to set number of encounters in a game
  public final static int MAX_ENCOUNTERS = 5;

  //each round, a Protagonist and a Monster will be instantiated...
  private Protagonist pat;
  private Monster smaug;

  private int moveCount;
  private boolean gameOver;
  private int difficulty;

  private InputStreamReader isr;
  private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
  public YoRPG() {
    moveCount = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

  /*=============================================
    void newGame() -- gathers info to begin a new game
    pre:
    post: according to user input, modifies instance var for difficulty
    and instantiates a Protagonist
    =============================================*/
  public void newGame() {
    String s;
    String name = "";
    s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

    s += "\nChoose your difficulty: \n";
    s += "\t1: Easy\n";
    s += "\t2: Not so easy\n";
    s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    s += "Selection: ";
    System.out.print( s );

    try {
	    difficulty = Integer.parseInt( in.readLine() );
    }
    catch ( IOException e ) { }

    int playerChoice = 0;

    s = "\nChoose your role: \n";
    s += "\t1: Warrior: " + Warrior.about() + "\n";
    s += "\t2: Priest: " + Priest.about() + "\n";
    s += "\t3: Assassin: " + Assassin.about() + "\n";
    s += "\t4: Mage: " + Mage.about() + "\n";
    s += "Selection: ";
    System.out.print( s );

    try {
      playerChoice = Integer.parseInt( in.readLine() );
    }
    catch (IOException e) { }

    s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
    System.out.print( s );

    try {
	    name = in.readLine();
    }
    catch ( IOException e ) { }

    //instantiate the player's character
    if (playerChoice == 1) {
      pat = new Warrior(name);
    } else if (playerChoice == 2) {
      pat = new Priest(name);
    } else if (playerChoice == 3) {
      pat = new Assassin(name);
    } else if (playerChoice == 4) {
      pat = new Mage(name);
    } else {
      System.out.println("\nSorry, your character has left the party. You will be assigned a default one instead.");
      pat = new Protagonist( name );
    }

  }//end newGame()


  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    post: Returns true if player wins (monster dies).
    Returns false if monster wins (player dies).
    =============================================*/
  public boolean playTurn() {
    int i = 1;
    int d1, d2;

    if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
    else {
	    System.out.println( "\nLo, yonder monster approacheth!" );
      //instantiate the monster
      int monsterChoice = (int) (Math.random() * 2);
      String aboutDescrip = "";
      if (monsterChoice == 0) {
        smaug = new GoblinKing();
        aboutDescrip = GoblinKing.about();
      } else if (monsterChoice == 1) {
        smaug = new Dragon();
        aboutDescrip = Dragon.about();
      } else if (monsterChoice == 2) {
        smaug = new Golem();
        aboutDescrip = Golem.about();
      }

      System.out.println( "\nYou are " + pat.getName() + ", the " + pat.getRole() + ". " + "You are fighting a " + smaug.getRole() + ", " + aboutDescrip );

      while( smaug.isAlive() && pat.isAlive() ) {

        // Give user the option of using a special attack:
        // If you land a hit, you incur greater damage,
        // ...but if you get hit, you take more damage.
        try {
          System.out.println( "\nDo you feel lucky?" );
          System.out.println( "\t1: Nay.\n\t2: Aye!" );
          i = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }

        if ( i == 2 )
          pat.specialize();
        else
          pat.normalize();

        d1 = pat.attack( smaug );

        System.out.println( "\n" + pat.getName() + " dealt " + d1 +
                            " points of damage.");

        System.out.println("\nYe Olde Monster health: " + smaug.getHealth());

        if (pat.getRole() == "Priest") {
          pat.getHeal();
          System.out.println("\nYe health for 5!");
          System.out.println("\nYe health: " + pat.getHealth());
        }

        d2 = smaug.attack( pat );

        System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
                            " for " + d2 + " points of damage.");

        System.out.println("\nYe health: " + pat.getHealth());

	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
        System.out.println( "'Twas an epic battle, to be sure... " +
                            "You cut ye olde monster down, but " +
                            "with its dying breath ye olde monster. " +
                            "laid a fatal blow upon thy skull." );
        return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
        System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
        return false;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
        System.out.println( "Ye olde self hath expired. You got dead." );
        return false;
	    }
    }//end else

    return true;
  }//end playTurn()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main( String[] args ) {
    //As usual, move the begin-comment bar down as you progressively
    //test each new bit of functionality...


    //loading...
    YoRPG game = new YoRPG();
    int encounters = 0;
    while( encounters < MAX_ENCOUNTERS ) {
    if ( !game.playTurn() )
    break;
    encounters++;
    System.out.println();
    }
    System.out.println( "Thy game doth be over." );

  }//end main

}//end class YoRPG
