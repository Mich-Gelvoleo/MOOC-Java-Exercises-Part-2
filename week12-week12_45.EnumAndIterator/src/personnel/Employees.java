/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Michele Gelvoleo
 */
public class Employees {
    private ArrayList<Person> employees;
    
    public Employees(){
        this.employees = new ArrayList<Person>();
    }
    
    public void add(Person person){
        this.employees.add(person);
    }
    
    public void add(List<Person> persons){
        for(Person person : persons){
            this.employees.add(person);
        }
    }
    
    public void print(){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person);
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation().equals(education)){
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
