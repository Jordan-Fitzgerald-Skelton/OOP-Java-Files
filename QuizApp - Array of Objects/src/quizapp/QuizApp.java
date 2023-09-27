/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class QuizApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ans;
        QuizUI myUI = new QuizUI();
        do{
        myUI.menu();
        ans = JOptionPane.showInputDialog(null, "Would you like to go back to the menu");
        }while(ans.equalsIgnoreCase("yes"));
        
    }
}
/*
do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter 1 to enter a basic question 2 to enter a multiple choice question or 3 to enter a essay question"));
            if (num == 1) {
                JOptionPane.showMessageDialog(null, "You have chosen to add a basic question ");
                JOptionPane.showMessageDialog(null, "Previous question ");
                Basic b1 = new Basic("what colour is the sky", "Blue", "2");
                JOptionPane.showMessageDialog(null, "Question:" + b1.getQuestionText() + ", Correct Answer:" + b1.getCorrectAnswer() + ", Mark:" + b1.getMark());

                questionText = JOptionPane.showInputDialog(null, "Please enter the question text");
                b1.setQuestionText(questionText);
                correctAnswer = JOptionPane.showInputDialog(null, "Please enter the correct answer");
                b1.setCorrectAnswer(correctAnswer);
                mark = JOptionPane.showInputDialog(null, "Please enter the total marks for this question");
                b1.setMark(mark);
                JOptionPane.showMessageDialog(null, "You have entered");
                JOptionPane.showMessageDialog(null, "Question:" + b1.getQuestionText() + ", Correct Answer:" + b1.getCorrectAnswer() + ", Mark:" + b1.getMark());

            } else if (num == 2) {
                JOptionPane.showMessageDialog(null, "You have chosen to add a multiple choice question ");
                //mutilpe choice question 
                JOptionPane.showMessageDialog(null, "Previous question ");
                MultipleChoice m1 = new MultipleChoice("What year is it", "2022", "5", "2021", "2022", "2023");
                JOptionPane.showMessageDialog(null, "You have entered");
                JOptionPane.showMessageDialog(null, "Question:" + m1.getQuestionText() + ", Correct Answer:" + m1.getCorrectAnswer() + ", Mark:" + m1.getMark() + ", Option A;" + m1.getOptionA() + ", Option B:" + m1.getOptionB() + ", Option C" + m1.getOptionC());

                questionText = JOptionPane.showInputDialog(null, "Please enter the question text");
                m1.setQuestionText(questionText);
                correctAnswer = JOptionPane.showInputDialog(null, "Please enter the correct answer");
                m1.setCorrectAnswer(correctAnswer);
                mark = JOptionPane.showInputDialog(null, "Please enter the total marks for this question");
                m1.setMark(mark);
                optionA = JOptionPane.showInputDialog(null, "Please enter option A");
                m1.setOptionA(optionA);
                optionB = JOptionPane.showInputDialog(null, "Please enter option B");
                m1.setOptionB(optionB);
                optionC = JOptionPane.showInputDialog(null, "Please enter option C");
                m1.setOptionC(optionC);
                JOptionPane.showMessageDialog(null, "You have entered");
                JOptionPane.showMessageDialog(null, "Question:" + m1.getQuestionText() + ", Correct Answer:" + m1.getCorrectAnswer() + ", Mark:" + m1.getMark() + ", Option A;" + m1.getOptionA() + ", Option B:" + m1.getOptionB() + ", Option C" + m1.getOptionC());

            } else if (num == 3) {
                JOptionPane.showMessageDialog(null, "You have chosen to add a essay question ");
                JOptionPane.showMessageDialog(null, "Previous question ");
                //essay style question
                Essay e1 = new Essay("vfWTSD", " sgwgygusu", "5", 22);
                JOptionPane.showMessageDialog(null, "Question:" + e1.getQuestionText() + ", Correct Answer:" + e1.getCorrectAnswer() + ", Mark:" + e1.getMark() + ", max word count set at:" + e1.getMaxWordCount() + " Characters");

                questionText = JOptionPane.showInputDialog(null, "Please enter the question text");
                e1.setQuestionText(questionText);
                correctAnswer = JOptionPane.showInputDialog(null, "Please enter the correct answer");
                e1.setCorrectAnswer(correctAnswer);
                mark = JOptionPane.showInputDialog(null, "Please enter the total marks for this question");
                e1.setMark(mark);
                maxWordCount = Integer.parseInt(JOptionPane.showInputDialog(null, "Plase enter the max word count "));
                e1.setMaxWordCount(maxWordCount);
                JOptionPane.showMessageDialog(null, "You have entered");
                JOptionPane.showMessageDialog(null, "Question:" + e1.getQuestionText() + ", Correct Answer:" + e1.getCorrectAnswer() + ", Mark:" + e1.getMark() + ", max word count set at:" + e1.getMaxWordCount() + " Characters");
            }
           again = JOptionPane.showInputDialog(null, "Enter yes to play again or no to quit");
        } while (again.equalsIgnoreCase("Yes"));
*/