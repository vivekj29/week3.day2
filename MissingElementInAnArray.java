package week3.day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> missnum = new ArrayList<Integer>();
		for(int eachdata:arr)
		{
			missnum.add(eachdata);
		}
		
		Collections.sort(missnum);
		System.out.println("Sorted list" +missnum);
		
		int len = missnum.size();
		for(int i=1; i < len; i++)
		{
			if(missnum.get(i-1) == i)
				{
				}
			else if(missnum.get(i-1) != i)
			{
				System.out.println("The missing number is " +i);
			} 
			i++;
		}

}
	
}
