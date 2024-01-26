import java.util.StringJoiner;

public class CustomLinkedList {

    Node head;
    Node last;
    public static void main(String[] args) {

        CustomLinkedList cll = new CustomLinkedList();
        cll.add(10);
        cll.add(40);
        cll.add(56);

        System.out.println(cll);
    }

    public class Node {
        Object data;
        Node next;

        Node(Object obj) {
            this.data = obj;
        }
    }
    public void add(Object obj)
    {
            Node n = new Node(obj);
            if(head == null)
            {
                head = n;
                last=n;
            }
            else{

                last.next=n;
                last=n;
//                Node temp = head;
//                while(temp.next!=null)
//                {
//                    temp =temp.next;
//                }
//                temp.next=n;

            }

    }


}
