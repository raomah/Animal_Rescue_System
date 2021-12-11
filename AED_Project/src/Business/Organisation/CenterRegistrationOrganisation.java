/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.RescueRecord.RescueRecordDetailsDirectory;
import Business.Role.ReceptionistRole;
import Business.Role.AllRoles;
import java.util.ArrayList;

/**
 *
 * @author raomah
 */
public class CenterRegistrationOrganisation extends OrganisationMain {
    private RescueRecordDetailsDirectory rescueRecordDirectory;
    
    public CenterRegistrationOrganisation() {
        super(OrganisationMain.Type.CenterRegistration.getValue());
        rescueRecordDirectory = new RescueRecordDetailsDirectory();
    }

    public RescueRecordDetailsDirectory getRescueRecordDirectory() {
        return rescueRecordDirectory;
    }

    public void setRescueRecordDirectory(RescueRecordDetailsDirectory rescueRecordDirectory) {
        this.rescueRecordDirectory = rescueRecordDirectory;
    }
    
    @Override
    public ArrayList<AllRoles> getSupportedRole() {
        ArrayList<AllRoles> roles = new ArrayList<AllRoles>();
        roles.add(new ReceptionistRole());
        return roles;
    }

}
