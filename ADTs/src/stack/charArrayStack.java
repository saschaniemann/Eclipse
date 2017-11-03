package stack;

/**
 * @author sascha.niemann
 * @version 1.0
 */

public class charArrayStack implements charStack 
{

	private char[] data;
	private int top; //Idx des n�chsten freien Platzes im Array
	
	public charArrayStack()
	{
		data = new char[10];
		top  = 0;	
	}
	
	/**
	 * Pr�ft, ob der Keller leer ist.
	 * 
	 * @return true, wenn der Keller leer ist.
	 */
	
	public boolean isEmpty() 
	{
		return top==0;
	}

	/**
	 * Liefert das oberste Keller-Element.
	 * 
	 * @return oberstes Keller-Element
	 */
	
	public char top() 
	{
		if(isEmpty())
			throw new RuntimeException("in top: Keller leer!");
			
		return data[top-1];
	}

	/**
	 * Speichert das Element oben auf dem Keller.
	 * 
	 * @param inhalt Keller-Element, dass gespeichert werden soll.
	 */
	
	public void push(char inhalt)
	{
		if(top == data.length)
			throw new RuntimeException("in push: Keller voll!");
		
		data[top] = inhalt;
		top++;
	}

	/**
	 * Entfernt und liefert das oberste Keller-Element.
	 * 
	 * @return oberstes Keller-Element
	 */
	
	public char pop() 
	{
		if(isEmpty())
			throw new RuntimeException("in pop: Keller leer!");
		
		top--;
		return data[top];
	}
	
	/**
	 * Pr�ft, ob der Keller voll ist.
	 * 
	 * @return true, wenn jede Stelle im Keller besetzt ist.
	 */
	
	public boolean isFull()
	{
		return top==data.length;
	}
	
	/**
	 * Liefert die Anzahl an gespeicherten Keller-Elementen
	 * @return Anzahl an gespeicherten Keller-Elementen 
	 */
	public int size()
	{
		return top;
	}
	
	/**
	 * Liefert die gespeicherten Keller-Elemente als String.
	 *@return Die gespeicherten Keller-Elemente als String
	 */
	public String toString()
	{
		String s = "";
		if(top==0) return s;
		for(int i=0; i<top-1; i++)
		{
			s+=data[i] + ",";
		}
		s+=data[top-1];
		return s;
	}
}