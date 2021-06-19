import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner(System.in);
        String str;
        
        System.out.print("Give a string: ");
        str = reader.nextLine();
        
        if(isAWeekDay(str)){
            System.out.println("The form is fine.");
        }else{
            System.out.println("The form is wrong.");
        }
        
        System.out.print("Give a string: ");
        str = reader.nextLine();
        
        if(allVowels(str)){
            System.out.println("The form is fine.");
        }else{
            System.out.println("The form is wrong.");
        }
        
        System.out.print("Give a string: ");
        str = reader.nextLine();
        
        if(clockTime(str)){
            System.out.println("The form is fine.");
        }else{
            System.out.println("The form is wrong.");
        }
        
        
        
    }
    
    public static boolean isAWeekDay(String string){
        if(string.matches(("mon|tue|wed|thu|fri|sat|sun"))){
            return true;
        }
        
        return false;
    }
    
    public static boolean allVowels(String string){
        if(string.matches(("[a|e|i|o|u|ä|ö]*"))){
            return true;
        }
        
        return false;  
    }
    
    public static boolean clockTime(String string){
        if(string.matches("([0-1][0-9]|2[0-3])(:[0-5][0-9]){2}")){
            return true;
        }else if(string.matches("(2[4]):(:[0][0]){2}")){
            return true;
        }
        
        return false;      
    }
}
