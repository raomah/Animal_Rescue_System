/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Animals.AnimalDetails;

/**
 *
 * @author krishna
 */
public class DailyExaminationWre extends AllWorkRequest {
    
    private String result;
    private AnimalDetails animal;

    public AnimalDetails getAnimal() 
    {
        return animal;
    }

    public void setAnimal(AnimalDetails animal) 
    {
        this.animal = animal;
    }

    public String getResult() 
    {
        return result;
    }

    public void setResult(String result) 
    {
        this.result = result;
    }
}
