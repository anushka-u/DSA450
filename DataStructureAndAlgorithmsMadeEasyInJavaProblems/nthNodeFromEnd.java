public class nthNodeFromEnd {

    public static Node nNodeFromEnd(Node head,int n){
        int numberOfNode = count(head);
        for(int i=0;i<numberOfNode-n-1;i++)
        {
            head=head.next;
        }
        return head.next;
    }

    public static int count(Node head){
        int count=0;
        while (head!=null)
        {
            count+=1;
            head=head.next;
        }
        return count;
    }

    public static void display(Node head)
    {
        while (head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(14);
        head.next.next = new Node(22);
        head.next.next.next=new Node(41);
        head.next.next.next.next=new Node(11);

        display(head);
        int n=2;

        Node nNode = nNodeFromEnd(head,n);

        System.out.println(" Last "+ n + "nd Node in linked list is " +
                ""+nNode.data);
    }
}
