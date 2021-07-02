/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springrestapi.model;

/**
 *
 * @author User
 */
public class Joke {

private Joke() {
     super();
    }
   private int id;
   private String setup;
   private String punchline;
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
   
    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }



public Joke(int id,String setup, String punchline){
    super();
    this.id=id;
    this.setup=setup;
    this.punchline=punchline;
}
}
