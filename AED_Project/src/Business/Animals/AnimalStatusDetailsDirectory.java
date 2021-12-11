/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Animals;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AnimalStatusDetailsDirectory {
    private ArrayList<AnimalStatusDetails> statusList;

    public AnimalStatusDetailsDirectory() {
        statusList = new ArrayList<AnimalStatusDetails>();
    }

    public ArrayList<AnimalStatusDetails> getStatusDir() {
        return statusList;
    }

    public void setStatusDir(ArrayList<AnimalStatusDetails> statusDir) {
        this.statusList = statusDir;
    }
    
    public void addAnimalStatus(AnimalStatusDetails r) {
        statusList.add(r);
    }
    
    public void removeAnimalStatus(AnimalStatusDetails r) {
        statusList.remove(r);
    }
}
