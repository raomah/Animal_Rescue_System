/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Medicines.MedicineDetails;

/**
 *
 * @author user
 */
public class PharmacyUnitWre {
    private int quantity;
    private MedicineDetails medicine;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public MedicineDetails getMedicine() {
        return medicine;
    }

    public void setMedicine(MedicineDetails medicine) {
        this.medicine = medicine;
    }
    
}
