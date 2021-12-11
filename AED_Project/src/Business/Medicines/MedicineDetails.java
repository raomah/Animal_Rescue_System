/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicines;

/**
 *
 * @author user
 */
public abstract class MedicineDetails {
    private String medname;
    private int medID;
    private String medvendor;
    private MedicineType medtype;

    private static int count;
    
    public MedicineDetails() {
        this.medID = count;
        count++;
    }

    public String getMedname() {
        return medname;
    }

    public void setMedname(String medname) {
        this.medname = medname;
    }

    public int getMedID() {
        return medID;
    }

    public String getMedvendor() {
        return medvendor;
    }

    public void setMedvendor(String medvendor) {
        this.medvendor = medvendor;
    }

    public MedicineType getMedtype() {
        return medtype;
    }

    public void setMedtype(MedicineType medtype) {
        this.medtype = medtype;
    }
    
    public enum MedicineType {
        Anesthetics("Anesthetics"),
        Antibiotics("Antibiotics"),
        Vaccination("Vaccination"),
        Other("Other");
            
        private String value;

        private MedicineType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    @Override
    public String toString() {
        return medtype.getValue() + " " + String.valueOf(count) + ": " + medname;
    }
    
}
