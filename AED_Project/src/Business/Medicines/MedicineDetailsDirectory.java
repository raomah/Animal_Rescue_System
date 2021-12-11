/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicines;

import java.util.ArrayList;

/**
 *
 * @author raomah
 */
public class MedicineDetailsDirectory {
    private ArrayList<MedicineDetails> medicineList;

    public MedicineDetailsDirectory() {
        medicineList = new ArrayList<MedicineDetails>(); 
    }

    public ArrayList<MedicineDetails> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<MedicineDetails> medicineList) {
        this.medicineList = medicineList;
    }
    
    public void addMedicine(MedicineDetails m) {
        medicineList.add(m);
    }
    
    public void removeMedicine(MedicineDetails m) {
        medicineList.remove(m);
    }
}
