package week3.day2assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };

		Set<Integer> num = new TreeSet<Integer>();
		for (int eachdata : data) {
			num.add(eachdata);
		}

		System.out.println(num);
		List<Integer> secnum = new ArrayList<Integer>();
		secnum.addAll(num);
		int large = secnum.size();
		int lar2 = secnum.get(large - 2);
		System.out.println("2nd largest is: " + lar2);

	}

}
