package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInList {

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20);
		List<Integer> c =new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			for (int j = i+1; j <a.size(); j++) {
				if(a.get(i).equals(a.get(j))) {
					c.add(a.get(j));
				}
			}
		}
		System.out.println("Duplicates are :"+c);
		
		Set<Integer> set=new HashSet<Integer>();
		set.addAll(a);
		System.out.println(set);
		
	}
}

