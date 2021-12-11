/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Adopt.AdopterDetail;
import Business.Animals.AnimalDetails;

/**
 *
 * @author user
 */
public class ReturnVisitWre extends AllWorkRequest {
    private AdopterDetail adoptorname;
    private AnimalDetails animal;
    private String result;

    public AdopterDetail getAdoptorname() {
        return adoptorname;
    }

    public void setAdoptorname(AdopterDetail adoptorname) {
        this.adoptorname = adoptorname;
    }

    public AnimalDetails getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalDetails animal) {
        this.animal = animal;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
