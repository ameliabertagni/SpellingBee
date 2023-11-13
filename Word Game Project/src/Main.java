import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static Scanner userInput = new Scanner(System.in);
	static Scanner userStringInput = new Scanner(System.in);
	static int level;
	static String name;
	static int genius;
	static int amazing;
	static int solid;
	static int good;
	static int beginner = 0;
	static int amount;
	static boolean winning;
	static String guess;
	static int numbers;
	static ArrayList found = new ArrayList();
	
	
	public static void main(String[] args)
	{
		Letters.fillLetters();
		intro();
		board();
		play();
		
	}
	
	public static void intro()
	{
		System.out.println("Hi, welcome to Spelling Bee! To play, use the letters from the board shown!\n\n	*Words must contain at least four letters.\n	*Words must include the center letter.\n	*No cussing.\n	*Letters can be used any amount of times.\n\n Score points to increase your skill level!\n	*4-letter words are worth 1 point each.\n	*Longer words earn an extra point per letter.\n	*Each puzzle includes at least one panagram (a word that uses every letter). \n	 These are worth an extra 7 points!\n	*The different score levels are Beginner, Good, Solid, Amazing, and Genius! \n	To acquire Genius, you need to get every single word.\n\n Ready to play? Enter your name below!");
		name = userInput.nextLine();
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("\n");
		}
		System.out.println("\nOk " + name + ", what difficulty are you up for? 1, 2, or 3?");
		for(int i = 0; i <= 20; i++)
		{
			System.out.println("\n");
		}
		level = userInput.nextInt();
		System.out.println("\n ");
		System.out.println("Your board is shown below!");
	}
	
	public static void board()
	{
		if(level == 1)
		{
		    System.out.println("     ------- -------	  ");
		    System.out.println("     |  l  | |  n  |   ");
		    System.out.println("     ------- -------	  ");
		    System.out.println(" ------- ------- -------");
		    System.out.println(" |  h  | |  u  | |  c  |");
		    System.out.println(" ------- ------- -------");
		    System.out.println("     ------- -------	  ");
		    System.out.println("     |  o  | |  e  |   ");
		    System.out.println("     ------- -------	  ");
		}
		else if(level == 2)
			{
			    System.out.println("     ------- -------	  ");
			    System.out.println("     |  p  | |  d  |   ");
			    System.out.println("     ------- -------	  ");
			    System.out.println(" ------- ------- -------");
			    System.out.println(" |  g  | |  i  | |  n  |");
			    System.out.println(" ------- ------- -------");
			    System.out.println("     ------- -------	  ");
			    System.out.println("     |  r  | |  o  |   ");
			    System.out.println("     ------- -------	  ");
			}
		if(level == 3)
			{
			    System.out.println("     ------- -------	  ");
			    System.out.println("     |  v  | |  u  |   ");
			    System.out.println("     ------- -------	  ");
			    System.out.println(" ------- ------- -------");
			    System.out.println(" |  e  | |  n  | |  j  |");
			    System.out.println(" ------- ------- -------");
			    System.out.println("     ------- -------	  ");
			    System.out.println("     |  i  | |  l  |   ");
			    System.out.println("     ------- -------	  ");
			}
		for(int i = 0; i <= 14; i++)
			{
				System.out.println("\n");
			}
	}
	
	public static void found()
	{
		for(int i = 0; i <= Letters.words.size() - 1; i++)
		{
			if(Letters.words.get(i).getLevel() == level)
			{
				numbers++;
			}
		}
		
	}
	
	public static void scoring()
	{
		genius = 0;
		for(int i = 0; i <= Letters.words.size() - 1; i++)
		{
			if(Letters.words.get(i).getLevel() == level)
			{
				genius += Letters.words.get(i).getPoints();
			}
		}
		amazing = (genius / 2);
		solid = (amazing / 2);
		good = (solid / 2);
		if(amount <= beginner)
		{
			System.out.println("		    _______________________________________________\r\n"
					+ "		    |                                             |\r\n"
					+ "		    |  ✪---------◌---------◌---------◌---------◌  |\r\n"
					+ "		    |                                             |\r\n"
					+ "		    TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
		}
		else if(amount <= good)
		{
			System.out.println("		    _______________________________________________\r\n"
					+ "		    |                                             |\r\n"
					+ "		    |  ✪---------✪---------◌---------◌---------◌  |\r\n"
					+ "		    |                                             |\r\n"
					+ "		    TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
		}
		else if(amount <= solid)
		{
			System.out.println("		    _______________________________________________\r\n"
					+ "		    |                                             |\r\n"
					+ "		    |  ✪---------✪---------✪---------◌---------◌  |\r\n"
					+ "		    |                                             |\r\n"
					+ "		    TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
		}
		else if(amount <= amazing)
		{
			System.out.println("		    _______________________________________________\r\n"
					+ "		    |                                             |\r\n"
					+ "		    |  ✪---------✪---------✪---------✪---------◌  |\r\n"
					+ "		    |                                             |\r\n"
					+ "		    TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
		}
		else if(amount <= genius)
		{
			System.out.println("		    _______________________________________________\r\n"
					+ "		    |                                             |\r\n"
					+ "		    |  ✪---------✪---------✪---------✪---------✪  |\r\n"
					+ "		    |                                             |\r\n"
					+ "		    TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
		}
	}
	
	public static void play()
	{
		System.out.println("Ok " + name + ", to play, just keep typing in guesses! To see your progress, type 1. Try to get to genuis!!");
		winning = false;
		while(winning == false)
		{
			guess = userStringInput.nextLine();
			if(guess.equals("1"))
			{
				scoring();
			}
			else if(((Words) Letters.words).getName().equals(guess))
			{
				if(found.contains(guess))
				{
					System.out.println("You already found this, try again!");
				}
				else
				{
					for(int i = 0; i < Letters.words.size(); i++)
					{
						if(Letters.words.get(i).getName().equals(guess))
						{
							amount += Letters.words.get(i).getPoints();
						}
					}
			        found.add(guess); 
			        System.out.println("You found a word!");
				}
			}
			else
			{
				System.out.println("I'm sorry, that is not in the word database. Try again!");
			}
			if(amount == genius)
			{
				winning = true;
				System.out.println("Congrats, you beat the game!!!");
			}
		}
		
	}
}
