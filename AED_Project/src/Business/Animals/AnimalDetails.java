/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Animals;

import Business.Date.Date;
import Business.Treatment.TreatmentRecordDetailsDirectory;


/**
 *
 * @author user
 */
public abstract class AnimalDetails {
    private int animalid;
    private int animalage;
    private boolean isSterilize;
    private String animalcolor;
    private String animalgender;
    private AnimalType animaltype;
    private String animalstatus;
    private Date nextcheck;
    private TreatmentRecordDetailsDirectory treatmentDirectory;
    private AnimalStatusDetailsDirectory statusDirectory;
    
    private static int count;
    public static String READY_STATUS = "READY";
    public static String UNREADY_STATUS = "UNREADY";
    public static String ADOPTED_STATUS = "ADOPTED";

    public AnimalDetails() {
        count++;
        this.animalid = count;
        
        this.statusDirectory = new AnimalStatusDetailsDirectory();
        this.animalstatus = UNREADY_STATUS;
        this.nextcheck = new Date();
        this.treatmentDirectory = new TreatmentRecordDetailsDirectory();
        this.statusDirectory = new AnimalStatusDetailsDirectory();
    }

    public int getAnimalid() {
        return animalid;
    }

    public int getAnimalage() {
        return animalage;
    }

    public void setAnimalage(int animalage) {
        this.animalage = animalage;
    }

    public boolean isIsSterilize() {
        return isSterilize;
    }

    public void setIsSterilize(boolean isSterilize) {
        this.isSterilize = isSterilize;
    }

    public String getAnimalcolor() {
        return animalcolor;
    }

    public void setAnimalcolor(String animalcolor) {
        this.animalcolor = animalcolor;
    }

    public String getAnimalgender() {
        return animalgender;
    }

    public void setAnimalgender(String animalgender) {
        this.animalgender = animalgender;
    }

    public Date getNextcheck() {
        return nextcheck;
    }

    public void setNextcheck(Date d) {
        this.nextcheck = d;
    }

    public String getAnimalstatus() {
        return animalstatus;
    }

    public void setAnimalstatus(String animalstatus) {
        this.animalstatus = animalstatus;
    }

    public TreatmentRecordDetailsDirectory getTreatmentDirectory() {
        return treatmentDirectory;
    }

    public void setTreatmentDirectory(TreatmentRecordDetailsDirectory treatmentDirectory) {
        this.treatmentDirectory = treatmentDirectory;
    }

    public AnimalStatusDetailsDirectory getStatusDirectory() {
        return statusDirectory;
    }

    public void setStatusDirectory(AnimalStatusDetailsDirectory statusDirectory) {
        this.statusDirectory = statusDirectory;
    }

    public AnimalType getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(AnimalType animaltype) {
        this.animaltype = animaltype;
    }
    
    public enum AnimalType {
        Dog("Dog"),
        Cat("Cat"),
        Other("Other");
            
        private String value;

        private AnimalType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(animalid);
    }
    
}
