/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ShelterCell;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ShelterCellDetailsDirectory {
    private ArrayList<ShelterCellDetails> shelterCellList;

    public ShelterCellDetailsDirectory() {
        shelterCellList = new ArrayList<ShelterCellDetails>(); 
    }

    public ArrayList<ShelterCellDetails> getShelterCellList() {
        return shelterCellList;
    }

    public void setShelterCellList(ArrayList<ShelterCellDetails> shelterCellList) {
        this.shelterCellList = shelterCellList;
    }
    
    public void addShelterShell(ShelterCellDetails sc) {
        shelterCellList.add(sc);
    }
    
    public void removeShelterCell(ShelterCellDetails sc) {
        shelterCellList.remove(sc);
    }
    
}
