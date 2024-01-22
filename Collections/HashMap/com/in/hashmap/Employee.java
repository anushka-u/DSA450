package com.in.hashmap;

public class Employee {

    private Integer empId;
    private String empName;
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee Id : " + empId + " Employee Name : "+empName;
    }

    @Override
    public int hashCode() {
        return empId;
    }

    public Employee(Integer empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    /*


    This equal() method is overriden so that it can check if an element/key is duplicate or not
    A key will be considered duplicate if the name and id both will be same



     */
    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee)obj;
        if(this.empId == e.empId && this.empName.equals(e.getEmpName()))
            return  true;
        else
            return false;

    }
}
