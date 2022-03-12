package week3.day2;

import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 2, 3, 4, 7, 6, 8);

		for (int i = 1; i < a.size(); i++) {
			if (!a.contains(i)) {
				System.out.println("Missing Number is: " + i);
			}

		}

	}
}
