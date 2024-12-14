package recursion.easy;

public class CountWords {

    static int count = 0;
    public static int countWords(String str, int idx){
        if(str.length()==0 || idx == str.length())
            return count;

        if(str.length()!=0 && count ==0)
        {
            count = 1;
        }

        if(str.charAt(idx)==' ')
        {
            count+=1;
        }
        return countWords(str,idx+1);
    }

    public static void main(String[] args) {
        String str = "hello world! It's a beautifull day";
        System.out.println(countWords(str,0));
    }
}
