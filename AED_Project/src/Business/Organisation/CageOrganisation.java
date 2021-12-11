/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Cages.CageDetailsDirectory;
import Business.Role.AllRoles;
import Business.Role.VetAssistantRole;
import Business.WorkQueue.AllWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CageOrganisation extends OrganisationMain{
    private CageDetailsDirectory cageCellDirectory;
    
    public CageOrganisation() {
        super(OrganisationMain.Type.Cage.getValue());
    }

    public CageDetailsDirectory getCageCellDirectory() {
        return cageCellDirectory;
    }

    public void setCageCellDirectory(CageDetailsDirectory cageCellDirectory) {
        this.cageCellDirectory = cageCellDirectory;
    }
    
    @Override
    public ArrayList<AllRoles> getSupportedRole() {
        ArrayList<AllRoles> roles = new ArrayList<AllRoles>();
        roles.add(new VetAssistantRole());
        return roles;
    }

}
