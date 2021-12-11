/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ShelterCell;

import Business.Animals.AnimalDetails;

/**
 *
 * @author krishna
 */
public class ShelterCellDetails {
    private int cellno;
    private String shelterstatus;
    private String shelterlocation;
    private AnimalDetails animal;
    
    public static String OCCUPIED_STATUS = "OCCUPIED";
    public static String AVAIL_STATUS = "AVAIL";
    private static int count = 0;
    
    public ShelterCellDetails() {
        count++;
        cellno = count;
        shelterstatus = AVAIL_STATUS;
    }

    public int getCellno() {
        return cellno;
    }

    public String getShelterlocation() {
        return shelterlocation;
    }

    public void setShelterlocation(String shelterlocation) {
        this.shelterlocation = shelterlocation;
    }

    public String getShelterstatus() {
        return shelterstatus;
    }

    public void setShelterstatus(String shelterstatus) {
        this.shelterstatus = shelterstatus;
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
