import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddAllDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 12,34,65,78,61);
        System.out.println(list);
    }
}
