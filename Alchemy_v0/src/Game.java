import java.util.ArrayList;


public class Game {
	/**Variables**/
	Normal key = new Normal();
	private ArrayList<Element> created = new ArrayList<Element>();
	private ArrayList<Combo> comboUsed = new ArrayList<Combo>();
	private Element[] possible;
	private int[] combosLeft;
	
	/**Constructor**/
	public Game()
	{
		possible = key.getElements();
		for(int i = 0; i < 4; i++)
			created.add(possible[i]);
		combosLeft = key.makeList();
	}
	
	/**Methods**/
	public boolean isCombo(Element e1, Element e2)
	{
		return key.isCombo(e1, e2);
	}
	
	//Precondition: Combo was not already implemented
	public void elementUsed(Element e)
	{
		combosLeft[key.indexOf(e)]--;
	}
	
	//returns if the element has been used to its fullest
	public boolean usedUp(Element e)
	{
		return combosLeft[key.indexOf(e)] <= 0;
	}
	
	//returns the resulting element and adds the combo and the element to the lists
	public Element makeCombo(Element e1, Element e2)
	{
		Element temp = key.becomes(e1, e2);
		
		
		if(!alreadyCreated(temp))
		{
			created.add(temp);
		}
		if(!alreadyMadeCombo(new Combo(e1, e2, temp)))
		{
			elementUsed(e1);
			elementUsed(e2);
			comboUsed.add(new Combo(e1, e2, temp));
		}
		
		
		return temp;
	}
	
	//returns if created already has an element
	public boolean alreadyCreated(Element e)
	{
		for(Element i : created)
			if(i.equals(e))
				return true;
		return false;
	}
	
	//returns if comboCreated already has a combo
	private boolean alreadyMadeCombo(Combo c)
	{
		for(Combo i : comboUsed)
			if(i.equals(c))
				return true;
		return false;
	}
	
	//prints the list of obtained elements to the screen
	public void printElements()
	{
		int i = 0;
		for(Element e : created)
		{
			if(combosLeft[key.indexOf(e)] > 0)
			{
				i++;
				System.out.print(e.getName() + "      ");
				
				if(i >= 10)
				{
					i = 0;
					System.out.println();
				}
			}
		}
	}
	
	public boolean won()
	{
		for(int i : combosLeft)
			if(i > 0)
				return false;
		return true;
	}

	public String createdElementLetterSwitch(Element e) {
		for(Element check : created)
		{
			if(check.getName().length() == e.getName().length())
			{
				if(hasSwitchedLetter(e, check))
				{
					return check.getName();
				}
			}
		}
		return "-1";
	}

	/**Improvement - check if the two false in same are actaully the switched ones**/
	private boolean hasSwitchedLetter(Element e, Element check) {
		boolean[] same = new boolean[e.getName().length()];
		int count = 0;
		
		for(int i = 0; i < e.getName().length(); i++)
		{
			same[i] = e.getName().charAt(i) == check.getName().charAt(i) ? true : false;
			if(!same[i])
				count++;
		}
		
		//checks if boolean has two falses
		if(count == 1)
			return true;
		if(count != 2)
			return false;
		
		for(int i = 0; i < same.length; i++)
		{
			if(!same[i])
			{
				//checks if the Element check contains the switched letter in Element e
				if(!check.getName().contains(String.valueOf(e.getName().charAt(i))))
				{
					return false;
				}
			}
		}
		
		return true;
		
	}

	public String addedALetter(Element tempE) {
		for(Element c : created)
		{
			if(tempE.getName().length() - 1 == c.getName().length())
			{
				if(tempE.getName().contains(c.getName()))
					return c.getName();
				if(compare(tempE, c))
					return c.getName();
			}
		}
		
		return "-1";
	}
	
	public boolean compare(Element extra, Element ori)
	{
		int count = 0;
		for(int i = 0; i < ori.getName().length(); i++)
		{
			if(i + count >= extra.getName().length())
				return false;
			if(extra.getName().charAt(i + count) != ori.getName().charAt(i))
			{
				count++;
			}
		}
		
		return count == 1;
	}

	public void printALL() {
		int i = 0;
		for(Element c : created)
		{
			System.out.print(c.getName() + "    ");
			
			i++;
			
			if(i > 10)
			{
				System.out.println();
				i = 0;
			}
		}
		
	}

}
