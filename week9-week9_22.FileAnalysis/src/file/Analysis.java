/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Michele Gelvoleo
 */
public class Analysis {
    private File file;
    public Analysis(File file){
        this.file = file;
    }
    
    public int lines() throws Exception{
        Scanner reader = new Scanner(this.file);
        int lines = 0;
        String buffer = "";
        
        while(reader.hasNextLine()){
            buffer = reader.nextLine();
            lines++;
        }
        
        reader.close();
        return lines;
    }
    
    public int characters() throws Exception{
        Scanner reader = new Scanner(this.file);
        int words = 0;
        String buffer = "";
        
        while(reader.hasNext()){
            buffer = reader.next();
            words += buffer.length();
            words++;
        }
        
        reader.close();
        return words;
    }
}
