/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Employees.EmployeeDetailsDirectory;
import Business.Role.AllRoles;
import Business.UserAccount.UserAccountDetailsDirectory;
import Business.WorkQueue.AllWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raomah
 */
public abstract class OrganisationMain {
    private String orgname;
    private AllWorkQueue workQueue;
    private EmployeeDetailsDirectory employeeDir;
    private UserAccountDetailsDirectory userAccountDir;
    private int organisationID;
    private static int counter;
    
    public OrganisationMain(String name) {
        this.orgname = name;
        workQueue = new AllWorkQueue();
        employeeDir = new EmployeeDetailsDirectory();
        userAccountDir = new UserAccountDetailsDirectory();
        organisationID = counter;
        ++counter;
    }
    
    public enum Type{
        EnterpriseAdmin("Enterprise Admin Organization"),
        CenterRegistration("Registration"),
        Vete("Veterinarian Organization"),
        Pharmacy("Pharmacy Organization"),
        Cage("Cage Organization"),
        Delivery("Delivery Organization"),
        Shelter("Shelter Organization"),
        Adoption("Adoption Inspection Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public abstract ArrayList<AllRoles> getSupportedRole();
    
    public UserAccountDetailsDirectory getUserAccountDir() {
        return userAccountDir;
    }

    public void setEmployeeDir(EmployeeDetailsDirectory employeeDir) {
        this.employeeDir = employeeDir;
    }

    public void setUserAccountDir(UserAccountDetailsDirectory userAccountDir) {
        this.userAccountDir = userAccountDir;
    }

    public int getOrganisationID() {
        return organisationID;
    }

    public EmployeeDetailsDirectory getEmployeeDir() {
        return employeeDir;
    }
    
    public String getOrgname() {
        return orgname;
    }

    public AllWorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public void setWorkQueue(AllWorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return orgname;
    }
}
