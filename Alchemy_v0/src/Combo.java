
public class Combo {
	/**Variables**/
	private Element e1;
	private Element e2;
	private Element result;
	
	/**Constructors**/
	public Combo()
	{
		e1 = null;
		e2 = null;
		result = null;
	}
	
	public Combo(Element element1, Element element2, Element m)
	{
		e1 = element1;
		e2 = element2;
		result = m;
	}
	
	/**Methods**/
	//returns if the element is used in the combo or not
	public boolean uses(Element e)
	{
		return e.equals(e1) || e.equals(e2);
	}
	
	//returns if a specific element is made
	public boolean makes(Element e)
	{
		return e.equals(result);
	}
	
	//sets the combo variables
	public void setCombo(Element element1, Element element2, Element creation)
	{
		e1 = element1;
		e2 = element2;
		result = creation;
	}
	
	//returns the string: e1 + e2 --> result
	public String toString()
	{
		return e1.toString() + " + " + e2.toString() + " --> " + result.toString();
	}
	
	//returns 
	public boolean isCombo(Element element1, Element element2)
	{
		return((element1.equals(e1) && element2.equals(e2) || (element1.equals(e2) && element2.equals(e1))));
	}
	
	public Element getResult()
	{
		return result;
	}
	
	public boolean equals(Combo c)
	{
		if(result.equals(c.getResult()) &&
				((e1.equals(c.getElement1()) && e2.equals(c.getElement2())) || e1.equals(c.getElement2()) && e2.equals(c.getElement1())))
						return true;
		return false;
			
	}
	
	public Element getElement1()
	{
		return e1;
	}
	
	public Element getElement2()
	{
		return e2;
	}
}
