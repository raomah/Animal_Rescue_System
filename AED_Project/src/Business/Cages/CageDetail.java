/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Cages;

import Business.Animals.AnimalDetails;
import Business.ShelterCell.ShelterCellDetails;

/**
 *
 * @author user
 */
public class CageDetail {
    private int cellno;
    private String cagelocation;
    private String cagestatus;
    private AnimalDetails animal;
    public static String OCCUPIED_STATUS = "OCCUPIED";
    public static String AVAIL_STATUS = "AVAIL";
    private static int count = 0;
    
    public CageDetail() {
        count++;
        cellno = count;
        cagestatus = AVAIL_STATUS;
    }

    public int getCellno() {
        return cellno;
    }

    public String getCagelocation() {
        return cagelocation;
    }

    public void setCagelocation(String cagelocation) {
        this.cagelocation = cagelocation;
    }

    public String getCagestatus() {
        return cagestatus;
    }

    public void setCagestatus(String cagestatus) {
        this.cagestatus = cagestatus;
    }

    public AnimalDetails getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalDetails animal) {
        this.animal = animal;
    }
    
    @Override
    public String toString() {
        return String.valueOf(cellno);
    }

}
