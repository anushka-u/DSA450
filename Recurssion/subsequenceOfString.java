import java.util.ArrayList;
import java.util.List;

public class subsequenceOfString {
    static List<String> subseq = new ArrayList<>();
    public static void subsequences(String str,String current)
    {
        if(str.isEmpty())
        {
            subseq.add(current);
            return;
        }
        //Including the character
        subsequences(str.substring(0,str.length()-1),str.charAt(str.length()-1)+current);

        //Excluding the character
        subsequences(str.substring(0,str.length()-1),current);

    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str,"");
        System.out.println(subseq);
    }
}