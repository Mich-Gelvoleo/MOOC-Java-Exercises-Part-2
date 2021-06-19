/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.*;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Michele Gelvoleo
 */
public class FilmComparator implements Comparator<Film>{
    private Map<Film, List<Rating>> ratings;
    
     public FilmComparator(Map<Film, List<Rating>> ratings){
         this.ratings = ratings;
     }

    @Override
    public int compare(Film o1, Film o2) {
        double ratingFirst = 0;
        double ratingSecond = 0;
        
        for(Rating rating : ratings.get(o1)){
            ratingFirst += rating.getValue();
        }
        
        ratingFirst /= ratings.size();
        //ratingFirst = (int) ratingFirst;
        
        for(Rating rating : ratings.get(o2)){
            ratingSecond += rating.getValue();
        }
        
        ratingSecond /= ratings.size();
        //ratingSecond = (int) ratingSecond;
        
        if(ratingFirst==ratingSecond){
            return 0;
        }else if(ratingFirst > ratingSecond){
            return -1;
        }else{
            return 1;
        }
    }
     
     
}
