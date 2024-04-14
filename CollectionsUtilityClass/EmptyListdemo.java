import java.util.Collections;
import java.util.List;

public class EmptyListdemo {
    
    public static void main(String[] args) {

        List<String> names = getNamesFromExternalSource();

        if(names==null)
        {
            names = Collections.emptyList();
        }

        if(names.isEmpty())
        {
            System.out.println("It's an empty list");
        }
        else{
            System.out.println("Not an empty list");
        }

    }

    public static
    List<String> getNamesFromExternalSource(){

        return null;
    }
}
