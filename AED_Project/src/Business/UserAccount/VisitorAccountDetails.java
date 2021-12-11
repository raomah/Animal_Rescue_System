/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Adopt.AdopterDetail;
import Business.Employees.EmployeeDetails;
import Business.Role.AllRoles;
import Business.WorkQueue.AllWorkQueue;

/**
 *
 * @author krishna
 */
public class VisitorAccountDetails{
    private String username;
    private String password;
    private AdopterDetail adoptorname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AdopterDetail getAdoptorname() {
        return adoptorname;
    }

    public void setAdoptorname(AdopterDetail adoptorname) {
        this.adoptorname = adoptorname;
    }
    
}
