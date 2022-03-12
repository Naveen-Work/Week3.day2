package week3.day2;

import java.util.*;
import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(3, 2, 11, 4, 6, 7);
		List<Integer> b = Arrays.asList(1, 2, 8, 4, 9, 7);

		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				if (a.get(i).equals(b.get(j))) {
					System.out.println("Matched values are: " + b.get(i));
				}
			}

		}
	}

}
