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

public class PhoneRecord {
    private Map<String, Contact> contacts = new HashMap<String, Contact>();
    
    public void addNumber(String name, String number){
        noKeyExistsYet(name);
        this.contacts.get(name).setNumber(number);
    }
    
    public void addAddress(String name, String street, String city){
        noKeyExistsYet(name);
        this.contacts.get(name).setAddress(street, city);
        this.contacts.get(name).setStreet(street);
        this.contacts.get(name).setCity(city);
    }
    
    public void deleteContact(String name){
        this.contacts.remove(name);
    }
    
    public Set<String> searchByName(String name){
        Contact contact = contacts.get(name);
        
        if(contact == null){
            return null;
        }
        
        return contact.getNumbers();
    }
    
    public String searchByNum(String number){
        for(String key : contacts.keySet()){
            if(contacts.get(key).getNumbers().contains(number)){
                return key;
            }
        }
        return null;
    }
    
    public Contact getRecord(String name){
        return contacts.get(name);
    }
    
    public void deleteRecord(String name){
        contacts.remove(name);
    }
    
    public Set<Contact> filterRecords(String keyword){
        Set<Contact> matches = new TreeSet<Contact>();
        
        for(String key : contacts.keySet()){
            Contact contact = contacts.get(key);
            if(contact.getCities().contains(keyword) || contact.getName().contains(keyword)|| contact.getStreets().contains(keyword) || keyword.equals("")){
                matches.add(contact);
            }
        }
        
        return matches;
    }
    
    public void noKeyExistsYet(String name){
        if(!this.contacts.containsKey(name)){
            this.contacts.put(name, new Contact(name));
        }
    }
}
