/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springrestapi.service;

/**
 *
 * @author User
 */
import java.util.List;
import com.example.springrestapi.model.Joke;


public interface JokeService {
    List<Joke>getJoke();
    Joke getJoke(int id);
    
    void createJoke(int id,String setup,String punchline);
    void updateJoke(Joke joke);
    void deleteJoke(int id);
}
