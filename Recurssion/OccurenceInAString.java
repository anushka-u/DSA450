import java.util.Collection;

//Counting the position in string by 1 -> remove +1 inf if condn if uh want to count by 0.
public class OccurenceInAString {

    public static int first =-1;
    public static int last=-1;

    public  static void CountOccurence(String str, int idx, char ele){

        if(idx == str.length())
        {
            return;
        }
        char current = str.charAt(idx);
        if(current==ele)
        {
            if(first==-1 && last ==-1)
            {
                first = idx+1;
                last=idx+1;
            }
            else{
                last = idx+1;
            }
        }
        CountOccurence(str,idx+1,ele);
    }
    public static void occurenceCountWay2(String str, char ele)
    {
        if(str.isEmpty())
        {
            return;
        }
        char current = str.charAt(str.length()-1);
        if(current == ele)
        {
            if(last==-1 && first ==-1)
            {
                last=str.length();
                first = str.length();
            }
            else{
                first = str.length();
            }
        }

        occurenceCountWay2(str.substring(0,str.length()-1), ele);
    }
    public static void main(String[] args) {
        String str = "aabarakadaabra";
        String str2 = "aalujaaKaChaalujaBeta";
       // CountOccurence(str2,0,'a');
        System.out.println("First Occurence "+ first + " Last Occurence "+ last);
        occurenceCountWay2(str2,'a');
        System.out.println(str2.length());
        System.out.println("First OCcurence "+ first + " Last Occurence "+ last);
    }
}
