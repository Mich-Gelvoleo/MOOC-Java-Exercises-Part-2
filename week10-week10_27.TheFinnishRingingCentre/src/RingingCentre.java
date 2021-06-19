/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */
import java.util.*;

public class RingingCentre {
    private Map<Bird, List<String>> observations;
    
    public RingingCentre(){
        this.observations = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place){
        if(!this.observations.containsKey(bird)){
            this.observations.put(bird, new ArrayList<String>());
            this.observations.get(bird).add(place);
        }else{
            this.observations.get(bird).add(place);
        }
    }  
    
    public void observations(Bird bird){
        if(!observations.containsKey(bird)){
            System.out.println(bird.toString() + " observations: " + 0);
        }else{
            System.out.println(bird.toString() + " observations: " + this.observations.get(bird).size());
            System.out.println(observations.get(bird));
        }
    }
       
}
