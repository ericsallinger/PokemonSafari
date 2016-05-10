import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

	public class PokemonRunner extends JFrame implements Cloneable 
	{
	public Object clone()
	{  
	    try
	    {  
	        return super.clone();  
	    }
	    catch(Exception e)
	    { 
	        return null; 
	    }
	}
	
                        static ArrayList <Pokemon>pokemonStats;
                        static ArrayList<Pokemon> caughtList = new ArrayList<Pokemon>();
                        static int ballCount;
                        static Pokemon battlingPokemon;
                        static int caughtPokemon = 0;
                        static int turnCounter = 0;
                        static int pointsSum = 0;
                        static boolean adventureMode = true;
                        static int className;
                        static JFrame frame = new JFrame();

                        public static void main(String[] args)
                                {

                                introduce();
                                makePokemons();
                                encounterPokemon();

                                }

                        public static void introduce()
                {
//                        Scanner userInput = new Scanner(System.in);
//                                System.out.println("Hello! Welcome to the Pokemon Safari Zone!");
//                                System.out.println();
//                                System.out.println("Here you have the ability to catch different Pokemon using rocks, bait, and Safari Balls.");
//                                System.out.println("You will be given " + ballCount + " Safari Balls to use to try to catch as many Pokemon as possible.");
//                                System.out.println("Would you like to hear the details of how this game works and/or play a game in practice mode?");
//                                System.out.println("1) Yes");
//                                System.out.println("2) No");
//                                int yesNo = userInput.nextInt();
//                                if (yesNo == 1)
//                                        {
//                                                giveRules();
//                                        }
//                                else
//                                        {
//                                                System.out.println("Ok then let's get started with a game in adventure mode!");
//                                                System.out.println();
//
//                                        }
               	 	 Object[] options = {"OK"};
                	 className = JOptionPane.showOptionDialog(frame, "Hello! Welcome to the Pokemon Safari Zone!",
              				"Introduction",
              				JOptionPane.DEFAULT_OPTION,
              				JOptionPane.WARNING_MESSAGE,
              				null, options, options[0]);
                	
                	 Object[] options1 = {"OK"};
                	 className = JOptionPane.showOptionDialog(frame, "Here you have the ability to catch different Pokemon using rocks, bait, and Safari Balls.",
              				"Introduction",
              				JOptionPane.DEFAULT_OPTION,
              				JOptionPane.WARNING_MESSAGE,
              				null, options1, options1[0]);
                	 
                ballCount = Integer.parseInt(JOptionPane.showInputDialog("How many Safari Balls would you like to start with?"));
                	 
                	 Object[] options2 = {"Yes", "No"};
                	 className = JOptionPane.showOptionDialog(frame, "Would you like to hear the details of how this game works and/or play a game in practice mode?",
              				"Introduction",
              				JOptionPane.DEFAULT_OPTION,
              				JOptionPane.WARNING_MESSAGE,
              				null, options2, options2[1]);
                	 
                	 switch(className)
                     {
                    	 case 0:
                    			 {
                    				
                    				 giveRules();
                    				 break;
                    			 }
                    	 case 1:
                    			 {
                    				 JOptionPane.showMessageDialog(frame, "Ok then let's get started with a game in adventure mode!");                				 
                    				 break;
                    			 }
                     }
                        }

                        public static void giveRules()
                        {
//                        Scanner userInput = new Scanner(System.in);
//                        System.out.println();
//                        System.out.println("The Safari Zone is simple");
//                        System.out.println("Every few seconds you will randomly encounter a random Pokemon.");
//                        System.out.println("All Pokemon have a random chance of escaping that increases each turn");
//                        System.out.println("The more rare Pokemon have a greater chance of escaping");
//                        System.out.println();
//                        System.out.println("Each Pokemon has a health value that when lowered, makes the Pokemon easier to catch");
//                        System.out.println("You can throw a rock to lower it's health by 10 points but this will also make the Pokemon 5% more likely to escape");
//                        System.out.println("You can also throw bait which will use up a turn but make the Pokemon 15% less likely to escape");
//                        System.out.println("When you've decided the Pokemon is at a low enough health, you can throw a Safari ball and try to catch it!");
//                        System.out.println("The odds of catching a Pokemon also increases the longer you have been in battle");
//                        System.out.println("Remember that doing any one of these actions uses up a turn so choose wisely what to do!");
//                        System.out.println();
//                        System.out.println("You can also enter practice mode where you get to choose which Pokemon you battle against");
//                        System.out.println("Which mode would you like to play?");
//                        System.out.println("1) Adventure");
//                        System.out.println("2) Practice");
             
                    JOptionPane.showMessageDialog(frame, "The Safari Zone is simple...");
                    JOptionPane.showMessageDialog(frame, "Every few seconds you will randomly encounter a random Pokemon.");
                    JOptionPane.showMessageDialog(frame, "All Pokemon have a random chance of escaping that increases each turn");
                    JOptionPane.showMessageDialog(frame, "The more rare Pokemon have a greater chance of escaping");
                    JOptionPane.showMessageDialog(frame, "Each Pokemon has a health value that when lowered, makes the Pokemon easier to catch");
                    JOptionPane.showMessageDialog(frame, "You can throw a rock to lower it's health by 10 points but this will also make the Pokemon 5% more likely to escape");
                    JOptionPane.showMessageDialog(frame, "You can also throw bait which will use up a turn but make the Pokemon 15% less likely to escape");
                    JOptionPane.showMessageDialog(frame, "When you've decided the Pokemon is at a low enough health, you can throw a Safari ball and try to catch it!");
                    JOptionPane.showMessageDialog(frame, "The odds of catching a Pokemon also increases the longer you have been in battle");
                    JOptionPane.showMessageDialog(frame, "Remember that doing any one of these actions uses up a turn so choose wisely what to do!");
                    JOptionPane.showMessageDialog(frame, "You can also enter practice mode where you get to choose which Pokemon you battle against");
                    
                      Object[] options1 = {"Practice", "Adventure"};              
                      className = JOptionPane.showOptionDialog(frame, "Which mode would you like to play?",
              				"Mode Choice",
              				JOptionPane.YES_NO_CANCEL_OPTION,
              				JOptionPane.QUESTION_MESSAGE,
              				null, options1, options1[1]);
                      
                      switch(className)
                      {
                     	 case 0:
                     			 {
                     				 JOptionPane.showMessageDialog(frame, "Practice makes perfect");
                     				 adventureMode = false;
                     				 break;
                     			 }
                     	 case 1:
                     			 {
                     				 JOptionPane.showMessageDialog(frame, "You are in for a wild ride!");
                     				 adventureMode = true;
                     				 break;
                     			 }
                        
//                        int gameChoice = userInput.nextInt();
//                        if (gameChoice == 1)
//                                {
//                                        adventureMode = true;
//                                }
//                        else
//                                {
//                                        adventureMode = false;
//
//                                }

//                        System.out.println("Ok now we're ready to begin!");
//                        System.out.println();
                      }
              }

                        public static void makePokemons()
                                {
                                        pokemonStats = new ArrayList<Pokemon>();
                                        pokemonStats.add(new Pokemon("Psyduck", 55, 5, 40)); //1
                                        pokemonStats.add(new Pokemon("Magikarp", 30, 0, 30));//2
                                        pokemonStats.add(new Pokemon("Gyarados", 70, 20, 85));//3
                                        pokemonStats.add(new Pokemon("Scyther", 60, 15, 70));//4
                                        pokemonStats.add(new Pokemon("Pinsir", 55, 15, 65));//5
                                        pokemonStats.add(new Pokemon("Doduo", 45, 10, 45));//6
                                        pokemonStats.add(new Pokemon("Kangaskhan", 60, 10, 60));//7
                                        pokemonStats.add(new Pokemon("Venonat", 45, 5, 40));//8
                                        pokemonStats.add(new Pokemon("Nidorino", 50, 10, 50));//9
                                        pokemonStats.add(new Pokemon("Nidorina", 50, 10, 50));//10
                                        pokemonStats.add(new Pokemon("Slowpoke", 65, 0, 45));//11
                                        pokemonStats.add(new Pokemon("Poliwag", 45, 5, 35));//12
                                        pokemonStats.add(new Pokemon("Polywrath", 65, 15, 80));//13
                                        pokemonStats.add(new Pokemon("Dragonite", 90, 20, 100));//14

                                }

                        public static void encounterPokemon()
                        {
                         Scanner userInput = new Scanner(System.in);

                         if (adventureMode == true)
                                 {
                                 int encounterTime = (int)(Math.random()*24) + 9;

                                System.out.println("Finding Pokemon...");
                                try
                                        {Thread.sleep(500);}
                                catch (InterruptedException e){
                                        e.printStackTrace();}

                                for(int i=0; i<encounterTime; i++)
                                        {
                                                System.out.print(".");
                                                try
                                                        {Thread.sleep(175);}
                                                catch (InterruptedException e){
                                                        e.printStackTrace();}
                                        }

                                int randPokemonNumber = (int)(Math.random()*1000) + 1;

                                if (randPokemonNumber > 0 && randPokemonNumber<= 125)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(0).clone();

                                        }
                                if (randPokemonNumber > 125 && randPokemonNumber<= 250)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(1).clone();
                                        }
                                if (randPokemonNumber > 250 && randPokemonNumber<= 300)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(2).clone();
                                        }
                                if (randPokemonNumber > 300 && randPokemonNumber<= 370)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(3).clone();
                                        }
                                if (randPokemonNumber > 370 && randPokemonNumber<= 420)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(4).clone();
                                        }
                                if (randPokemonNumber > 420 && randPokemonNumber<= 520)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(5).clone();
                                        }
                                if (randPokemonNumber > 520 && randPokemonNumber<= 550)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(6).clone();
                                        }
                                if (randPokemonNumber > 550 && randPokemonNumber<= 650)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(7).clone();
                                        }
                                if (randPokemonNumber > 650 && randPokemonNumber<= 710)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(8).clone();
                                        }
                                if (randPokemonNumber > 710 && randPokemonNumber<= 770)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(9).clone();
                                        }
                                if (randPokemonNumber > 770 && randPokemonNumber<= 820)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(10).clone();
                                        }
                                if (randPokemonNumber > 820 && randPokemonNumber<= 930)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(11).clone();
                                        }
                                if (randPokemonNumber > 930 && randPokemonNumber<= 970)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(12).clone();
                                        }
                                if (randPokemonNumber > 970 && randPokemonNumber<= 1000)
                                        {
                                	battlingPokemon = (Pokemon) pokemonStats.get(13).clone();
                                        }
                                turnCounter = 0;

                                System.out.println("A wild " + battlingPokemon.getName() + " appeared! Get ready to catch it!");
                                System.out.println();
                                showMenu();
                                    }
                         if (adventureMode == false)
                                 {
//                                         System.out.println("Which Pokemon would you like to attempt to catch? (choose a number)");
//                                         for(int i=0; i<pokemonStats.size(); i++)
//                                                 {
//                                                        System.out.println((i+1)+ ")" + pokemonStats.get(i).getName());
//                                                 }
                                	 final String [] pokemonChoice = {"Psyduck", "Magikarp", "Gyarados", "Scyther", "Pinsir", "Doduo", "Kangaskhan", "Venonat", "Nidorino", "Nidorina", "Slowpoke", "Poliwag", "Polywrath", "Dragonite"};
                         				{
                         					final JFrame frame = new JFrame();
                         					String pokemonSelection = (String) JOptionPane.showInputDialog(frame, "Choose which Pokemon you would like to battle",
                         					"Choose Pokemon",
                         					JOptionPane.QUESTION_MESSAGE,
                         					null, pokemonChoice, pokemonChoice[0]);	
                         					switch (pokemonSelection)
                                            {
                                            case "Psyduck":
                                                            {
                                                                    battlingPokemon = (Pokemon) pokemonStats.get(0).clone();
                                                                    break;

                                                            }
                                            case "Magikarp":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(1).clone();
                                                                    break;
                                                            }
                                            case "Gyarados":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(2).clone();
                                                                    break;
                                                            }
                                            case "Scyther":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(3).clone();
                                                                    break;
                                                            }
                                            case "Pinsir":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(4).clone();
                                                                    break;
                                                            }

                                            case "Doduo":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(5).clone();
                                                                    break;
                                                            }
                                            case "Kangaskhan":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(6).clone();
                                                                    break;
                                                            }
                                            case "Venonat":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(7).clone();
                                                                    break;
                                                            }
                                            case "Nidorino":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(8).clone();
                                                                    break;
                                                            }
                                            case "Nidorina":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(9).clone();
                                                                    break;
                                                            }
                                            case "Slowpoke":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(10).clone();
                                                                    break;
                                                            }
                                            case "Poliwag":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(11).clone();
                                                                    break;
                                                            }
                                            case "Polywrath":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(12).clone();
                                                                    break;
                                                            }
                                            case "Dragonite":
                                                            {
                                                            	battlingPokemon = (Pokemon) pokemonStats.get(13).clone();
                                                                    break;
                                                            }
                                            }
                         				}

//                                         int pokemonChoice = userInput.nextInt();                              
//                                         switch (pokemonChoice)
//                                                {
//                                                case 1:
//                                                                {
//                                                                        battlingPokemon = (Pokemon) pokemonStats.get(0).clone();
//                                                                        break;
//
//                                                                }
//                                                case 2:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(1).clone();
//                                                                        break;
//                                                                }
//                                                case 3:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(2).clone();
//                                                                        break;
//                                                                }
//                                                case 4:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(3).clone();
//                                                                        break;
//                                                                }
//                                                case 5:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(4).clone();
//                                                                        break;
//                                                                }
//
//                                                case 6:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(5).clone();
//                                                                        break;
//                                                                }
//                                                case 7:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(6).clone();
//                                                                        break;
//                                                                }
//                                                case 8:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(7).clone();
//                                                                        break;
//                                                                }
//                                                case 9:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(8).clone();
//                                                                        break;
//                                                                }
//                                                case 10:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(9).clone();
//                                                                        break;
//                                                                }
//                                                case 11:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(10).clone();
//                                                                        break;
//                                                                }
//                                                case 12:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(11).clone();
//                                                                        break;
//                                                                }
//                                                case 13:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(12).clone();
//                                                                        break;
//                                                                }
//                                                case 14:
//                                                                {
//                                                                	battlingPokemon = (Pokemon) pokemonStats.get(13).clone();
//                                                                        break;
//                                                                }
//                                                }
                                          showMenu();
                                 }
                        }

                        public static void showMenu()
                        {
//                                Scanner userInput = new Scanner(System.in);
//                                System.out.println(battlingPokemon.getName());
//                                System.out.println("You are fighting a " + battlingPokemon.getName() + " with " + battlingPokemon.getHealth() + " HP");
//                                System.out.println("What move will you make? (select a number 1-4)");
//                                System.out.println("-----------------   -----------------");
//                                System.out.println("|(" + 1 + ") Throw Rock |   |(" + 2 + ") Throw Bait |");
//                                System.out.println("-----------------   -----------------");
//                                System.out.println("-----------------   -----------------");
//                                System.out.println("|(" + 3 + ") Throw Ball |   |(" + 4 + ")  End Game  |");
//                                System.out.println("-----------------   -----------------");

                        	Object[] options = {"Throw Rock", "Throw Bait", "Throw Ball", "Run Away"};
                     		//////
                             
                             className = JOptionPane.showOptionDialog(frame, "What move will you make?",
                     				("You are fighting a " + battlingPokemon.getName()),
                     				JOptionPane.YES_NO_CANCEL_OPTION,
                     				JOptionPane.QUESTION_MESSAGE,
                     				null, options, options[3]);
                             
                             switch(className)
                             {
                            	 case 0:
                            			 {
                            				 JOptionPane.showMessageDialog(frame, "You threw a rock!");
                            				 throwRock();
                            				 break;
                            			 }
                            	 case 1:
                            			 {
                            				 JOptionPane.showMessageDialog(frame, "You threw some bait!");
                            				 throwBait();
                            				 break;
                            			 }
                            	 case 2:
                            			 {
                            				 JOptionPane.showMessageDialog(frame, "You threw a Safari Ball!");
                            				 throwBall();
                            				 break;
                            			 }
                            	 case 3:
                            			 {
                            				 JOptionPane.showMessageDialog(frame, "You successfully got away!");
                            				 endGame();
                            				 break;
                            			 }
                             }
                             
//                                int selectMove = userInput.nextInt();
//
//                                switch(selectMove)
//                                {
//
//                                        case 1:
//                                                {
//                                                throwRock();
//                                                break;
//                                                }
//                                        case 2:
//                                                {
//                                                throwBait();
//                                                break;
//                                                }
//                                        case 3:
//                                                {
//                                                throwBall();
//                                                break;
//                                                }
//                                        case 4:
//                                                {
//                                                endGame();
//                                                break;
//                                                }
//                                }
                        }

                        public static void throwRock()
                        {
                        System.out.println("You threw a rock!");
                        System.out.println();
                        battlingPokemon.setHealth(battlingPokemon.getHealth() - 10);
                        battlingPokemon.setEscape(battlingPokemon.getEscape() + 5);
                        System.out.println(pokemonStats.get(0).getHealth());
                        System.out.println("The " + battlingPokemon.getName() + " now has " + battlingPokemon.getHealth() + " HP" );
                        System.out.println();
                        endTurn();
                        }

                        public static void throwBait()
                        {
                        System.out.println("You threw some bait!");
                        System.out.println();
                        battlingPokemon.setEscape(battlingPokemon.getEscape() - 15);
                        System.out.println("The " + battlingPokemon.getName() + " is drawn to the bait!");
                        System.out.println();
                        endTurn();
                        }

                        public static void throwBall()
                        {
                        System.out.println("You threw a Safari Ball!");
                        ballCount--;
                        System.out.println("You now have " + ballCount + " balls left");
                        System.out.println();
                        try
                        {Thread.sleep(500);}
                catch (InterruptedException e){
                        e.printStackTrace();}
                        System.out.println("Attempting Capture...");

                        try
                        {Thread.sleep(700);}
                catch (InterruptedException e){
                        e.printStackTrace();}
                        System.out.println(".");

                        try
                        {Thread.sleep(700);}
                catch (InterruptedException e){
                        e.printStackTrace();}
                        System.out.println("..");

                        try
                        {Thread.sleep(700);}
                catch (InterruptedException e){
                        e.printStackTrace();}
                        System.out.println("...");

                        try
                        {Thread.sleep(700);}
                catch (InterruptedException e){
                        e.printStackTrace();}
                        System.out.println("....");

                        //catching
                        int catchPercentage = (int)(Math.random()*100)+1;
                        if(catchPercentage <=  100 - (battlingPokemon.getHealth() *2) + (turnCounter * 5 ))
                                {
                                catchPokemon();
                                }
                        else
                                {
                                System.out.println("Oh no! The " + battlingPokemon.getName() + " broke free!");
                                System.out.println();
                                endTurn();
                                }
                        }

                        public static void catchPokemon()
                        {
                        caughtList.add(battlingPokemon);
                        Scanner userInput = new Scanner(System.in);
                        System.out.println("Congratulations! " + battlingPokemon.getName() + " was caught!");
                        caughtPokemon++;

                        pointsSum = pointsSum + battlingPokemon.getPoints();
                        if( ballCount > 0)
                                {
                                System.out.println("Do you want to try and catch another Pokemon?");
                                System.out.println("------------   ------------");
                                System.out.println("|  " + 1 + ") Yes  |   |  " + 2 + ") No   |");
                                System.out.println("------------   ------------");
                                int continueChoice = userInput.nextInt();
                                if(continueChoice == 1)
                                        {
                                        System.out.println();
                                        endBattle();
                                        }
                                else
                                        {
                                        endGame();
                                        }
                        }
                        else
                                {
                                endGame();
                                }
                        }

                        public static void endTurn()
                        {
                        turnCounter++;
                        if(battlingPokemon.getHealth() > 0 && ballCount > 0)
                                {
                                battlingPokemon.setEscape(battlingPokemon.getEscape() + 2*turnCounter);
                                attemptEscape();
                                showMenu();
                                }
                        else
                                {
                                endBattle();
                                }

                        }

                        public static void attemptEscape()
                        {
                                int escapePercentage = (int)(Math.random()*100)+1;
                                if(escapePercentage <= battlingPokemon.getEscape())
                                {
                                        escapeBattle();
                                }
                        }

                        public static void escapeBattle()
                        {
                                System.out.println("Oh no! The " + battlingPokemon.getName() + " escaped!");
                                encounterPokemon();
                                showMenu();
                        }

                        public static void endBattle()
                        {
                                if(battlingPokemon.getHealth() <= 0)
                                {
                                        System.out.println("Oh no! The " + battlingPokemon.getName() + " fainted.");
                                        System.out.println("You will now attempt to catch a new Pokemon");
                                        System.out.println();
                                                try
                                                {Thread.sleep(2000);}
                                                catch (InterruptedException e){
                                                        e.printStackTrace();}
                                        encounterPokemon();
                                        showMenu();
                                }
                                else if(ballCount > 0)
                                {
                                        encounterPokemon();
                                        showMenu();
                                }
                                else
                                {
                                        System.out.println("You ran out of Safari Balls so your game has ended");
                                        endGame();
                                }
                        }

                        public static void endGame()
                            {
                            System.out.println("You overall captured " + caughtPokemon + " Pokemon in your game! Great Job! " );
                            System.out.println("They were:");
                            for(Pokemon p: caughtList)
                                {
                                        System.out.print(p.getName() + ": for " + p.getPoints() + " points, ");

                                }
                            System.out.println();
                            System.out.println("Your total point score comes to: " + pointsSum);
                            System.out.println("Come back and play again soon!");
                            System.exit(0);
                            }

}