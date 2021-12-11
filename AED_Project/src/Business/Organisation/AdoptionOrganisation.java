/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Adopt.AdoptionOfferedList;
import Business.Adopt.AdoptionRecordDirectory;
import Business.Adopt.AdopterDir;
import Business.Role.AdoptionManagerRole;
import Business.Role.AllRoles;
import Business.WorkQueue.AllWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AdoptionOrganisation extends OrganisationMain{
    private AdoptionRecordDirectory adoptionRecordDirectory;
    private AdopterDir adopterDirectory;
    private AdoptionOfferedList adoptionlist;
    
    public AdoptionOrganisation() {
        super(OrganisationMain.Type.Adoption.getValue());
        adoptionRecordDirectory = new AdoptionRecordDirectory();
        adopterDirectory = new AdopterDir();
        adoptionlist = new AdoptionOfferedList();
    }

    public AdoptionRecordDirectory getAdoptionRecordDirectory() {
        return adoptionRecordDirectory;
    }

    public void setAdoptionRecordDirectory(AdoptionRecordDirectory adoptionRecordDirectory) {
        this.adoptionRecordDirectory = adoptionRecordDirectory;
    }

    public AdopterDir getAdopterDirectory() {
        return adopterDirectory;
    }

    public void setAdopterDirectory(AdopterDir adopterDirectory) {
        this.adopterDirectory = adopterDirectory;
    }

    public AdoptionOfferedList getAdoptionlist() {
        return adoptionlist;
    }

    public void setAdoptionlist(AdoptionOfferedList adoptionlist) {
        this.adoptionlist = adoptionlist;
    }
    
    @Override
    public ArrayList<AllRoles> getSupportedRole() {
        ArrayList<AllRoles> roles = new ArrayList<AllRoles>();
        roles.add(new AdoptionManagerRole());
        return roles;
    }
 
}
