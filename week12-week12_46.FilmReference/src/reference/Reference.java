/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import reference.domain.Person;
import reference.domain.Film;
import reference.domain.Rating;

import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;

import java.util.*;


/**
 *
 * @author Michele Gelvoleo
 */
public class Reference {
    
    private RatingRegister register;
    
    public Reference(RatingRegister register){
        this.register = register;
    }
    
    public Film recommendFilm(Person person){
        if (register.getPersonalRatings(person).isEmpty()) {
            List<Film> films = new ArrayList<Film>(register.filmRatings().keySet());
            Collections.sort(films, new FilmComparator(register.filmRatings()));
            return films.get(0);
        }
        
        List<Person> reviewersSortedBySimilarity = reviewersSortBySimilarity(person);
        
        return getRecommendedFilm(person, reviewersSortedBySimilarity);
    }
    
    private List<Person> reviewersSortBySimilarity(Person viewer) {
        Map<Person, Integer> reviewerSimilarity = reviewerSimilarity(register.getPersonalRatings(viewer));
        
        List<Person> similarReviewers = new ArrayList<Person>(reviewerSimilarity.keySet());
        Collections.sort(similarReviewers, new PersonComparator(reviewerSimilarity));
       
        return similarReviewers;
    }
    
    private Map<Person, Integer> reviewerSimilarity(Map<Film, Rating> filmRatings) {
        Map<Person, Integer> reviewerSimilarity = new HashMap<Person, Integer>();
        for (Person reviewer : register.reviewers()) {
            int similarity = 0;
            
            for (Film film : filmRatings.keySet()) {         
                similarity += filmRatings.get(film).getValue() * register.getRating(reviewer, film).getValue();
            }
            
            if (similarity > 0) {
                reviewerSimilarity.put(reviewer, similarity);
            }
        }
        
        return reviewerSimilarity;
    }
    
    private Film getRecommendedFilm(Person viewer, List<Person> reviewersSortedBySimilarity) {
        Map<Film, Rating> viewersSeenFilms = register.getPersonalRatings(viewer);
        
        for (Person reviewer : reviewersSortedBySimilarity) {
            if (reviewer == viewer) {
                continue;
            }

            for (Film film : register.getPersonalRatings(reviewer).keySet()) {
                if (viewersSeenFilms.containsKey(film)) { 
                    continue;
                }

                if (register.getPersonalRatings(reviewer).get(film).getValue() > 1) {
                    return film;
                }
            }
        }

        return null;
    }    
}
