
public class Element {
	/**Variables**/
	private String name;
	
	/**Constructor**/
	public Element(String n)
	{
		name = n;
	}
	
	/**Methods**/
	//checks if two elements are the same
	public boolean equals(Element e)
	{
		return name.equals(e.getName());
	}
	
	//returns the name of the element
	public String getName()
	{
		return name;
	}
	
	//prints out the name of the element
	public void getString()
	{
		System.out.println(name);
	}
	
	//returns the name of the element
	public String toString()
	{
		return name;
	}
}
