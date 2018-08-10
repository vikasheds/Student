package com.javagf.school;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		return s1.getAge().compareTo(s2.getAge());
	}
}
