
/**
 * Deck holds all the cards in a standard 52 card deck
 *
 * @author Alex Silverman   
 * @version 1.0 10/31/2024
 */

import java.util.Scanner;

public class Deck
{
    // instance variables - replace the example below with your own
    private boolean isFullDeck; //Sees if the deck is dull or if a game is in progress
    private boolean hasJokers;  //adds jokers to the deck
    private int game;           //Game number
    private int points1;         //number of points player 1 has
    private int points2;         //number of points player 2 has
    private int endGame;        //Final number of points players have to get to

    /**
     * Constructor for objects of class Deck
     */
    public Deck(boolean deck, boolean jokers, int g, int p1, int p2, int fp)
    {
        // initialise instance variables
        isFullDeck = deck;
        hasJokers = jokers;
        game = g;
        points1 = p1;
        points2 = p2;
        endGame = fp;
    }

    public String toString()
    {
        return "Is full deck: " + isFullDeck + "\nHas Jokers: " + hasJokers + "/\nGame number: " + game + "\nPlayer 1 has " + points1 + "points \nPlayer 2 has " + points2 + " points \nThe game ends at " + endGame + " points.";
    }
}
