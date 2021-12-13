/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.AllRoles;
import Business.Role.ShelterEmpRole;
import Business.ShelterCell.ShelterCellDetailsDirectory;
import Business.Deliver.VehicleDirectoryDetails;
import java.util.ArrayList;

/**
 *
 * @author raomah
 */
public class ShelterOrganisation extends OrganisationMain{
    private ShelterCellDetailsDirectory shelterCellDirectory;
    
    public ShelterOrganisation() {
        super(OrganisationMain.Type.Shelter.getValue());
    }

    public ShelterCellDetailsDirectory getShelterCellDirectory() {
        return shelterCellDirectory;
    }

    public void setShelterCellDirectory(ShelterCellDetailsDirectory shelterCellDirectory) {
        this.shelterCellDirectory = shelterCellDirectory;
    }
    
    @Override
    public ArrayList<AllRoles> getSupportedRole() {
        ArrayList<AllRoles> roles = new ArrayList<AllRoles>();
        roles.add(new ShelterEmpRole());
        return roles;
    }
}
