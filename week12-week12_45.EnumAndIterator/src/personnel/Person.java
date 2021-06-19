/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Michele Gelvoleo
 */
public class Person {
    private String name;
    private Education educ;
    
    public Person(String name, Education educ){
        this.name = name;
        this.educ = educ;
    }
    
    @Override
    public String toString(){
        return this.name + ", " + this.educ;
    }
    
    public Education getEducation(){
        return this.educ;
    }
}
