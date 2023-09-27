/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;

/**
 *
 * @author Jordan
 */
public class MultipleChoice extends Quiz{
    private String optionA, optionB, optionC;

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }
    
    
    public MultipleChoice(String questionText, String correctAnswer,String mark, String optionA, String optionB, String optionC) {
        super(questionText, correctAnswer, mark);
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        
        /*if(Answer.equalsIgnoreCase(correctAnswer)){
            
        }*/
    }

    public MultipleChoice() {
        super();
        optionA = " ";
        optionB = " ";
        optionC = "";
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+", Option A"+optionA+", OptionB" + optionB + ", OptionC"+optionC;
    }
}
