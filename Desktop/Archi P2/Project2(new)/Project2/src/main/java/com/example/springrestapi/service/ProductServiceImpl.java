/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springrestapi.service;

import com.example.springrestapi.model.Joke;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static java.util.Spliterators.iterator;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class ProductServiceImpl implements JokeService
{
   
    public ProductServiceImpl() {
    
    jokes.add(new Joke(1,"Why bicyle keep falls?","Becuase it is two-tired"));
    jokes.add(new Joke(2,"What has four legs but cant walk?","A table!"));
    jokes.add(new Joke(3,"Why do bees have sticky hair?","Becuase they use honeycombs"));
    jokes.add(new Joke(4,"What did the shark say when he ate the clownfish?","This tastes a little funny"));
    jokes.add(new Joke(5,"What has four legs but cant walk?","A table!"));
    }
    
    List<Joke> jokes= new ArrayList<>();
    
    @Override
    public List<Joke>getJoke(){
     return jokes;
      }
      
    @Override
      public Joke getJoke(int id){
          Iterator <Joke> iterator = jokes.iterator();
      while (iterator.hasNext()){
          Joke joke = iterator.next();
          if (joke.getId() ==id){
              return joke;
          }
      }        
       return null;          
}
    @Override
    public void createJoke(int id, String setup,String punchline){
    jokes.add(new Joke(id,setup,punchline));
}

public void updateJoke(Joke joke){
    getJoke(joke.getId()).setSetup(joke.getSetup());
    getJoke(joke.getId()).setPunchline(joke.getPunchline());
}

public void deleteJoke(int id){
System.out.println("Status.. "+jokes.remove(getJoke(id)));
}

}