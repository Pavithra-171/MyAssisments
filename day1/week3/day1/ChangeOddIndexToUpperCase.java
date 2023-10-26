package week3.day1;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch = test.toCharArray();
		
		for( int i=0; i<ch.length; i++)
		{
			int a = i % 2;
			if(a==1)
			{
				ch[i] = Character.toUpperCase(ch[i]);
			}
			System.out.println(ch[i]);
		}
		
		
		
		

	}

}
