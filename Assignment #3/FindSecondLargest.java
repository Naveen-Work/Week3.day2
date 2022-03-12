package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
	
public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a =Arrays.asList(3,2,11,4,6,7);		
		Collections.sort(a);
		System.out.println(a);
		int s=a.size()-2;
		System.out.println("2nd Largest Number is:"+a.get(s));
		
		
	}

}
