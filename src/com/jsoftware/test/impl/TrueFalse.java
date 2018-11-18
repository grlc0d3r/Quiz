/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsoftware.test.impl;

import com.jsoftware.test.impl.Question;
import com.jsoftware.test.api.ITrueFalseQuestion;
import java.util.Scanner;

/**
 *
 * @author Karyn
 */
public class TrueFalse  extends Question {
    String prompt;
    boolean answer;
    Scanner input = new Scanner(System.in);    
    
    public TrueFalse() {}
    public TrueFalse(String prompt, boolean answer) {
        super(prompt);
        this.answer = answer;
    }
    
    public boolean getAnswer() { 
        System.out.println("Is the answer \'true\' or \'false\'? Please enter the entire word.");
        answer = input.nextBoolean();
        return answer;     
    }
    /*public void setQuestion(String question) {         
            this.question = question;
    }*/
    public void setAnswer(boolean answer) { 
        this.answer = answer; 
    }
    
    public boolean checkAnswer(boolean answer) { 
        // get student input
        
        // compareTo test input
        return answer;
    
    }
    
    // take answer from above = true/false = and update total right count
}
