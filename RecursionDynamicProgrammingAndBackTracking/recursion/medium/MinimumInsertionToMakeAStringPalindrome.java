package recursion.medium;

public class MinimumInsertionToMakeAStringPalindrome {

    public static int minimumInsertion(String str, int idx1, int idx2)
    {
        if(idx1>=idx2)
            return 0;

        if(str.charAt(idx1) == str.charAt(idx2))
        {
            return minimumInsertion(str,idx1+1,idx2-1);
        }
        else{
            return 1 + Math.min(minimumInsertion(str, idx1+1, idx2), minimumInsertion(str, idx1, idx2-1));
        }
    }

    public static void main(String[] args) {
        String str = "aabbc";
        System.out.println(minimumInsertion(str,0,str.length()-1));
    }
}
