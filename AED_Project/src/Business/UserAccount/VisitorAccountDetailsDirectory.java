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
import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class VisitorAccountDetailsDirectory{
    private ArrayList<VisitorAccountDetails> visitorAccountList;

    public VisitorAccountDetailsDirectory() {
        visitorAccountList = new ArrayList();
    }

    public ArrayList<VisitorAccountDetails> getVisitorAccountList() {
        return visitorAccountList;
    }
    
    public VisitorAccountDetails authenticateUser(String username, String password){
        for (VisitorAccountDetails va : visitorAccountList)
            if (va.getUsername().equals(username) && va.getPassword().equals(password)){
                return va;
            }
        return null;
    }
    
    public VisitorAccountDetails createUserAccount(String username, String password, AdopterDetail adoptor){
        VisitorAccountDetails visitorAccount = new VisitorAccountDetails();
        visitorAccount.setUsername(username);
        visitorAccount.setPassword(password);
        visitorAccount.setAdoptorname(adoptor);
        visitorAccountList.add(visitorAccount);
        return visitorAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (VisitorAccountDetails va : visitorAccountList){
            if (va.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
