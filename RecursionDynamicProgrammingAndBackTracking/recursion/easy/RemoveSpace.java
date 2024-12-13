package recursion.easy;

public class RemoveSpace {

    static String temp = "";
    public static void removeSpace(String str){
        if(str.isEmpty())
        {
            return;
        }
        if(str.charAt(str.length()-1)!=' ')
        {
            temp=str.charAt(str.length()-1)+temp;
        }
        removeSpace(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        String str = "Hello Beautifull";
        removeSpace(str);
        System.out.println(temp);
    }
}
