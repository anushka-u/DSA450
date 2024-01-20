package com.in.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(90);
		l1.add(0);
		l1.add(240);
		l1.add(87);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}

}
