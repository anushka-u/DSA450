import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class binarySearchDemo {

    public static void main(String[] args) {

        List<Integer> list =  new ArrayList<>();
        Collections.addAll(list, 12,23,4,5,6,66);
        int result = Collections.binarySearch(list,4);
        if(result >= 0)
        {
            System.out.println("Found Element");
        }
        else{
            System.out.println("Not Found");
        }


    }
}
