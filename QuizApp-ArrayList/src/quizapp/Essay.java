/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;

/**
 *
 * @author Jordan
 */
public class Essay extends Quiz{
    private int maxWordCount;

    public int getMaxWordCount() {
        return maxWordCount;
    }

    public void setMaxWordCount(int maxWordCount) {
        this.maxWordCount = maxWordCount;
    }
    
    public Essay(String questionText, String correctAnswer, String mark, int maxWordCount){
        super(questionText, correctAnswer, mark);
        this.maxWordCount = maxWordCount;
    }
    public Essay() {
        super();
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+", Max Word Count "+maxWordCount;
    }
}
