/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */
import java.util.Scanner;
import java.io.File;

public class Printer {
    private String fileName;
    
    public Printer(String filename) throws Exception{
        this.fileName = filename;
    }
    
    public void printLinesWhichContain(String word)throws Exception{
        File file = new File(this.fileName);
        Scanner reader = new Scanner(file);
        
        while(reader.hasNextLine()){
            String line = reader.nextLine();
       
            if(line.contains(word)){
                System.out.println(line);
            }
        }
        
    }
}
