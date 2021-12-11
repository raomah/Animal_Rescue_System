/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adopt;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AdoptionOfferedList {
   private ArrayList<AdoptionOffered> adoptionOfferingList;

    public AdoptionOfferedList() {
        adoptionOfferingList = new ArrayList<AdoptionOffered>();
    }

    public ArrayList<AdoptionOffered> getAdoptionOfferingList() {
        return adoptionOfferingList;
    }

    public void setAdoptionOfferingList(ArrayList<AdoptionOffered> adoptionOfferingList) {
        this.adoptionOfferingList = adoptionOfferingList;
    }
   
    public void addAdoptionOffering(AdoptionOffered ao) {
        adoptionOfferingList.add(ao);
    }
    
    public void removeAdoptionOffering(AdoptionOffered ao) {
        adoptionOfferingList.remove(ao);
    }
    
}
