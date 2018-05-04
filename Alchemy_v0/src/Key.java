import java.util.ArrayList;

/**
 * Combines Elements
 * An extension of this will contain a specific variation of the game
 *
 */
public class Key {
	/**Variables**/
	private ArrayList<Combo> combos;
	
	/**Constructor**/
	public Key()
	{
		combos = new ArrayList<Combo>();
	}
	
	/**Methods**/
	//adds a combination of elements to the list
	public void addCombo(Element e1, Element e2, Element result)
	{
		if(combos.isEmpty())
		{
			combos.add(0, new Combo(e1, e2, result));
			return;
		}
		combos.add(new Combo(e1, e2, result));
	}
	
	public void addCombo(Combo c)
	{
		combos.add(c);
	}
	
	//checks to see if two elements combine
	public boolean isCombo(Element e1, Element e2)
	{
		for(int i = 0; i < combos.size(); i++)
		{
			if(combos.get(i).isCombo(e1, e2))
			{
				return true;
			}
		}
		return false;
	}
	
	//returns the element that is made from the two elements in the parameter
	public Element becomes(Element e1, Element e2)
	{
		for(Combo c : combos)
		{
			//if the elements both match for a single combo
			if(c.isCombo(e1, e2))
			{
				return c.getResult();
			}
		}
		return null;
	}

	//returns if the element is part of the combination
	public int canMake(Element e)
	{
		int outcome = 0;
		for(int i = 0; i < combos.size(); i++)
		{
			if(combos.get(i).getElement1().equals(e))
				outcome++;
			if(combos.get(i).getElement2().equals(e))
				outcome++;
		}
		
		return outcome;
	}
	
}
