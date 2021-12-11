/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.DeliveryPersonRole;
import Business.Role.AllRoles;
import Business.Deliver.VehicleDirectoryDetails;
import Business.WorkQueue.AllWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class DeliveryOrganisation extends OrganisationMain{
    private VehicleDirectoryDetails vehicleDirectory;
    
    public DeliveryOrganisation() {
        super(OrganisationMain.Type.Delivery.getValue());
    }

    public VehicleDirectoryDetails getVehicleDirectory() {
        return vehicleDirectory;
    }

    public void setVehicleDirectory(VehicleDirectoryDetails vehicleDirectory) {
        this.vehicleDirectory = vehicleDirectory;
    }
    
    @Override
    public ArrayList<AllRoles> getSupportedRole() {
        ArrayList<AllRoles> roles = new ArrayList<AllRoles>();
        roles.add(new DeliveryPersonRole());
        return roles;
    }

}
