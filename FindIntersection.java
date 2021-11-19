package week3.day2assignments;

import java.util.Arrays;
import java.util.HashSet;

public class FindIntersection {

	public static void main(String[] args) 
	  {
	    Integer[] arr1 = {3,2,11,4,6,7};
	    Integer[] arr2 = {1,2,8,4,9,7};
	     
	    HashSet<Integer> set = new HashSet<Integer>(); 
	     
	    set.addAll(Arrays.asList(arr1));
	     
	    set.retainAll(Arrays.asList(arr2));
	     
	    System.out.println(set);
	     
	    Integer[] intersection = {};
	    intersection = set.toArray(intersection);
	     
	    System.out.println(Arrays.toString(intersection));
	  }
}
