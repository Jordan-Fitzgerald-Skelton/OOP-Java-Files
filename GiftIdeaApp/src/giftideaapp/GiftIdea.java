/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giftideaapp;

import java.io.Serializable;

/**
 *
 * @author Jordan
 */
public class GiftIdea implements Serializable{
    private String name, idea, url;
    
    public GiftIdea(){
        name="";
        idea="";
        url="";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getDeatils(){
        return "Name" + name + "\n Gift Idea:" + idea + "\n URL:" + url;
    }
    
}
