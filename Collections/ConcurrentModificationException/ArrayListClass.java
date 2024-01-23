import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(13);
        list.add(19);
        list.add(81);

        Iterator<Integer> itr =  list.iterator();
        /*
        Any structural modification in Collection while traversing it using an iterator will give
        Concurrrent Modification Exception
         */

        while(itr.hasNext())
        {
            System.out.println(itr.next());
            list.add(78);
        }
    }
}
