class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
};
public class Linkedlist {
   
    private static Node createlistjava(Node head,int [] arr)
    {
        Node temp = head;
           for(int i = 1;i<arr.length;i++) 
           {
              Node newnode = new Node(arr[i]);
              temp .next = newnode;
              temp = newnode;
           }   
           return head;
   }
    public static void main (String[] args)
    {
        int[] arr = {1,2,3,4,5};

        Node head = new Node(arr[0]);    

        head = createlistjava(head,arr);


        Node temp = head;
        while(temp != null)
        {
        System.out.print(temp.data + "->");
        temp = temp.next;
        }

    }
}
