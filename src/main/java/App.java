import java.awt.event.WindowAdapter;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Beverage> list = new ArrayList<>();
        list.add(new Beverage("Cola", 2));
        list.add(new Beverage("HipsterCola", 5));
        list.add(new Beverage("SuperHipsterCola", 5));
        list.add(new Beverage("UltraSuperHipsterCola", 10));
        list.add(new Beverage("CheapCola", 2));

        Warehouse warehouse = new Warehouse();
        warehouse.filter(list);


    }
}
