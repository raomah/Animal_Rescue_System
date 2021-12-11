/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Treatment;

import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class TreatmentRecordDetailsDirectory {
    private ArrayList<TreatmentRecordDetails> treatmentRecordList;

    public TreatmentRecordDetailsDirectory() {
        treatmentRecordList = new ArrayList<TreatmentRecordDetails>(); 
    }

    public ArrayList<TreatmentRecordDetails> getTreatmentRecordList() {
        return treatmentRecordList;
    }

    public void setTreatmentRecordList(ArrayList<TreatmentRecordDetails> treatmentRecordDir) {
        this.treatmentRecordList = treatmentRecordDir;
    }
    
    public void addTreatmentRecord(TreatmentRecordDetails r) {
        treatmentRecordList.add(r);
    }
    
    public void removeTreatmentRecord(TreatmentRecordDetails r) {
        treatmentRecordList.remove(r);
    }
    
}
