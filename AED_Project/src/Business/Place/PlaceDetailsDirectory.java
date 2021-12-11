/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Place;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PlaceDetailsDirectory {
    private ArrayList<PlaceDetails> roomList;

    public PlaceDetailsDirectory() {
        roomList = new ArrayList<PlaceDetails>(); 
    }

    public ArrayList<PlaceDetails> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<PlaceDetails> roomList) {
        this.roomList = roomList;
    }
    
    public void addRoom(PlaceDetails r) {
        roomList.add(r);
    }
    
    public void removeRoom(PlaceDetails r) {
        roomList.remove(r);
    }
    
}
