/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Animals;

import Business.Date.Date;


/**
 *
 * @author user
 */
public class AnimalStatusDetails {
    private Date date;
    private double animalweight;
    private String animalstatus;
    public static String GOOD_STATUS = "GOOD";
    public static String RESERVED_STATUS = "RESERVED";
    public static String BAD_STATUS = "BAD";

    public AnimalStatusDetails() {
        date = new Date();
    }
    
    public double getAnimalweight() {
        return animalweight;
    }

    public void setAnimalweight(double animalweight) {
        this.animalweight = animalweight;
    }

    public String getAnimalstatus() {
        return animalstatus;
    }

    public void setAnimalstatus(String animalstatus) {
        this.animalstatus = animalstatus;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date d) {
        this.date = d;
    }
}
