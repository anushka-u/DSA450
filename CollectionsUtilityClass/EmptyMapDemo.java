import java.util.Collections;
import java.util.Map;

public class EmptyMapDemo {

    public static void main(String[] args) {

        Map<Integer,String> details = getKeyValuePairs();
        if(details==null)
        {
            details = Collections.emptyMap();
        }

        if(details.isEmpty())
        {
            System.out.println("It's an Empty Map");
        }
        else{
            System.out.println("Not an Empty Map");
        }

    }

    public  static Map<Integer,String> getKeyValuePairs(){
        return null;
    }
}
