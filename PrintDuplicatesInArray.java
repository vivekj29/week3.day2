package week3.day2assignments;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		List<Integer> dup = new ArrayList<Integer>();
		int count = 0;
		for (int eachdata : arr) {
			dup.add(eachdata);
		}

		for (int i = 0; i < dup.size(); i++) {
			for (int j = 1; j < dup.size(); j++) {
				if (dup.get(i) == dup.get(j))
					count++;
			}
		}
		if (count > 0)
			System.out.println("The duplicate value is " + count);

	}

}
