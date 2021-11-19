package week3.day2assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;

		char[] chars = text.toCharArray();
		Set<Character> dup = new HashSet<Character>();
		for (char c : chars)
		    if (dup.add(c))
		        chars[count++] = c;

		System.out.println(new String(chars, 0, count));
		
	}   
	 

}
