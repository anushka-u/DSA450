package com.in.sorting;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Employee(int id, String name)
	{
		this.empId=id;
		this.empName = name;
	}
	
	public int compareTo(Employee o) {
		//(x < y) ? -1 : ((x == y) ? 0 : 1);
		return (o.empId<this.empId)?1:((o.empId==this.empId)?0:-1);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EmpId is" + empId + " EmpName is "+empName + "EmpSalary is " + salary;
	}


}
