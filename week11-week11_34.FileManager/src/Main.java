
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();

        for (String line : t.read("src/testinput2.txt")) {
            System.out.println(line);
        }
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("test");
        list.add("another test");
        list.add("possible test");
        
        t.save("src/testinput2.txt", list);
        
        for (String line : t.read("src/testinput2.txt")) {
            System.out.println(line);
        }
    }
}
