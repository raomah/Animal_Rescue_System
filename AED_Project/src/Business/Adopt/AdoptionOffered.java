/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adopt;

import Business.Animals.AnimalDetails;
import Business.Date.Date;

/**
 *
 * @author Neha
 */
public class AdoptionOffered {
    private AnimalDetails animal;
    private Date publishDate;
    private String status;
    
    public static String OPEN_STATUS = "Open";
    public static String CLOSE_STATUS = "Close";

    public AdoptionOffered() {
        this.status = OPEN_STATUS;
    }

    public AnimalDetails getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalDetails animal) {
        this.animal = animal;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return animal.getAnimaltype().getValue();
    }
    
}
