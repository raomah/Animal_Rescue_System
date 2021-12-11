/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adopt;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AdoptionHistoryDirectory {
    private ArrayList<AdoptHistory> historyList;

    public AdoptionHistoryDirectory() {
        historyList = new ArrayList<AdoptHistory>();
    }

    public ArrayList<AdoptHistory> getHistoryList() {
        return historyList;
    }

    public void setHistoryList(ArrayList<AdoptHistory> historyList) {
        this.historyList = historyList;
    }
    
    public void addAdoptionHistory(AdoptHistory ah) {
        historyList.add(ah);
    }
    
    public void removeAdoptionHisstory(AdoptHistory ah) {
        historyList.remove(ah);
    }
    
}
