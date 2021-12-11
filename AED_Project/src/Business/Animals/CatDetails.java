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
public class CatDetails extends AnimalDetails{
    private String catbreed;
    private String catcolor;
    private String catpersonality;

    public String getCatbreed() {
        return catbreed;
    }

    public void setCatbreed(String catbreed) {
        this.catbreed = catbreed;
    }

    public String getAnimalcolor() {
        return catcolor;
    }

    public void setAnimalcolor(String color) {
        this.catcolor = color;
    }

    public String getCatpersonality() {
        return catpersonality;
    }

    public void setCatpersonality(String catpersonality) {
        this.catpersonality = catpersonality;
    }
    
}
