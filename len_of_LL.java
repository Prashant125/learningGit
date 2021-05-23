package linked_list;
import java.util.*;

public class len_of_LL {

    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    void insert(int data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
            head.next=null;
            return;
        }

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;

        }
        temp.next = newnode;
        newnode.next = null;
    }   

    void show()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    int len(Node temp)
    {
        if(temp == null)
        return 0;
        else
        return len(temp.next) + 1 ;
        
    }

    int search(Node temp,int key)
    {
        if(temp == null)
        return 0;

        if(temp.data == key)
        return 1;

        else
        return search(temp.next,key);   
    }

    void reverse()
    {
        Node current,pre,temp;
        current = head;
        pre = null;

        while(current != null)
        {
            temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
        }
        head = pre;

    }
    public static void main(String[] args) {

        len_of_LL ll = new len_of_LL();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            int data  = sc.nextInt();
            ll.insert(data);
            t--;
        }
        ll.reverse();
        ll.show();
       // System.out.println(ll.search(ll.head,55));

    }
    
}
