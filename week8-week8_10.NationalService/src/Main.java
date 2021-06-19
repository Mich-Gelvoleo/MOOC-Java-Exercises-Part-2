public class Main {
    public static void main(String[] args) {
        // Test your code here!
        CivilService ains = new CivilService();
        MilitaryService frank = new MilitaryService(50);
        
        System.out.println(ains.getDaysLeft());
        System.out.println(frank.getDaysLeft());
        
        ains.work();
        frank.work();
        
        System.out.println(ains.getDaysLeft());
        System.out.println(frank.getDaysLeft());
    }
}
