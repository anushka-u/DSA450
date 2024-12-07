public class RemoveDuplicatesInString {

    static String newString ="";
    public static String removeDuplicate(String str)
    {
        if(str.isEmpty())
            return newString;

        char ch = str.charAt(str.length()-1);
        if(!newString.contains(String.valueOf(ch))){
            newString=newString+ch;
        }

        return removeDuplicate(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        String str = "aabarakadaabra";
        System.out.println(removeDuplicate(str));

    }
}
