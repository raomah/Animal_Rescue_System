/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Deliver;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class VehicleDirectoryDetails {
    private ArrayList<VehicleDetails> vehicleList;

    public VehicleDirectoryDetails() {
        vehicleList = new ArrayList<VehicleDetails>();
    }

    public ArrayList<VehicleDetails> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<VehicleDetails> vehicleList) {
        this.vehicleList = vehicleList;
    }
    
    public void addVehicle(VehicleDetails v) {
        vehicleList.add(v);
    }
    
    public void removeVehicle(VehicleDetails v) {
        vehicleList.remove(v);
    }
}
