package recursion.easy;

public class RemoveAllDigits {

    public static String removeAllDigs(String str,String temp)
    {
        if(str.isEmpty())
        {
            return temp;
        }

        if(!Character.isDigit(str.charAt((str.length()-1)))){
            temp=str.charAt(str.length()-1)+temp;
        }

        return removeAllDigs(str.substring(0,str.length()-1),temp);
    }

    public static void main(String[] args) {
        String str = "a1b2c3";
        String temp = "";
        System.out.println(removeAllDigs(str,temp));
    }
}
