package linked_list;
import java.util.*;

class Linked_list{

    Node head;
    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    void appendlast(int data)
    {
        Node newnode = new Node(data);
       Node temp= head;

        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = null;
    }

    

    void insert(int data)
    {
        Node newnode = new Node(data);

        if(head == null)
        {
            head = newnode;
            head.next =null;
            return;
        }

        Node temp;
        temp = head;

    while(temp.next != null)
    {
        temp = temp.next;
    }
        temp.next = newnode;
        newnode.next = null;
    }

    void display()
    {
        Node temp;
        temp = head;
        while(temp != null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    void middle(int pos,int data)
    {
        Node newnode = new Node(data);
        Node temp,temp1;
        temp= head;
        

        while(pos != temp.data)
        {
            temp= temp.next;
        }
        
        newnode.data = data;
        newnode.next=temp.next;

        temp.next = newnode;
    }

    void top(int data)
    {
        Node newnode = new Node(data);
        //Node temp = head;
        newnode.next = head;
        head = newnode;
        
    }

    void del(int pos)
    {
        Node temp = head;
        Node pre = null;
        while(pos != temp.data)
        {
            pre = temp;
            temp = temp.next;
        }
        pre.next=temp.next;
    }
    public static void main(String[] args)
    {
        try{
        Linked_list ll = new Linked_list();
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t != 0)
        {
            int data = sc.nextInt();
            ll.insert(data);
            t--;
        }

        ll.display();
        ll.appendlast(56);
        System.out.println();
        ll.top(77);
        ll.middle(3,99);
        ll.del(99);
        ll.display();

    }catch(Exception e){}
    }   







}