/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employees.EmployeeDetails;
import Business.Role.AllRoles;
import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class UserAccountDetailsDirectory {
    private ArrayList<UserAccountDetails> userAccountList;

    public UserAccountDetailsDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccountDetails> getUserAccountList() 
    {
        return userAccountList;
    }
    
    public UserAccountDetails authenticateUser(String username, String password)
    {
        for (UserAccountDetails ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPass().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccountDetails createUserAccount(String username, String password, EmployeeDetails employee, AllRoles role)
    {
        UserAccountDetails userAccount = new UserAccountDetails();
        userAccount.setUsername(username);
        userAccount.setPass(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username)
    {
        for (UserAccountDetails ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
