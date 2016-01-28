/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelLayer;

import java.io.Serializable;

/**
 *
 * @author Joel
 */
public class FinalBossModel implements Serializable {
    
    public String description;
    public String mathQuestion;
    
    //constructor functions

    public FinalBossModel(String description, String mathQuestion) {
        this.description = description;
        this.mathQuestion = mathQuestion;
    }
    
    // getter and setter functions

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMathQuestion() {
        return mathQuestion;
    }

    public void setMathQuestion(String mathQuestion) {
        this.mathQuestion = mathQuestion;
    }
    
    
    
}
