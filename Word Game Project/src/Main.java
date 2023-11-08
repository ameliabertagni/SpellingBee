import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static Scanner userInput = new Scanner(System.in);
	static int level;
	static String name;
	
	public static void main(String[] args)
	{
		intro();
		board();
	}
	
	public static void intro()
	{
		System.out.println("Hi, welcome to Spelling Bee! To play, use the letters from the board shown!\n\n	*Words must contain at least four letters.\n	*Words must include the center letter.\n	*No cussing.\n	*Letters can be used any amount of times.\n\n Score points to increase your skill level!\n	*4-letter words are worth 1 point each.\n	*Longer words earn an extra point per letter.\n	*Each puzzle includes at least one panagram (a word that uses every letter). \n	 These are worth an extra 7 points!\n\n Ready to play? Enter your name below!");
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
		    System.out.println("     |     | |     |   ");
		    System.out.println("     ------- -------	  ");
		    System.out.println(" ------- ------- -------");
		    System.out.println(" |     | |     | |     |");
		    System.out.println(" ------- ------- -------");
		    System.out.println("     ------- -------	  ");
		    System.out.println("     |     | |     |   ");
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
		for(int i = 0; i <= 16; i++)
			{
				System.out.println("\n");
			}
	}
	
	public static void found()
	{
		
	}
	
	public static void play()
	{
		
	}
}
