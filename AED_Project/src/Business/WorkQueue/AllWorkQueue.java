/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AllWorkQueue {
    private ArrayList<AllWorkRequest> workRequestList;

    public AllWorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<AllWorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
