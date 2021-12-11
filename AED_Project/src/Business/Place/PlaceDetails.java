/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Place;

import Business.Employees.EmployeeDetails;

/**
 *
 * @author user
 */
public class PlaceDetails {
    private String roomno;
    private EmployeeDetails vet;
    private String status;
    public static String AVAIL_STATUS = "AVAIL";
    public static String OCCUPIED_STATUS = "OCCUPIED";
    private static int count;

    public PlaceDetails() {
        this.status = AVAIL_STATUS;
        this.roomno = "Room" + String.valueOf(count+1);
        count++;
    }


    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public EmployeeDetails getVet() {
        return vet;
    }

    public void setVet(EmployeeDetails vet) {
        this.vet = vet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
