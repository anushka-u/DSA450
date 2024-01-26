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

        System.out.println(cll.length());
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
    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(",","[","]");

        Node temp=head;

        while(temp.next!=null) // 10,20,30 - 10.next = 20, 20.next=30, 30.next=null
        {
            sj.add(String.valueOf(temp.data));
            temp=temp.next;
        }

        sj.add(String.valueOf(temp.data));

        return sj.toString();


    }

    public int length(){
        int counter =0;

        if(head == null)
        {
            return counter;
        }
        else{
            Node temp = head;
            while(temp.next != null)
            {
                counter++;
                temp= temp.next;
            }
            /**
             * This increment has been done for two cases
             * First when our temp.next will be null then to count the last temp node
             * Second when only one node is present in linked list
             */
            counter++;
            return counter;
        }
    }


}
