/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;

/**
 *
 * @author Jordan
 */
public abstract class Quiz {
    
    protected String questionText, correctAnswer, mark, Answer;
    
    
    public Quiz(String questionText, String correctAnswer, String mark) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.mark = mark;
    }

    public Quiz() {
        questionText = " ";
        correctAnswer = " ";
        mark = " ";
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }
    
    public String getDetails(){
        return "Question details -- Question Text:"+questionText+", Correct Answer:"+correctAnswer+", Marks going for the question:"+mark;
    }
}
