/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booksapp;

/**
 *
 * @author Jordan
 */
public class Books {
    protected String title, author, genre;
    protected int isbn;

    public Books(String title, String author, String genre, int isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }

    public Books(){
        title = " ";
        author = " ";
        genre = " ";
        isbn = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    
    
    public String getDetails(){
        return "Book Details - Title: "+title+", Author: "+author+", Genre: "+genre + " , ISBN: " + isbn;
    }
}














