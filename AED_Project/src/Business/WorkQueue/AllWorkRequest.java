/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Date.Date;
import Business.UserAccount.UserAccountDetails;

/**
 *
 * @author user
 */
public abstract class AllWorkRequest {
    
    private UserAccountDetails wresender;
    private UserAccountDetails wrereceiver;
    private String wremessage;
    private String wrestatus;
    private Date wrerequestDate;
    private Date wreresolveDate;
    
    public AllWorkRequest()
    {
        wrerequestDate = new Date();
    }

    public String getWremessage() 
    {
        return wremessage;
    }

    public void setWremessage(String wremessage) 
    {
        this.wremessage = wremessage;
    }

    public UserAccountDetails getWresender() 
    {
        return wresender;
    }

    public void setWresender(UserAccountDetails wresender) 
    {
        this.wresender = wresender;
    }

    public UserAccountDetails getWrereceiver() 
    {
        return wrereceiver;
    }

    public void setWrereceiver(UserAccountDetails wrereceiver) 
    {
        this.wrereceiver = wrereceiver;
    }

    public String getWrestatus() 
    {
        return wrestatus;
    }

    public void setWrestatus(String wrestatus) 
    {
        this.wrestatus = wrestatus;
    }

    public Date getWrerequestDate() 
    {
        return wrerequestDate;
    }

    public void setWrerequestDate(Date wrerequestDate) 
    {
        this.wrerequestDate = wrerequestDate;
    }

    public Date getWreresolveDate() 
    {
        return wreresolveDate;
    }

    public void setWreresolveDate(Date wreresolveDate) 
    {
        this.wreresolveDate = wreresolveDate;
    }
}
