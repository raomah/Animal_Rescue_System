/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Adopt.AdoptionOfferedList;
import Business.Animals.AnimalDirectory;
import Business.Cages.CageDetailsDirectory;
import Business.Medicines.MedicineDetailsDirectory;
import Business.RescueRecord.RescueRecordDetailsDirectory;
import Business.Role.AllRoles;
import Business.Place.PlaceDetailsDirectory;
import Business.ShelterCell.ShelterCellDetailsDirectory;
import Business.Deliver.DeliveryHistoryDetailsDir;
import java.util.ArrayList;

/**
 *
 * @author raomah
 */
public class RescueCenterEntDetails extends EnterpriseDetails{
    private PlaceDetailsDirectory roomDirectory;
    private RescueRecordDetailsDirectory recordDirectory;
    private AnimalDirectory animalDirectory;
    private MedicineDetailsDirectory medicineDirectory;
    private CageDetailsDirectory cageCellDirectory;
    private ShelterCellDetailsDirectory shelterCellDirectory;
    private AdoptionOfferedList adoptionList;
    private DeliveryHistoryDetailsDir deliveryHistoryDirectory;
    
    public RescueCenterEntDetails(String name) {
        super(name, EnterpriseDetails.EnterpriseType.RescueCenter);
        roomDirectory = new PlaceDetailsDirectory();
        recordDirectory = new RescueRecordDetailsDirectory();
        animalDirectory = new AnimalDirectory();
        medicineDirectory = new MedicineDetailsDirectory();
        cageCellDirectory = new CageDetailsDirectory();
        shelterCellDirectory = new ShelterCellDetailsDirectory();
        adoptionList = new AdoptionOfferedList();
        deliveryHistoryDirectory = new DeliveryHistoryDetailsDir();
    }

    public PlaceDetailsDirectory getRoomDirectory() {
        return roomDirectory;
    }

    public void setRoomDirectory(PlaceDetailsDirectory roomDirectory) {
        this.roomDirectory = roomDirectory;
    }

    public RescueRecordDetailsDirectory getRecordDirectory() {
        return recordDirectory;
    }

    public void setRecordDirectory(RescueRecordDetailsDirectory recordDirectory) {
        this.recordDirectory = recordDirectory;
    }

    public AnimalDirectory getAnimalDirectory() {
        return animalDirectory;
    }

    public void setAnimalDirectory(AnimalDirectory animalDirectory) {
        this.animalDirectory = animalDirectory;
    }

    public MedicineDetailsDirectory getMedicineDirectory() {
        return medicineDirectory;
    }

    public void setMedicineDirectory(MedicineDetailsDirectory medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }

    public CageDetailsDirectory getCageCellDirectory() {
        return cageCellDirectory;
    }

    public void setCageCellDirectory(CageDetailsDirectory cageCellDirectory) {
        this.cageCellDirectory = cageCellDirectory;
    }

    public ShelterCellDetailsDirectory getShelterCellDirectory() {
        return shelterCellDirectory;
    }

    public void setShelterCellDirectory(ShelterCellDetailsDirectory shelterCellDirectory) {
        this.shelterCellDirectory = shelterCellDirectory;
    }

    public AdoptionOfferedList getAdoptionList() {
        return adoptionList;
    }

    public void setAdoptionList(AdoptionOfferedList adoptionList) {
        this.adoptionList = adoptionList;
    }

    public DeliveryHistoryDetailsDir getDeliveryHistoryDirectory() {
        return deliveryHistoryDirectory;
    }

    public void setDeliveryHistoryDirectory(DeliveryHistoryDetailsDir deliveryHistoryDirectory) {
        this.deliveryHistoryDirectory = deliveryHistoryDirectory;
    }
    
    @Override
    public ArrayList<AllRoles> getSupportedRole() {
        return null;
    }
}
