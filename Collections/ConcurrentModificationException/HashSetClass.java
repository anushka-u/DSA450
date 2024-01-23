
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(13);
        set.add(19);
        set.add(81);

        /*
        ConcurrentModificationException will occur on doing any structural modification
        on HashSet because after any structural modification, the modcount does increases
        and when the next() executes and modcount doesn't match with expectedmodcount we do get
        ConcurrentModificationException
         */

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext())
        {
            set.remove(13);
            System.out.println(itr.next());
        }

    }
}
