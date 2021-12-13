/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employees;

/**
 *
 * @author raomah
 */
public class EmployeeDetails {
    private String empname;
    private int empid;
    private static int count = 1;

    public EmployeeDetails() {
        empid = count;
        count++;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    
    public String getEmpname() {
        return empname;
    }

    @Override
    public String toString() {
        return empname;
    }
    
}
