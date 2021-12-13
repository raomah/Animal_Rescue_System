/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RescueRecord;

import java.util.ArrayList;

/**
 *
 * @author raomah
 */
public class RescueRecordDetailsDirectory {
    private ArrayList<RescueRecordDetails> rescueRecordList;

    public RescueRecordDetailsDirectory() {
        rescueRecordList = new ArrayList<RescueRecordDetails>(); 
    }

    public ArrayList<RescueRecordDetails> getRescueRecordList() {
        return rescueRecordList;
    }

    public void setRescueRecordList(ArrayList<RescueRecordDetails> rescueRecordList) {
        this.rescueRecordList = rescueRecordList;
    }
    
    public void addRescueRecord(RescueRecordDetails r) {
        rescueRecordList.add(r);
    }
    
    public void removeRescueRecord(RescueRecordDetails r) {
        rescueRecordList.remove(r);
    }
    
}
