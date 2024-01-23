import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapClass {

    public static void main(String[] args) {

        Map<Integer,String> mp = new ConcurrentHashMap<>();
        mp.put(1,"A");
        mp.put(2,"B");
        mp.put(3,"C");
        mp.put(4,"R");

        Iterator<Integer> itr = mp.keySet().iterator();

        while(itr.hasNext())
        {
            mp.put(12,"G");
            System.out.println(itr.next());
        }

    }
}
