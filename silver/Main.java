package silver;

public class Main {
    public static void main(String[] args) {
       try {
        if (args.length == 0) {
            System.out.println("A");
        } 
       } catch (NullPointerException e) {
        System.out.println("B");
       } finally {
        System.out.println("C");
       }
    }
}