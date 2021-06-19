import java.util.*;
public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<Student>();
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        Student third = new Student("andersen");
        
        students.add(first);
        students.add(second);
        students.add(third);
        
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
        //System.out.println(first.compareTo(second));
        
        
    }
}
