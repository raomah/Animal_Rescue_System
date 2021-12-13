/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adopt;

import Business.Animals.AnimalDetails;
import Business.Date.Date;
import Business.Employees.EmployeeDetails;


/**
 *
 * @author Neha
 */
public class AdoptRecord {
    private AdopterDetail adoptorName;
    
    private EmployeeDetails inspectorName;
    
    private AnimalDetails animal;
    
    private Date date;
    
    private String status;
    
    public static String SUBMITTED_STATUS = "Submitted";
    
    public static String PROCESSING_STATUS = "Processing";
    
    public static String APPROVED_STATUS = "Approved";
    
    public static String REJECTED_STATUS = "Rejected";
    
    public static String INPROGRESS_STATUS = "In Progress";

    public AdopterDetail getAdoptorName() {
        return adoptorName;
    }

    public void setAdoptorName(AdopterDetail adoptorName) {
        this.adoptorName = adoptorName;
    }

    public AnimalDetails getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalDetails animal) {
        this.animal = animal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date d) {
        this.date = d;
    }

    public EmployeeDetails getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(EmployeeDetails inspectorName) {
        this.inspectorName = inspectorName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        
        return date.getMonth()
               + "/" + date.getDate()
              + "/" + date.getYear();
    }
    
}
