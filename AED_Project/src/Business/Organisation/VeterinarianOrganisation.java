/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.AllRoles;
import Business.Role.VeterinarianRole;
import Business.Treatment.TreatmentRecordDetailsDirectory;
import java.util.ArrayList;

/**
 *
 * @author raomah
 */
public class VeterinarianOrganisation extends OrganisationMain{
    
    private TreatmentRecordDetailsDirectory treatmentRecordDir;
    
    public VeterinarianOrganisation() {
        super(OrganisationMain.Type.Vete.getValue());
    }

    public TreatmentRecordDetailsDirectory getTreatmentRecordDir() {
        return treatmentRecordDir;
    }

    public void setTreatmentRecordDir(TreatmentRecordDetailsDirectory treatmentRecordDir) {
        this.treatmentRecordDir = treatmentRecordDir;
    }
    
    @Override
    public ArrayList<AllRoles> getSupportedRole() {
        ArrayList<AllRoles> roles = new ArrayList<AllRoles>();
        roles.add(new VeterinarianRole());
        return roles;
    }

}
