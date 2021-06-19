/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Michele Gelvoleo
 */
public class RatingRegister {
    private HashMap<Film, List<Rating>> ratings;
    private HashMap<Person, Map<Film, Rating>> reviews;
    
    public RatingRegister(){
        this.ratings = new HashMap<Film, List<Rating>>();
        this.reviews = new HashMap<Person, Map<Film, Rating>>();
    }
    
    public void addRating(Film film, Rating rating){
        if(!ratings.containsKey(film)){
            ratings.put(film, new ArrayList<Rating>());
        }
        
        ratings.get(film).add(rating);
    }
    
    public List<Rating> getRatings(Film film){
        return ratings.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings(){
        return ratings;
    }
    
    public void addRating(Person person, Film film, Rating rating){
        if(!reviews.containsKey(person)){
            reviews.put(person, new HashMap<Film, Rating>());
            reviews.get(person).put(film, rating);
            addRating(film, rating);
        }else if(!reviews.get(person).containsKey(film)){
            reviews.get(person).put(film, rating);
            addRating(film, rating);
        }
    }
    
    public Rating getRating(Person person, Film film){
        if(!reviews.containsKey(person)){
            return Rating.NOT_WATCHED;
        }else if(!reviews.get(person).containsKey(film)){
            return Rating.NOT_WATCHED;
        }
        
        return reviews.get(person).get(film);
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        if (!reviews.containsKey(person)) {
            return new HashMap();
        }
        
        return reviews.get(person);
    }
    
    public List<Person> reviewers(){
        return new ArrayList<Person>(reviews.keySet());
    }
}
