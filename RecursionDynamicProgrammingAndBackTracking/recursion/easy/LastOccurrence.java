package recursion.easy;

public class LastOccurrence {
    static int count =0;

    public  static int lastOccurenceOfCharacter(String str, char ele)
    {
        if(str.isEmpty())
            return count;
        if(str.charAt(str.length()-1)==ele)
        {
            return count=str.length()-1;
        }

        return lastOccurenceOfCharacter(str.substring(0,str.length()-1),ele);
    }

    public static void main(String[] args) {
        String str = "recurssion";
        lastOccurenceOfCharacter(str,'s');
        System.out.println(count);
    }
}
