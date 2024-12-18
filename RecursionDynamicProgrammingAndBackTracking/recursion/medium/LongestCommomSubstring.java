package recursion.medium;

public class LongestCommomSubstring {

    static String longestCommonSub = "";

    public static void longestCommonSubstring(String str1, String str2,int idx1,int idx2, String temp)
    {
        if(idx1==str1.length() || idx2==str2.length())
        {
            return;
        }
        if(str1.charAt(idx1) == str2.charAt(idx2))
        {
            temp+=str1.charAt(idx1);
            if(temp.length()>longestCommonSub.length())
            {
                longestCommonSub=temp;
            }
            longestCommonSubstring(str1,str2,idx1+1,idx2+1,temp);
        }

        longestCommonSubstring(str1,str2,idx1+1,idx2+1,"");

    }

    public static void main(String[] args) {
        String str = "abcdghmn";
        String str2 = "abcefghmn";

        longestCommonSubstring(str,str2,0,0,"");

        System.out.println(longestCommonSub);
    }
}

