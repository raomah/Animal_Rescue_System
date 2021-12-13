/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Cages;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CageDetailsDirectory {
    private ArrayList<CageDetail> cageCellList;

    public CageDetailsDirectory() {
        cageCellList = new ArrayList<CageDetail>(); 
    }

    public ArrayList<CageDetail> getCageCellList() {
        return cageCellList;
    }

    public void setCageCellList(ArrayList<CageDetail> cageCellList) {
        this.cageCellList = cageCellList;
    }
    
    public void addCageShell(CageDetail sc) {
        cageCellList.add(sc);
    }
    
    public void removeCageCell(CageDetail sc) {
        cageCellList.remove(sc);
    }
    
}
