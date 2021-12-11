/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Deliver;

/**
 *
 * @author user
 */
public class VehicleDetails {
    private int vehicleno;
    private int vehiclecapacity;
    private static int count = 0;

    public VehicleDetails() {
        count++;
        vehicleno = count;
    }

    public int getVehicleno() {
        return vehicleno;
    }

    public int getVehiclecapacity() {
        return vehiclecapacity;
    }

    public void setVehiclecapacity(int vehiclecapacity) {
        this.vehiclecapacity = vehiclecapacity;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        VehicleDetails.count = count;
    }
   
}
