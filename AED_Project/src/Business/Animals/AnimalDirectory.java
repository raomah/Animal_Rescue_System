/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Animals;

import java.util.ArrayList;

/**
 *
 * @author Neha
 */
public class AnimalDirectory {
    private ArrayList<AnimalDetails> animalList;

    public AnimalDirectory() {
        animalList = new ArrayList<AnimalDetails>(); 
    }

    public ArrayList<AnimalDetails> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<AnimalDetails> animalList) {
        this.animalList = animalList;
    }
    
    public void addAnimal(AnimalDetails a){
        animalList.add(a);
    }
    
    public void removeAnimal(AnimalDetails a) {
        animalList.remove(a);
    }
    
}
