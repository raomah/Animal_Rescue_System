/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Animals;

/**
 *
 * @author Neha
 */
public class DogDetails extends AnimalDetails{
    private String dogbreed;
    private String dogcolor;
    private String dogpersonality;

    public String getDogbreed() {
        return dogbreed;
    }

    public void setDogbreed(String dogbreed) {
        this.dogbreed = dogbreed;
    }

    public String getAnimalcolor() {
        return dogcolor;
    }

    public void setAnimalcolor(String color) {
        this.dogcolor = color;
    }

    public String getDogpersonality() {
        return dogpersonality;
    }

    public void setDogpersonality(String dogpersonality) {
        this.dogpersonality = dogpersonality;
    }
    
}
