package recursion.medium;

public class LongestCommonSubsequences {

    public static int longestCommon(String str, String str1, int idx1, int idx2)
    {
        if(idx1==str.length()|| idx2==str1.length())
        {
            return 0;
        }
        if(str.charAt(idx1)==str1.charAt(idx2)){
            return 1+longestCommon(str,str1,idx1+1,idx2+2);
        }
        return Math.max(longestCommon(str,str1,idx1+1,idx2),longestCommon(str,str1,idx1,idx2+1));
    }

    public static void main(String[] args) {
        String str = "AGGTAB";
        String str1 = "GXTXAYB";

        System.out.println(longestCommon(str,str1,0,0));

    }
}
