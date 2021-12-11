/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employees;

import java.util.ArrayList;

/**
 *
 * @author raomah
 */
public class EmployeeDetailsDirectory {
    private ArrayList<EmployeeDetails> employeeList;

    public EmployeeDetailsDirectory() {
        employeeList = new ArrayList<EmployeeDetails>();
    }

    public ArrayList<EmployeeDetails> getEmployeeList() {
        return employeeList;
    }
    
    public EmployeeDetails createEmployee(String name){
        EmployeeDetails employee = new EmployeeDetails();
        employee.setEmpname(name);
        employeeList.add(employee);
        return employee;
    }
}
