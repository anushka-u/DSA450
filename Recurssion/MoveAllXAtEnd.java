public class MoveAllXAtEnd {
    static int count =0;
    static String newString="";

    public static void moveXAtEnd(String str){
        if(str.isEmpty())
        {
            for(int i=0;i<count;i++)
            {
                newString = newString+'x';
            }
            return;
        }

        char current = str.charAt(str.length()-1);
        if(current=='x')
        {
            count+=1;
        }
        if(current!='x')
        {
            newString=current+newString;
        }
        moveXAtEnd(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        String str = "axxbcdxxsd";
        moveXAtEnd(str);
        System.out.println(newString);
    }
}
