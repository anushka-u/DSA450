package recursion.easy;

public class checkAnagrams {

    public static boolean checkAnagrams(String str1, String str2){
        if(str1.isEmpty() &&  str2.isEmpty())
        {
            return true;
        }
        if(str1.length()!=str2.length())
        {
            return false;
        }
        if(!str1.contains(String.valueOf(str2.charAt(str2.length()-1)))){
            return false;
        }
        int index = str1.indexOf(str2.charAt(str2.length()-1));
        if(index==-1)
        {
            return  false;
        }
        return checkAnagrams(str1.substring(0,index)+str1.substring(index+1,str1.length()),str2.substring(0,str2.length()-1));

    }
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        System.out.println(checkAnagrams(str1,str2));

        String str3 = "dee";
        String str4="dii";
        System.out.println(checkAnagrams(str3,str4));
    }
}
