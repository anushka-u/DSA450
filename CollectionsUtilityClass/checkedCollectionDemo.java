import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class checkedCollectionDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 12,34,454,1,2);

        Collection<Integer> collection = Collections.checkedCollection(list,Integer.class);
        try{
            collection.add(78);
        }catch(ClassCastException c)
        {
            System.out.println("Cannot add, it's type safed");
        }
        System.out.println(collection);
    }
}
