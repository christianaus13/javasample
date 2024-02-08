import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Car cm= new Car();
    cm.start();
    cm.stop();
    cm.carname();
    Machine mac1= new Machine();
    mac1.start();
    mac1.stop();

    System.out.println("norbs was here");

    List<String> names = Arrays.asList("norbs","mark","aus", "jester");
    System.out.println(names);
        System.out.println("aus was here");
    }
}