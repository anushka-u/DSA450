package recursion.easy;

public class CountVowels {

    static int count=0;


    public static int  countVowel(String str){
        if(str.isEmpty())
        {
            return count;
        }
        if(str.charAt(str.length()-1)=='a'||str.charAt(str.length()-1)=='e'||
                str.charAt(str.length()-1)=='i'||str.charAt(str.length()-1)=='o'
                ||str.charAt(str.length()-1)=='u')
        {
            count+=1;
        }
        return countVowel(str.substring(0,str.length()-1));
    }

    public static int countConsonants(String str)
    {
        if(str.isEmpty())
        {
            return count;
        }
        if(str.charAt(str.length()-1)!='a'&& str.charAt(str.length()-1)!='e'&&
            str.charAt(str.length()-1)!='i'&& str.charAt(str.length()-1)!='o'
            &&str.charAt(str.length()-1)!='u'){
            count+=1;
        }
        return countConsonants(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        String str ="anushka";
        countConsonants(str);
        System.out.println(count);


    }
}
