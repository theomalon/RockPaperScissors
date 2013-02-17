/*
 * Chris Malon
 * 2/16/13
 * Rock Paper Scissors
 */
package cmrockpaperscissors;

/**
 *
 * @author zero
 */

import java.util.Scanner;
import java.util.Random;

public class CMRockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String player = "";
        String computer = "";
        int computerChoice;
        int numGames = 0;
        int playerWins = 0;
        int computerWins = 0;
        int tie = 0;
        
        Scanner in = new Scanner(System.in);
        while(!player.equals("Q"))
        {   
            System.out.println("Choose your weapon!");
            System.out.print("(R)ock (P)apaer (S)cissors (Q)uit :");
            System.out.println();
            player = in.nextLine();
            player = player.toUpperCase();
            if(player.equals("R") || player.equals("P") || player.equals("S"))
            {
                computerChoice = (int)(Math.random()*3);
                switch(computerChoice)
                {
                    case 0: computer = "R";
                        break;
                    case 1: computer = "P";
                        break;
                    case 2: computer = "S";
                        break;
                    default:;
                }
                
                System.out.println("Computer chooses " + computer + ".");
                if(player.equals(computer))
                {
                    System.out.println("Its a tie!");
                    tie++;
                }
                
                if(player.equals("R"))
                {
                    if(computer.equals("S"))
                    {
                        System.out.println("Rock smashes Scissors!");
                        System.out.println("Player Wins!");
                        playerWins++;
                    }
                    
                    else if(computer.equals("P"))
                    {
                        System.out.println("Paper covers Rock!");
                        System.out.println("Computer Wins!");
                        computerWins++;
                    }                 
                } 
                
                if(player.equals("P"))
                {
                    if(computer.equals("R"))
                    {
                        System.out.println("Paper covers Rock!");
                        System.out.println("Player Wins!");
                        playerWins++;
                    }
                    
                    else if(computer.equals("S"))
                    {
                        System.out.println("Scissors cut Paper!");
                        System.out.println("Computer Wins!");
                        computerWins++;
                    }
                }
                
                if(player.equals("S"))
                {
                    if(computer.equals("P"))
                    {
                        System.out.println("Scissors cut Paper!");
                        System.out.println("Player Wins!");
                        playerWins++;
                    }
                    
                    else if(computer.equals("R"))
                    {
                        System.out.println("Rock smashes Scissors!");
                        System.out.println("Computer Wins!");
                        computerWins++;
                    }
                }
                
                numGames++;
            }
            
            else
            {
                System.out.println("Invalid entry!");
                System.out.println("Choose your weapon!");
                System.out.print("(R)ock (P)apaer (S)cissors (Q)uit :");
                player = in.nextLine();
                player = player.toUpperCase();
            }
        }
        
        if (player.equals("Q"))
        {
            System.out.println("Thanks for playing!");
            System.out.println("Number of rounds: " + numGames);
            System.out.println("Player Score: " + playerWins);
            System.out.println("Computer Score: " + computerWins);
            System.out.println("Ties: " + tie);
        }
    }    
}
