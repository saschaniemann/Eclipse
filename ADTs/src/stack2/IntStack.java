package stack2;

public interface IntStack
{
	/**
	 * Pr�ft, ob der Keller leer ist.
	 * 
	 * @return true, wenn der Keller leer ist
	 */
	boolean isEmpty();
	
	/**
	 * Pr�ft, ob der Keller voll ist.
	 * 
	 * @return true, wenn der Keller voll ist
	 */
	boolean isFull();
	
	/**
	 * Liefert das oberste Keller-Element (ohne es zu l�schen).
	 * 
	 * @return das oberste Keller-Element
	 */
	int top();
	
	/**
	 * Legt das �bergebene Element oben auf den Keller.
	 * 
	 * @param x das zu speichernde Element
	 */
	void push(int x);

	/**
	 * L�scht und liefert das oberste Keller-Element.
	 * 
	 * @return das oberste Keller-Element
	 */
	int pop();
	
	/**
	 * Liefert die Anzahl der im Keller gespeicherten Elemente
	 *
	 * @return Anzahl der Keller-Elemente
	 */
	int size();
}
