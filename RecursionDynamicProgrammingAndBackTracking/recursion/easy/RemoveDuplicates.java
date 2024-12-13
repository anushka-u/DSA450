package recursion.easy;

public class RemoveDuplicates {

    static String temp = "";

    public static void removeDuplicates(String str,int idx)
    {
        if(idx==str.length())
        {
            return;
        }

        char current = str.charAt(idx);
        if(!temp.contains(String.valueOf(current)))
        {
            temp+=current;
        }
        removeDuplicates(str,idx+1);
    }

    public static void main(String[] args) {
        String str = "mississippi";
        removeDuplicates(str,0);
        System.out.println(temp);
    }
}
