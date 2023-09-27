/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class QuizUI {
    private int count; 
    private Quiz quizz[];
    
    public QuizUI(){
        quizz = new Quiz[5];
        count = 0;
    }
    
    //menu 
    public void menu(){
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Add \n 2. Dialpay \n 3. Search \n 4. Delete"));
        
        switch (ans){
            case 1:
                add();
                break;
            case 2: 
                print();
                break;
            case 3:
                search();
                break;
            case 4: 
                delete();
                break;
            default:
                break;
        }
    }
        public void add(){
            int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to enter a 1. Basic or 2.Multiple choice or 3. Essay question"));
            if(type ==1){
                Basic b1 = new Basic();
                b1.setQuestionText(JOptionPane.showInputDialog(null, "Enter question text "));
                b1.setCorrectAnswer(JOptionPane.showInputDialog(null, "Enter the correct answer "));
                b1.setMark(JOptionPane.showInputDialog(null, "Enter the marks going for this question "));
                
                quizz[count]=b1;
                count++;
            }else if(type ==2){
                MultipleChoice m1 = new MultipleChoice();
                m1.setQuestionText(JOptionPane.showInputDialog(null, "Enter question text "));
                m1.setCorrectAnswer(JOptionPane.showInputDialog(null, "Enter the correct answer "));
                m1.setMark(JOptionPane.showInputDialog(null, "Enter the marks going for this question "));
                m1.setOptionA(JOptionPane.showInputDialog(null, "Enter what option A will be "));
                m1.setOptionB(JOptionPane.showInputDialog(null, "Enter what option B will be "));
                m1.setOptionC(JOptionPane.showInputDialog(null, "Enter what option C will be "));
                
                quizz[count]=m1;
                count++;
            }else if(type == 3){
                Essay e1 = new Essay();
                e1.setQuestionText(JOptionPane.showInputDialog(null, "Enter question text "));
                e1.setCorrectAnswer(JOptionPane.showInputDialog(null, "Enter the correct answer "));
                e1.setMark(JOptionPane.showInputDialog(null, "Enter the marks going for this question"));
                e1.setMaxWordCount(Integer.parseInt(JOptionPane.showInputDialog(null, "Plase enter the max word count ")));
            }else{
                JOptionPane.showMessageDialog(null, "Invalid entry please try again");
            }
        }
        
        public void print(){
            /*
            the sort way 
            for(int i = 0; i < count ; i++){
                Employee e = employees[i];
                JOptionPane.showMessageDialog(null, e.getDetails());
            }*/
            for(int i = 0; i < count; i++){
                Quiz e = quizz[i];
                if(e instanceof Basic){
                    JOptionPane.showMessageDialog(null, "Question Text: " +e.getQuestionText()+ "Correct answer: " + e.getCorrectAnswer()+"Mark: " + e.getMark());
                }
                else if(e instanceof MultipleChoice){
                    JOptionPane.showMessageDialog(null, "Question Text: " +e.getQuestionText()+ "Correct answer: " + e.getCorrectAnswer()+"Mark: " + e.getMark()+ "Option A:  " + ((MultipleChoice) e).getOptionA() + "Option B: " + ((MultipleChoice) e).getOptionB() + "Option C:" + ((MultipleChoice) e).getOptionC());
                }
                else if(e instanceof Essay){
                    JOptionPane.showMessageDialog(null, "Question Text: " +e.getQuestionText()+ "Correct answer: " + e.getCorrectAnswer()+"Mark: " + e.getMark()+ "Max Word Count: " + ((Essay) e).getMaxWordCount());
                }
                else{
                    JOptionPane.showMessageDialog(null, "No questions to display");
                }
            }
        }
        
        public void search(){
            
            
            if(count == 0){
                JOptionPane.showMessageDialog(null, "Sorry, there are no questions to search");
            }else{
                String searchterm = JOptionPane.showInputDialog(null, "Please enter a questions text to search, be specific");
                for(int i = 0; i < count;i++){
                    if(quizz[i].getQuestionText().equals(searchterm)){
                        JOptionPane.showMessageDialog(null, quizz[i].getDetails());
                    }else{
                        JOptionPane.showMessageDialog(null, "Sorry, not a valid entry");
                    }
                }
            }
        }
        
        public void delete(){
            if(count == 0){
                JOptionPane.showMessageDialog(null, "There are no employees to delete ");
            }else{
                String searchterm = JOptionPane.showInputDialog(null, "Please enter a questions text to delete");
                for(int i = 0; i < count; i++){
                    if(quizz[i].getQuestionText().equals(searchterm)){
                        quizz[i] = quizz[count - 1];
                        count--;
                        JOptionPane.showMessageDialog(null, "Your question has been deleted");
                    }else{
                        JOptionPane.showMessageDialog(null, "Invalid Entry");
                    }
                }
            }
        }
}
