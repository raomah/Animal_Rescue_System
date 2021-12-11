/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employees.EmployeeDetails;
import Business.Role.AllRoles;
import Business.WorkQueue.AllWorkQueue;

/**
 *
 * @author krishna
 */
public class UserAccountDetails {
    private String username;
    private String pass;
    private EmployeeDetails employee;
    private AllRoles role;
    private AllWorkQueue workQueue;

    public UserAccountDetails() {
        workQueue = new AllWorkQueue();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public AllRoles getRole() {
        return role;
    }

    public void setEmployee(EmployeeDetails employee) {
        this.employee = employee;
    }

    public void setRole(AllRoles role) {
        this.role = role;
    }

    public EmployeeDetails getEmployee() {
        return employee;
    }

    public AllWorkQueue getWorkQueue() {
        return workQueue;
    }
    
    @Override
    public String toString() {
        return username;
    }
}
