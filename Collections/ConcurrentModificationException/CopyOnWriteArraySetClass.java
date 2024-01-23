import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetClass {
    public static void main(String[] args) {
        Set<Integer> set = new CopyOnWriteArraySet<>();
        set.add(90);
        set.add(67);
        set.add(21);
        set.add(12);

        /*
        We can avoid getting ConcurrentModificationException by using
        CopyOnWriteArraySet instead of HashSet
         */

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext())
        {
            set.add(46);
            System.out.println(itr.next());
        }

    }
}
