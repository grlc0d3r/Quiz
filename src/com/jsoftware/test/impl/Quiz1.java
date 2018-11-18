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
public class Quiz1 
{
    public static void main(String[] args) 
    {
         Scanner input = new Scanner(System.in);
         int selection;  
        // greet user
        System.out.println("Welcome to Test Taker!");
        //Scanner input = new Scanner(System.in);  
        //int selection;
        
       do 
        {
                System.out.println("What would you like to do today?");
                System.out.println("\t1) create a multiple choice question");
                System.out.println("\t2) create a true/false question");
                System.out.println("\t6) Exit program");
                System.out.println("Please enter your selection: ");
                // get user input from menu
                selection = input.nextInt();
                String clearSpace = input.nextLine();
                switch(selection) 
                {
                    case 1:
                        MultipleChoice mc = new MultipleChoice();
                        Question qMC = new Question();
                        qMC.getPrompt();
                        mc.getSize();
                        mc.getChoices();
                        mc.getIndex();
                        break;
                    case 2: 
                        // get prompt
                        // System.out.println("What is the prompt for your question?");
                        //String q2 = input.nextLine();
                        // get answer
                        //System.out.println("Is the answer \'true' or 'false'?");
                        //boolean a2 = input.nextBoolean();
                        TrueFalse tf = new TrueFalse();
                        Question qTF = new Question();
                        qTF.getPrompt();
                        tf.getAnswer();
                        break;
                    case 6:
                        System.out.println("Thank you for using Test Maker!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid selection. Please try again.");
                        break;
                } // end switch
            } // end do
            while (selection != 6); 
        }
}
