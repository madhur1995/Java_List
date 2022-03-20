package listProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class arrayListClassObj {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ArrayList<Student> s = new ArrayList<>();

		s.add(new Student(10, "Aman", 19));
		s.add(new Student(18, "Yogi", 23));
		s.add(new Student(17, "Rohit", 12));
		s.add(new Student(5, "Rahul", 5));
		s.add(new Student(2, "Naaman", 17));

		Set<Student> set = new LinkedHashSet<>();

		set.add(new Student(10, "Aman", 19));
		set.add(new Student(10, "Aman", 19));
		set.add(new Student(10, "Aman", 19));

		Set<Integer> set1 = new LinkedHashSet<>();

		set1.add(1);
		set1.add(1);
		set1.add(1);

		System.out.println(set1);

		System.out.println(set + "  ");

		// Collections.sort(s, new sortClass());

		Collections.sort(s);

		for (Student customer : s) {
			System.out.println(customer);
		}

	}

}
