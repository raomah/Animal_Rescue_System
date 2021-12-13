/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adopt;

import java.util.ArrayList;

/**
 *
 * @author Neha
 */

public class AdoptionRecordDirectory {
    private ArrayList<AdoptRecord> adoptionRecordList;

    public AdoptionRecordDirectory() {
        adoptionRecordList = new ArrayList<AdoptRecord>(); 
    }

    public ArrayList<AdoptRecord> getAdoptionRecordList() {
        return adoptionRecordList;
    }

    public void setAdoptionRecordList(ArrayList<AdoptRecord> adoptionRecordList) {
        this.adoptionRecordList = adoptionRecordList;
    }
    
    public void addAdoptionRecord(AdoptRecord r) {
        
        adoptionRecordList.add(r);
        
    }
    
    public void removeAdoptionRecord(AdoptRecord r) {
        
        adoptionRecordList.remove(r);
        
    }
    
}

