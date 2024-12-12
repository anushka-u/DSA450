package recursion.easy;

public class CountVowels {

    static int count =0;

    public static void countVowel(String str){
        if(str.isEmpty())
        {
            return;
        }
        if(str.charAt(str.length()-1)=='a'||str.charAt(str.length()-1)=='e'||
                str.charAt(str.length()-1)=='i'||str.charAt(str.length()-1)=='o'
                ||str.charAt(str.length()-1)=='u')
        {
            count+=1;
        }
        countVowel(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        String str ="anushka";
        countVowel(str);
        System.out.println(count);
    }
}
