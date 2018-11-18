/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsoftware.test.impl;

import java.util.Scanner;


/**
 *
 * @author Karyn
 */
public class Question 
{
    String prompt;
    Scanner input = new Scanner(System.in);
    
    public Question() {}
    public Question(String prompt) {
        this.prompt = prompt;
    }
    
    public String getPrompt() {
        System.out.println("What is the prompt for this question? ");
        prompt = input.nextLine();
        return prompt;
    }
    
}
