/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adopt;

import Business.Adopt.AdopterDetail;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AdopterDir {
    private ArrayList<AdopterDetail> adoptorList;

    public AdopterDir() {
        adoptorList = new ArrayList<AdopterDetail>(); 
    }
    
    public ArrayList<AdopterDetail> getAdoptorList() {
        return adoptorList;
    }

    public void setAdoptorList(ArrayList<AdopterDetail> adoptorList) {
        this.adoptorList = adoptorList;
    }
    
    public void addAdoptor(AdopterDetail a) {
        adoptorList.add(a);
    }
    
    public void removeAdoptor(AdopterDetail a) {
        adoptorList.remove(a);
    }
    
}
