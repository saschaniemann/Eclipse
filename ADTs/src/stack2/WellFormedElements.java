package stack2;

import java.util.Scanner;

public class WellFormedElements 
{
	public static boolean isWellFormed(String t)
	{
		CharStack s = new CharArrayStack();
		
		for(int k=0; k < t.length(); k++) 
		{
			char c = t.charAt(k);
			
			if(c=='(')
				s.push(c);
			else if(!s.isEmpty())
				s.pop();
			else 
				return false;
		}
		if(s.isEmpty())
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String t = s.nextLine();
		s.close();
		
		if( isWellFormed(t) )
			System.out.println("well-formed");
		else
			System.out.println("NOT well-formed");
	}
}