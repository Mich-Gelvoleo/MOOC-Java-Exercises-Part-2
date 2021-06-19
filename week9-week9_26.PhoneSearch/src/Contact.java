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

public class Contact implements Comparable{
    private final String name;
    private final List<String> addresses = new ArrayList<String>();
    private final List<String> cities = new ArrayList<String>();
    private final List<String> streets = new ArrayList<String>();
    private final Set<String> phoneNumbers = new HashSet<String>();
    
    public Contact(String name){
        this.name = name;
    }
    
    public void setAddress(String street, String city){
        String address = street + " " + city;
        addresses.add(address);
    }
    
    public void setStreet(String street){
        streets.add(street);
    }
    
    public void setCity(String city){
        cities.add(city);
    }
    
    public void setNumber(String number){
        phoneNumbers.add(number);
    }
    
    public String getName(){
        return name;
    }
    
    public List<String> getAddresses(){
        return addresses;
    }
    
    public Set<String> getNumbers(){
        return phoneNumbers;
    }
    
    public List<String> getCities(){
        return cities;
    }
    
    public List<String> getStreets(){
        return streets;
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        
        if(addresses.size() > 0){
            for(String address : addresses){
                builder.append("  address: ").append(address);
                builder.append("\n");
            }
        }else{
            builder.append("  address unknown");
            builder.append("\n");
        }
        
        if(phoneNumbers.size() > 0){
            builder.append("  phone numbers:\n");
            for(String number : phoneNumbers){
                builder.append("   ").append(number);
                builder.append("\n");
            }
        }else{
            builder.append("  phone number not found");
        }
        return builder.toString();
    }
    
    @Override
    public int compareTo(Object object){
        Contact compareWith = (Contact) object;
        return name.compareTo(compareWith.getName());
    }
    
}
