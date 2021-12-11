/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Deliver;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class DeliveryHistoryDetailsDir {
    private ArrayList<DeliveryHistoryDetails> deliveryHistoryList;

    public DeliveryHistoryDetailsDir() {
        deliveryHistoryList = new ArrayList<DeliveryHistoryDetails>();
    }

    public ArrayList<DeliveryHistoryDetails> getDeliveryHistoryList() {
        return deliveryHistoryList;
    }

    public void setDeliveryHistoryList(ArrayList<DeliveryHistoryDetails> deliveryHistoryList) {
        this.deliveryHistoryList = deliveryHistoryList;
    }
    
    public void addDeliveryHistory(DeliveryHistoryDetails dh) {
        deliveryHistoryList.add(dh);
    }
    
    public void removeDeliveryHistory(DeliveryHistoryDetails dh) {
        deliveryHistoryList.remove(dh);
    }
    
}
