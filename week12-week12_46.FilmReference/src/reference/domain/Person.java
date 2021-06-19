/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

import java.util.Objects;

/**
 *
 * @author Michele Gelvoleo
 */
public class Person {
    private String person;
    
    public Person(String name){
        this.person = name;
    }
    
    public String getName(){
        return this.person;
    }
    
    @Override
    public String toString(){
        return this.person;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.person != null ? this.person.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if ((this.person == null) ? (other.person != null) : !this.person.equals(other.person)) {
            return false;
        }
        return true;
    }
}
