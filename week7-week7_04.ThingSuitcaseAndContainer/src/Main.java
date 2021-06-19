import java.util.*;
public class Main {

    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int maxCases = 100;
        int i = 0;
        
        while(i < maxCases){
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(new Thing("brick", i + 1));
            container.addSuitcase(suitcase);
            i++;
        }
    }

}
