/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RescueRecord;

import Business.Animals.AnimalDetails;
import Business.Date.Date;
import Business.Employees.EmployeeDetails;
import Business.Place.PlaceDetails;

/**
 *
 * @author user
 */
public class RescueRecordDetails {
    private Date date;
    private AnimalDetails rescuedanimal;
    private PlaceDetails rescueroom;
    private EmployeeDetails rescuername;
    private String foundlocation;
    private boolean health;

    public RescueRecordDetails() {
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AnimalDetails getRescuedanimal() {
        return rescuedanimal;
    }

    public void setRescuedanimal(AnimalDetails rescuedanimal) {
        this.rescuedanimal = rescuedanimal;
    }

    public PlaceDetails getRescueroom() {
        return rescueroom;
    }

    public void setRescueroom(PlaceDetails rescueroom) {
        this.rescueroom = rescueroom;
    }

    public EmployeeDetails getRescuername() {
        return rescuername;
    }

    public void setRescuername(EmployeeDetails rescuername) {
        this.rescuername = rescuername;
    }

    public String getFoundlocation() {
        return foundlocation;
    }

    public void setFoundlocation(String foundlocation) {
        this.foundlocation = foundlocation;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }
           
    @Override
    public String toString() {
        return date.toString();
    }
}
