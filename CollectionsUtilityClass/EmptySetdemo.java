import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EmptySetdemo {
    public static void main(String[] args) {
        Set <Integer>  hashSet = getUniqueValue();

        if(hashSet == null)
        {
            hashSet = Collections.emptySet();
        }

        try {
            Collections.addAll(hashSet, 1, 2, 3, 4, 5);
        }catch(UnsupportedOperationException e){
            System.out.println("Cannot add element in an EmptySet");
            e.printStackTrace();
        }

        HashSet<Integer> hashSet1 = new HashSet<>();
        Collections.addAll(hashSet1, 1,2,3,4,4,5,5);
        System.out.println(hashSet1);

    }

    public static HashSet<Integer> getUniqueValue(){
        return null;
    }
}
