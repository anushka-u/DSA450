package recursion.easy;

public class convertToUpperCase {

    static String temp = "";
    static String temp2="";
    public static String convertToUpperAndLower(String str)
    {
        if(str.isEmpty())
        {
            return temp;
        }
        temp=Character.toUpperCase(str.charAt(str.length()-1))+temp;
        temp2=Character.toLowerCase(str.charAt(str.length()-1))+temp2;
        return convertToUpperAndLower(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        String str = "hello world";
        convertToUpperAndLower(str);
        System.out.println(temp);
        System.out.println(temp2);
    }
}
