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

public class UserInterface {
    private Flights flights;
    private Airplanes planes;
    private Scanner reader;
    
    public UserInterface(){
        flights = new Flights();
        planes = new Airplanes();
        reader = new Scanner(System.in);
    }
    
    public void startPanel(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        String id;
        boolean end = false;
        
        while(true){
            System.out.println("Choose Operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            
            System.out.print("> ");
            String option = reader.nextLine();
            
            if(option.equals("1")){
                System.out.print("Give plane ID: ");
                id = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int cap = Integer.parseInt(reader.nextLine());
                
                planes.addPlanes(id, cap);
            }else if(option.equals("2")){
                System.out.print("Give plane ID: ");
                id = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String depCode = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String destCode = reader.nextLine();
                
                String entry = "" + planes.getPlane(id) + " (" + depCode + "-" + destCode + ")";
                this.flights.addFlight(entry);
            }else if(option.equals("x")){
                System.out.println("Flight service");
                System.out.println("--------------------");
        
                while(true){
                    System.out.println("Choose Operation: ");
                    System.out.println("[1] Print planes");
                    System.out.println("[2] Print flights");
                    System.out.println("[3] Print plane info");
                    System.out.println("[x] Quit");
            
                    System.out.print("> ");
                    String option2 = reader.nextLine();
            
                    if(option2.equals("1")){
                        System.out.println(planes);
                    }else if(option2.equals("2")){
                        System.out.println(flights);
                    }else if(option2.equals("3")){
                        System.out.print("Give plane ID: ");
                        id = reader.nextLine();
                        String entry = this.planes.getPlane(id);
                        System.out.println(entry);
                    }else if(option2.equals("x")){
                        end = true;
                        break;
                    }  
                }   
                
                if(end){
                    break;
                }
            }
        }
    }
}
