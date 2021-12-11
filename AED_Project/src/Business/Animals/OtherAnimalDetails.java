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
public class OtherAnimalDetails extends AnimalDetails{
    private String animaltype;
    private String animalbreed;
    private String animalcolor;
    private String animalpersonality;

    public String getOtherAnimalType() {
        return animaltype;
    }

    public void setOtherAnimalType(String type) {
        this.animaltype = type;
    }

    public String getAnimalbreed() {
        return animalbreed;
    }

    public void setAnimalbreed(String animalbreed) {
        this.animalbreed = animalbreed;
    }

    public String getAnimalcolor() {
        return animalcolor;
    }

    public void setAnimalcolor(String color) {
        this.animalcolor = color;
    }

    public String getAnimalpersonality() {
        return animalpersonality;
    }

    public void setAnimalpersonality(String animalpersonality) {
        this.animalpersonality = animalpersonality;
    }
}
