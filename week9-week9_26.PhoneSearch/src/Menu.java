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
public class Menu {
    private Scanner reader;
    private PhoneRecord records;
    public Menu(){
        reader = new Scanner(System.in);
        records = new PhoneRecord();
    }
    
    public void instructions(){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }
    
    public void start(){
        instructions();
        while(true){
            System.out.println("");
            System.out.print("command: ");
            String command = reader.nextLine();
            
            if(command.equals("1")){
                System.out.print("whose number: ");
                String name = reader.nextLine();
                
                System.out.print("number: ");
                String num = reader.nextLine();
                
                records.addNumber(name, num);
                
            }else if(command.equals("2")){
                System.out.print("whose number: ");
                String name = reader.nextLine();
                
                Set<String> numbers = records.searchByName(name);
                
                if(numbers != null){
                    for(String number : numbers){
                        System.out.println(" " + number);
                    } 
                }else{
                    System.out.println("  not found");
                }
                
            }else if(command.equals("3")){
                System.out.print("number: ");
                String number = reader.nextLine();
                
                String name = records.searchByNum(number);
                
                if(name != null){
                    System.out.println(" " + name);
                }else{
                    System.out.println(" not found");
                }
                
            }else if(command.equals("4")){
                System.out.print("whose address: ");
                String name = reader.nextLine();
                
                System.out.print("street: ");
                String street = reader.nextLine();
                
                System.out.print("city: ");
                String city = reader.nextLine();
                
                records.addAddress(name, street, city);
                
            }else if(command.equals("5")){
                System.out.print("whose information: ");
                String name = reader.nextLine();
                
                Contact contact = records.getRecord(name);
                
                if(contact != null){
                    System.out.println(contact);
                }else{
                    System.out.println(" not found");
                }
            }else if(command.equals("6")){
                System.out.print("whose information: ");
                String name = reader.nextLine();
                
                records.deleteContact(name);
                
            }else if(command.equals("7")){
                System.out.print("keyword (if empty, all listed): ");
                String keyword = reader.nextLine();
                
                Set<Contact> contacts = records.filterRecords(keyword);
                
                if(contacts.size() > 0){
                    int i = 1;
                    for(Contact contact : contacts){
                        System.out.println(" " + contact.getName());
                        System.out.println(contact);
                        
                        if(i < contacts.size()){
                            System.out.println("");
                        }
                        
                        i++;
                    }
                }else{
                    System.out.println(" keyword not found");
                }
                
            }else if(command.equals("x")){
                break;
            }
        }
    }
}
