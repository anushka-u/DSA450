package recursion.easy;

public class FirstOccurrence {

    static int firstoccur = -1;

    public static void countFirstOccurrence(String str,char ele)
    {
        if(str.isEmpty())
        {
            return;
        }
        if(str.charAt(str.length()-1)==ele)
        {
            firstoccur = str.length()-1;
        }

        countFirstOccurrence(str.substring(0,str.length()-1),ele);
    }


    public static void main(String[] args) {
        String str = "recurssion";
        char ele = 'e';
        countFirstOccurrence(str.substring(0,str.length()-1),ele);
        System.out.println(firstoccur);
    }
}
