import java.util.ArrayList;
import java.util.List;

public class longestPrefix {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Anushka");
        stringList.add("Anushk");
        stringList.add("Anush");
        stringList.add("Anus");
        stringList.add("Anukp");
        String temp ="";
        for(int i=0;i<stringList.size();i++)
        {
            temp+=stringList.get(i).charAt(i);
            for(int j=0;j<stringList.size();j++)
            {

            }
        }
    }
}
