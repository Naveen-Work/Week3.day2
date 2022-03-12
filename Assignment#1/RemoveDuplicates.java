package week3.day2;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";

		int count = 0;
		String[] split = text.split(" ");
		List<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		List<String> list5 = new ArrayList<String>();
		Set<String> set5 = new HashSet<String>();
		Set<String> set6 = new TreeSet<String>();
		Set<String> set7 = new LinkedHashSet<String>();
		// System.out.println("List with all values Input: "+list);
		for (String string : split) {
			list.add(string);
			list1.add(string);
			list2.add(string);
			list3.add(string);
			list4.add(string);
			list5.add(string);
			set5.add(string);
			set6.add(string);
			set7.add(string);
			if (string.equalsIgnoreCase("java")) {
				count++;
				if (count >= 2) {
					list.remove(string);
				}
			}

		}
		System.out.println("List with all values Input: " + list1);
		System.out.println("List after duplicate removed using text: " + list);// Insertion order but removes first
		// duplicates.
		System.out.println(
				"**********************************************************************************************************");

		// List another option to remove the duplicates
		System.out.println("List with all values Input: " + list1);
		for (int i = 0; i < list1.size(); i++) {
			for (int j = i + 1; j < list1.size(); j++) {
				if (list1.get(i).equalsIgnoreCase(list1.get(j))) {
					list1.remove(j);
				}
			}
		}
		System.out.println("List remove duplicates output using index: " + list1);// Insertion order but removes
		// duplicates using index.
		System.out.println(
				"**********************************************************************************************************");

		// Set - HashSet
		System.out.println("List with all values Input: " + list2);
		Set<String> set = new HashSet<>(list2);
		System.out.println("HashSet Output using List&Set: " + set);// Random output but removes duplicates.
		System.out.println(
				"**********************************************************************************************************");

		// Set - TreeSet
		System.out.println("List with all values Input: " + list3);
		Set<String> set1 = new TreeSet<>(list3);
		System.out.println("TreeSet Output using List&Set: " + set1);// Ordered/Sorted output but removes duplicates.
		System.out.println(
				"**********************************************************************************************************");

		// Set -LinkedHashSet
		System.out.println("List with all values Input: " + list4);
		Set<String> set2 = new LinkedHashSet<>(list4);
		System.out.println("LinkedHashSet Output using List&Set: " + set2);// Insertion order output but removes
		// duplicates.
		System.out.println(
				"**********************************************************************************************************");

		// HashSet all the input assigned it and output
		System.out.println("HashSet Output: " + set5); // Random output but removes duplicates.
		System.out.println(
				"**********************************************************************************************************");
		// Set - TreeSet
		System.out.println("TreeSet Output: " + set6); // Ordered/Sorted output but removes duplicates.
		System.out.println(
				"**********************************************************************************************************");

		// Set -LinkedHashSet
		System.out.println("LinkedHashSet Output:" + set7); // Insertion order output but removes duplicates.
		System.out.println(
				"**********************************************************************************************************");

		System.out.println(list5);
		System.out.println(list5.set(2, "New"));
		System.out.println(list5.add("Testing"));
		System.out.println(list5.contains("Java"));
		System.out.println(list5.get(4));
		System.out.println(list5.equals("Test"));
		System.out.println(list5.addAll(set2));
		System.out.println(list5.containsAll(set2));
		System.out.println(list5.indexOf("java"));
		System.out.println(list5.isEmpty());
		System.out.println(list5.lastIndexOf("java"));
		System.out.println(Collections.replaceAll(list5, "java", "JAVA"));
		System.out.println(list5);

		String ss = "We learn java basics as part of java sessions in java week1";
		String[] split1 = text.split(" ");
		Set<String> unique = new HashSet<String>();
		Set<String> dups = new HashSet<String>();
		Set<String> s11 = new HashSet<String>();
		for (String a : split1) {
			s11.add(a);
		}
		System.out.println(s11.size() + " distinct words: " + s11);

		for (String a : split1) {
			if (!unique.add(a))
				dups.add(a);
		}
		// Remove duplicates
		unique.removeAll(dups);

		System.out.println("Unique words:    " + unique);
		System.out.println("Duplicate words: " + dups);
	}

}
