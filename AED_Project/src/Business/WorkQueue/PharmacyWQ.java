/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class PharmacyWQ 
{
    private ArrayList<PharmacyWre> workRequestList;

    public PharmacyWQ() 
    {
        workRequestList = new ArrayList<PharmacyWre>();
    }

    public ArrayList<PharmacyWre> getWorkRequestList() 
    {
        return workRequestList;
    }
}
