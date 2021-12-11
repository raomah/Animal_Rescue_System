/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Medicines.MedicineDetails;
import Business.Place.PlaceDetails;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PharmacyWre extends AllWorkRequest {
    private ArrayList<PharmacyUnitWre> medicineList;
    private boolean assigned;
    
    public PharmacyWre() {
        medicineList = new ArrayList<PharmacyUnitWre>();
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }
    
    public ArrayList<PharmacyUnitWre> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<PharmacyUnitWre> medicineList) {
        this.medicineList = medicineList;
    }
    
    public void addRequest(PharmacyUnitWre u) {
        medicineList.add(u);
    }

}
