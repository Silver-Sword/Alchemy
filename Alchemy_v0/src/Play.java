/**
 * Alchemy Version 0
 * 
 * Lilly Gittings
 * 
 * A combination/evolution game
 * Improvements:
 * 		
 * 		check to see if the game actually stops when player has won
 * 
 */

/**Need more combos:
 * earth
 * swamp
 */
import java.util.Scanner;

public class Play {
	
	public static void main(String[] args)
	{
		/**Variables**/
		Game game = new Game();
		Scanner scan = new Scanner(System.in);
		String userInput, userE1, userE2;
		Element e1, e2;
		
		/**Start of Game**/
		System.out.println(center() + "Welcome to the Alchemy Game!");
		System.out.print("\n\n\nWould you like to hear the rules? (y/n): ");
		userInput = scan.nextLine().toLowerCase();
		
		//if the user inputs a version of yes, then they will get a sequence of instructions
		if(userInput.equals("yes") || userInput.equals("y"))
		{
			System.out.print("\n\nThe goal of the game is to mix all the elements together and create all the combos."
					+ "\nOnly certain elements combine to make other elements."
					+ "\nWhen the game begins, you will be prompted to enter two elements, which will combine if possible."
					+ "\nThe list of your elements will appear above the command line."
					+ "\n\nHint: elements can combine with themself"
					+ "\nTo see all your elements, type \"ALL\" when prompted for an element"
					+ "\n\nStart: (press enter to continue)");
			scan.nextLine();			
		}
		
		System.out.println("\n\n\n\n\n\n");
		
		//Start of the game
		do{
			game.printElements();
			userE1 = getElement(scan, 1, game);
			userE2 = getElement(scan, 2, game);
			
			e1 = new Element(userE1);
			e2 = new Element(userE2);
			
			//if the user entered a possible combo
			if(game.isCombo(e1, e2))
			{
				center();
				System.out.println("You made an Element: " + game.makeCombo(e1, e2) + "!\n");
				if(game.usedUp(e1))
				{
					center();
					System.out.println("You've found all the combos for " + e1.toString() + "!\n");
				}
				if(game.usedUp(e2) && !e2.equals(e1))
				{
					System.out.println("You've found all the combos for " + e2.toString() + "!\n");
				}
			}
			
			//if the user entered an incorrect combo
			else
			{
				center();
				System.out.println("Not a Combo\n");
			}
		} while(!game.won());
		
		System.out.println("\n\n\n\n\n\n\n\n" + center() + "You've won!!!!!");
	}
	
	public static String getElement(Scanner scan, int id, Game game)
	{
		String temp;
		Element tempE;
		boolean isReal = false;
		do{
			System.out.print("\nElement " + id + ": ");
			temp = scan.nextLine();
			temp = temp.trim();
			
			//shows all elements
			if(temp.equals("ALL") || temp.equals("\"ALL\""))
			{
				System.out.println("\n");
				game.printALL();
				System.out.println("\n");
			}
			
			//checks if the Element typed exists
			else{
			temp = temp.toLowerCase();
			tempE = new Element(temp);
			
			if(game.alreadyCreated(tempE))
				return temp;
			
			String t = game.createdElementLetterSwitch(tempE);
			if(!t.equals("-1"))
			{
				return t;
			}
			
			t = game.addedALetter(tempE);
			if(!t.equals("-1"))
			{
				return t;
			}
			}	
			
		} while(!isReal);
		
		return temp;
	}
	
	
	public static String center()
	{
		return "\n\t\t\t\t\t\t";
	}
}
