import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class optimizeNthNodeFromEnd {

    public static void nthNodeFromEnd(Node head,int n){
        HashMap<Integer,Node> map = new HashMap<>();
        Node dummy = new Node(-1);
        dummy.next = head;
        int pos = 1;
        int count=0;
        while(head!=null)
        {
            map.put(pos,dummy.next);
            pos+=1;
            count+=1;
            dummy=dummy.next;
            head=head.next;
        }

       for(Map.Entry<Integer,Node> entry : map.entrySet())
       {
           System.out.println("Key "+ entry.getKey() + " Value "+entry.getValue().data );
       }
        //To Print nth Node from int -> Print lengthOfLinkedList-nthNode+1; so If it's last 3rd node and linked list length is 5 so it will be 5-3+1 = 3
        System.out.println(map.get(count-n+1).data);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(14);
        head.next.next = new Node(22);
        head.next.next.next=new Node(41);
        head.next.next.next.next=new Node(11);

        nthNodeFromEnd(head,3);
    }
}
