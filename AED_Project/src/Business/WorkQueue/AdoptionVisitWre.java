/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Adopt.AdoptRecord;
import Business.Adopt.AdopterDetail;
import Business.Animals.AnimalDetails;

/**
 *
 * @author krishna
 */
public class AdoptionVisitWre extends AllWorkRequest {
    
    private String result;
    private AdoptRecord adoptiondetails;

    public AdoptRecord getAdoptiondetails() 
    {
        return adoptiondetails;
    }

    public void setAdoptiondetails(AdoptRecord adoptiondetails) 
    {
        this.adoptiondetails = adoptiondetails;
    }

    public String getResult() 
    {
        return result;
    }

    public void setResult(String result) 
    {
        this.result = result;
    }
    
}
