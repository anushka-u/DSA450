public class CustomLinkedList2 {

    Node head;
    public static void main(String[] args) {

    }

    public class Node{
        Object data;
        Node next;

        Node(Object obj)
        {
            this.data = obj;
        }
    }


    public void remove(Object obj)
    {
        Node n =  new Node(obj);

        Integer objToBeRemoved = (Integer) obj;

        if(head != null) {
            Node temp = head;
            Integer i = (Integer) temp.data;
            Node previous = null;

            if (i == objToBeRemoved) {
                temp = head.next;
                head.next = null;
                head = temp;

            } else {
                while (temp.next != null) {
                    if (i == objToBeRemoved) {
                        previous.next = temp.next;
                        temp.next = null;
                        temp = null;
                        return;
                    } else {
                        previous = temp;
                        temp = temp.next;
                    }
                }
            }
            if(i==objToBeRemoved)
            {
                previous.next=null;
                temp=null;
            }
        }
    }
}
