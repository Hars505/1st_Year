public class CSLL
{
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data= data;
            next=null;
        }
    }
    Node First = null;
    public static void main(String[] args)
    {
        CSLL C = new CSLL();
        C.addFirst(10);
        C.addFirst(5);
        C.addLast(20);
        C.addLast(30);
        C.addLast(40);
        C.addLast(50);
        C.insertBeforeValue(25,30);
        C.insertBeforeValue(45,50);
        C.Display();
        C.deleteFirst();
        C.deleteLast();
        C.insertAfterValue(42,40);
        C.Display();
    }
    void addFirst(int data)
    {
        Node n = new Node(data);
        if(First==null)
        {
            First=n;
            n.next=First;
        }
        else
        {
            n.next=First;
            Node temp = First;
            while(temp.next!=First)
            {
                temp=temp.next;
            }
            temp.next=n;
            First=n;
        }
    }
    void addLast(int data)
    {
        Node n = new Node(data);
        if (First==null)
        {
            First = n;
            n.next = First;
        }
        else
        {
            Node temp = First;
            while (temp.next != First)
            {
                temp = temp.next;
            }
            temp.next = n;
            n.next=First;
        }
    }
    void Display()
    {
        if(First==null)
        {
            System.out.println("Link list is Empty");
        }
        else
        {
            Node temp = First;
            while (temp.next!=First)
            {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
    void deleteFirst()
    {
        if(First==null)
        {
            System.out.println("Link list is Empty");
        }
        else if(First.next==First)
        {
            First=null;
        }
        else
        {
            Node temp = First;
            Node del = First;
            while (temp.next!=First)
            {
                temp=temp.next;
            }
            First=First.next;
            temp.next=First;
            del.next=null;
            del=null;
        }
    }
    void deleteLast()
    {
        if(First==null)
        {
            System.out.println("Link list is Empty");
        }
        else if(First.next==First)
        {
            First=null;
        }
        else
        {
            Node temp = First;
            while (temp.next.next!=First)
            {
                temp=temp.next;
            }
            Node del = temp.next;
            temp.next=del.next;
            del.next=null;
            del=null;
        }
    }
    void insertBeforeValue(int data,int value)
    {
        int flag = 0;
        if(First==null)
        {
            System.out.println("Link list is Empty at least need one element");
        }
        else
        {
            Node temp = First;
            while(temp.next!=First)
            {
                if(temp.data==value)
                {
                    flag=1;
                    break;
                }
                temp=temp.next;
            }
            if(temp.data==value)
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            Node n = new Node(data);
            if(First.next==First && First.data==value)
            {
                n.next=First;
                First.next=n;
                First=n;
            }
            else if(First.next!=First && First.data==value)
            {
                n.next=First;
                Node temp = First;
                while(temp.next!=First)
                {
                    temp=temp.next;
                }
                temp.next=n;
                First=n;
            }
            else
            {
                Node dummy = First;
                while(dummy.next.data!=value)
                {
                    dummy=dummy.next;
                }
                n.next=dummy.next;
                dummy.next=n;
            }
        }
        else
        {
            System.out.println("There is no such element in the Link List");
        }
    }
    void insertAfterValue(int data,int value)
    {
        int flag = 0;
        if(First==null)
        {
            System.out.println("Link list is Empty at least need one element");
        }
        else
        {
            Node temp = First;
            while(temp.next!=First)
            {
                if(temp.data==value)
                {
                    flag=1;
                    break;
                }
                temp=temp.next;
            }
            if(temp.data==value)
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            Node n = new Node(data);
            if (First.next == First && First.data == value)
            {
                n.next = First;
                First.next = n;
            }
            else
            {
                Node dummy = First;
                while (dummy.data != value)
                {
                    dummy=dummy.next;
                }
                    n.next=dummy.next;
                    dummy.next=n;
            }
        }
        else
        {
            System.out.println("There is no such element in the Link List");
        }
    }
    void deletespecificElement(int value)
    {
        int flag = 0;
        if(First==null)
        {
            System.out.println("Link list is Empty at least need one element");
        }
        else
        {
            Node temp = First;
            while(temp.next!=First)
            {
                if(temp.data==value)
                {
                    Node N = First;
                    if(temp==First && First.next==First)
                    {
                        temp=null;
                        First=null;
                        N=null;
                        break;
                    }
                    else if (temp==First && First.next!=First)
                    {
                        Node del = First;
                        while (N.next!=First)
                        {
                            N=N.next;
                        }
                        First=First.next;
                        N.next=First;
                        del.next=null;
                        del=null;
                    }
                    else if(temp.next==First)
                    {
                        while (N.next.next!=First)
                        {
                            N=N.next;
                        }
                        Node del = N.next;
                        N.next=del.next;
                        del.next=null;
                        del=null;
                    }
                    else
                    {

                    }
                }
                temp=temp.next;
            }
            System.out.println("There is no such element in the Link list");
        }
    }
}
