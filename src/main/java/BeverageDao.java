import java.util.Arrays;
import java.util.List;

public class BeverageDao {

    List<Beverage> beverages;

    public BeverageDao() {
    }

    public BeverageDao(List<Beverage> beverages) {
        this.beverages = beverages;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }
}
