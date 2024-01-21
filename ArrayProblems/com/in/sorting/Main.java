package com.in.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(121, "Kartik"));
		emp.add(new Employee(120, "Kirti"));
		emp.add(new Employee(119, "Kirtika"));
		emp.add(new Employee(122, "Karan"));
		emp.add(new Employee(125, "Kusum"));
		emp.add(new Employee(126, "Kanak"));

		//It will use Employee class comparator which will sort data as per id
		Collections.sort(emp);
		System.out.println(emp);

		//to sort the data using name
		Collections.sort(emp,new EmployeeComparator());
		System.out.println(emp);


		
		
		
	}

}
