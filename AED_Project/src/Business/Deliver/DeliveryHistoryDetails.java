/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Deliver;

import Business.Adopt.AdopterDetail;
import Business.Animals.AnimalDetails;
import Business.Date.Date;
import Business.Employees.EmployeeDetails;

/**
 *
 * @author user
 */
public class DeliveryHistoryDetails {
    private Date date;
    private EmployeeDetails courierdetail;
    private AnimalDetails animal;
    private AdopterDetail adoptername;
    private String status;
    
    public static String WAITING_STATUS = "WAITING";
    public static String ASSIGNED_STATUS = "ASSIGNED";
    public static String RECEIVED_STATUS = "RECEIVED";

    public DeliveryHistoryDetails() {
        status = WAITING_STATUS;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date d) {
        this.date = d;
    }

    public EmployeeDetails getCourierdetail() {
        return courierdetail;
    }

    public void setCourierdetail(EmployeeDetails courierdetail) {
        this.courierdetail = courierdetail;
    }

    public AnimalDetails getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalDetails animal) {
        this.animal = animal;
    }

    public AdopterDetail getAdoptername() {
        return adoptername;
    }

    public void setAdoptername(AdopterDetail adoptername) {
        this.adoptername = adoptername;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return date.getYear() + "/" + date.getDate() + "/" + date.getYear();
    }
    
}
