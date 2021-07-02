
package com.example.springrestapi.controller;

import com.example.springrestapi.model.Joke;
import com.example.springrestapi.service.JokeService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Ashwini
 */
@RestController
@RequestMapping("/jokes")
public class JokeController {
    
    
    @Autowired
    JokeService jokeService;
    
    @GetMapping("")
    List <Joke> getJokes(){
        return jokeService.getJoke();
    }
    @GetMapping("/{id}")
    public Joke getJoke(@PathVariable("id")int id){
        return jokeService.getJoke(id);
    }

@PostMapping(value="")
public Map<String, Object>createJoke(@RequestParam(value="id")int id,
@RequestParam(value="setup")String setup, @RequestParam(value="punchline")String punchline){

jokeService.createJoke(id, setup, punchline);

Map<String ,Object>map= new HashMap<String ,Object>();
map.put("status", "Joke added!");
return map;
} 
@PutMapping(value="")
public Joke updateJokeUsingJson(@RequestBody Joke joke){
    jokeService.updateJoke(joke);
    return joke;
}
@DeleteMapping("/{id}")
public Map<String,Object>deleteJoke(@PathVariable("id")int id){
    jokeService.deleteJoke(id);
    Map<String, Object>map=new HashMap<String,Object>();
    map.put("status", "Joke deleted!");
    return map;
}
}
