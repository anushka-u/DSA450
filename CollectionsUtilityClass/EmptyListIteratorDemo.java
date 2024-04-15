import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmptyListIteratorDemo {
    public static void main(String[] args) {

        List<String> list = getNamesFromExternalSource();
        if(list==null)
        {
            list = Collections.emptyList();
        }
        ListIterator<String> lItr =  list.isEmpty()? Collections.emptyListIterator():list.listIterator();
        while (lItr.hasNext())
        {
            System.out.println(lItr.next());
        }

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static List<String> getNamesFromExternalSource(){

        return null;
    }
}
