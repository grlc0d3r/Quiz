/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsoftware.test.impl;

import com.jsoftware.test.impl.MultipleChoice;
import com.jsoftware.test.api.IQuestion;
import com.jsoftware.test.api.IQuestionFactory;
import java.util.Scanner;

/**
 *
 * @author Karyn
 */
public class QuestionFactory 
{
   IQuestion question;
   
   public QuestionFactory() {}
   
  @Override
   public IQuestion makeTrueFalse(String question, boolean answer) 
   {
       IQuestion tf = new TrueFalse();
       tf.getQuestion();
       return tf;
   }
   
   @Override
   public IQuestion makeMultipleChoice(String question, String[] choices, int answer){
       IQuestion mc = new MultipleChoice();
       mc.getQuestion();
       mc.getChoices()
       mc.getAnswer();
   }
   
    
}
