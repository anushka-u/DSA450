import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedListDemo {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(45);
        list.add("Kanta");

        List list2 = Collections.checkedList(list,Integer.class);

        try{
            list2.add("Madhuri");
        }
        catch (ClassCastException c)
        {
            c.printStackTrace();
        }
    }
}
