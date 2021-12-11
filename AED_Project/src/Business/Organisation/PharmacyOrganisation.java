/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.PharmacistRole;
import Business.Role.AllRoles;
import Business.Medicines.MedicineDetailsDirectory;
import Business.WorkQueue.AllWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raomah
 */
public class PharmacyOrganisation extends OrganisationMain{
    private MedicineDetailsDirectory medicineDirectory;
    private AllWorkQueue workQueue;
    
    
    public PharmacyOrganisation() {
        super(OrganisationMain.Type.Pharmacy.getValue());
    }

    public MedicineDetailsDirectory getMedicineDirectory() {
        return medicineDirectory;
    }

    public void setMedicineDirectory(MedicineDetailsDirectory medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }
    
    @Override
    public ArrayList<AllRoles> getSupportedRole() {
        ArrayList<AllRoles> roles = new ArrayList<AllRoles>();
        roles.add(new PharmacistRole());
        return roles;
    }

    
}
