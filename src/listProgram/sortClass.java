package listProgram;

import java.util.Comparator;

public class sortClass implements Comparator<Student> {

	// Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
	}

	/*
	 * @Override public int compare(Student a, Student b) { // TODO Auto-generated
	 * method stub return a.rollno - b.rollno; }
	 */

}
