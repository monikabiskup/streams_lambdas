
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    public void filter(List<Beverage> list) {
        List filtred = list.stream()
                .filter(b->b.name.startsWith("C"))
                .collect(Collectors.toList());
                System.out.println(filtred);
    }

}

