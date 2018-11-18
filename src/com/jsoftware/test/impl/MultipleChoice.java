/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsoftware.test.impl;

import com.jsoftware.test.api.IMultipleChoiceQuestion;
import java.util.Scanner;


/**
 *
 * @author Karyn
 */
public class MultipleChoice  extends Question
{
    String prompt;
    int size;
    String[] choices;
    int index;    
    Scanner input = new Scanner(System.in);
    String clearSpace;
    
    public MultipleChoice() {}
    public MultipleChoice(String prompt, int size, String[] choices, int index) {
        super(prompt);
        this.size = size;
        this.choices = choices; 
        this.index = index;
    }

    public int getSize() { 
        System.out.println("How many choices are there for this question? ");
        size = input.nextInt();     
        clearSpace = input.nextLine();
        return size; 
    }
    public String[] getChoices() { 
        choices = new String[size];
        System.out.println("Enter the first choice for your question: ");
        choices[0] = input.nextLine();
        System.out.println("Enter the second choice for your question: ");
        choices[1] = input.nextLine();
        System.out.println("Enter the third choice for your question: ");
        choices[2] = input.nextLine();
        System.out.println("Enter the fourth choice for your question: ");
        choices[3] = input.nextLine();
        return choices; 
    }    
    public int getIndex() {
        // this is the answer which is stored at index choice[i]
        System.out.println("The correct answer is at index: ");
        index = input.nextInt();
        clearSpace = input.nextLine();
        return index;
    }
    /* public void setQuestion(String question) { this.question = question; }*/
    public void setSize(int size) { this.size = size; }
    public void setChoices(String[] choices) { this.choices = choices; }
    public void setIndex(int index) { this.index = index; }
    
 /*   public boolean checkAnswer(int index) { return index; } */
}
