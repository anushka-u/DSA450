package recursion.easy;

public class RemoveConsecutiveDuplicate {


    static String temp= "";
    public static String removeConsecutive(String str,int idx)
    {
        if(idx==str.length())
        {
            return temp;
        }
        if(idx==0)
        {
            temp+=str.charAt(idx);
        }else if(idx!=0 && str.charAt(idx)!=str.charAt(idx-1))
        {
            temp+=str.charAt(idx);
        }

        return removeConsecutive(str,idx+1);
    }

    public static void main(String[] args) {
        String str = "aaabbccddd";
        removeConsecutive(str,0);
        System.out.println(temp);

    }

}
