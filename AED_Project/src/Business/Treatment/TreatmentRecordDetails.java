/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Treatment;

import Business.Animals.AnimalDetails;
import Business.Date.Date;
import Business.Medicines.MedicineDetails;
import Business.Place.PlaceDetails;
import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class TreatmentRecordDetails {
    private Date date;
    private AnimalDetails animal;
    private PlaceDetails room;
    private ArrayList<MedicineDetails> medicineList;
    private boolean reviewed;

    public TreatmentRecordDetails() 
    {
        reviewed = false;
        date = new Date();
        medicineList = new ArrayList<MedicineDetails>();
    }

    public Date getDate() 
    {
        return date;
    }

    public void setDate(Date date) 
    {
        this.date = date;
    }

    public AnimalDetails getAnimal() 
    {
        return animal;
    }

    public void setAnimal(AnimalDetails animal) 
    {
        this.animal = animal;
    }

    public PlaceDetails getRoom() 
    {
        return room;
    }

    public void setRoom(PlaceDetails room) 
    {
        this.room = room;
    }

    public boolean isReviewed() 
    {
        return reviewed;
    }

    public void setReviewed(boolean reviewed) 
    {
        this.reviewed = reviewed;
    }

    public ArrayList<MedicineDetails> getMedicineList() 
    {
        return medicineList;
    }

    public void setMedicineList(ArrayList<MedicineDetails> medicineList) 
    {
        this.medicineList = medicineList;
    }
    
}
