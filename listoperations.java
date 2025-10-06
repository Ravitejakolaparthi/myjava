class Node{
    int data;
    Node next;
    Node(int val)
    {
        data = val;
        next = null;
    }
};
public class listoperations {

    private static Node createlist(Node head,int []a)
    {
        Node move = new Node(a[0]);
        head = move;

        Node temp = head;
        for(int i = 1;i<a.length;i++)
        {
            Node newnode = new Node(a[i]);
            temp.next = newnode;
            temp = newnode;
        }
        return head;
    }
    private static Node deleteathead(Node head)
    {
        head = head.next;
        return head;
    }
    private static Node deleteatend(Node head)
    {
        Node temp = head;

        while((temp.next).next != null)
        {
             temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    private static Node deleteatk(Node head,int k)
    {
        Node temp = head;
        if(k == head.data)
        {
            head = head.next;
        }
        else if(k != head.data)
        {
            while((temp.next).data != k && temp.next != null)
            {
                 temp = temp.next;
            }
            temp.next = (temp.next).next;
        }
        else
        {
            temp = null;
        }

        return head;
    }
    private static insertbeforex(Node head,int x,int val)
    {
          Node temp = head;
          Node newnode = new Node(x);
          
    }
       public static void main(String [] args)
    {
        int [] arr = {1,2,3,4,5};
         
       Node head = null;
       head = createlist(head,arr);
       Node temp = head;
       int x = 5;
       int val = 8;

       head = insertbeforex(head,x,val);  
        head = deleteathead(head); 
        head = deleteatend(head);
        int k = 1;
        head = deleteatk(head,k);
       temp = head;
       while(temp!= null)
       {
         System.out.print(temp.data + " -> ");
         temp  = temp.next;
       }
       System.out.print("NULL");
    }
    
}
