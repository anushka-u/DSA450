import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListClass {

    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(13);
        list.add(19);
        list.add(81);

        /*
        When we use ConcurrentCollections that is CopyOnWriteArrayList ,
        CopyOnWriteSet, ConcurrentHAshMap
        we don't get ConcurrentModificationException
        the reason behind it is beacuse they don't traverse the original object they
        creates a snapshot of object, whose location is different from original list

         */

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
            list.add(101);
        }
    }
}
