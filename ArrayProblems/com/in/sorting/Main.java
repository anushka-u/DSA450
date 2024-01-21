package com.in.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(121, "Kartik",34908.00));
		emp.add(new Employee(120, "Kirti",4536210.98));
		emp.add(new Employee(119, "Kirtika",98765.987));
		emp.add(new Employee(122, "Karan",876543.09));
		emp.add(new Employee(125, "Kusum",2345213.09));
		emp.add(new Employee(126, "Kanak",56437.90));

		//It will use Employee class comparator which will sort data as per id
		Collections.sort(emp);
		System.out.println(emp);

		//to sort the data using name
		Collections.sort(emp,new EmployeeComparator());
		System.out.println(emp);


		Collections.sort(emp, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (o1.getSalary()>o2.getSalary())?1 : (o1.getSalary()==o2.getSalary() ? 0:-1);
			}
		});
		System.out.println(emp);
		
		
		
	}

}
