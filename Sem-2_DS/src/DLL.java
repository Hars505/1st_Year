public class DLL
{
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public static void main(String[] args)
    {
        DLL D = new DLL();
        D.addFirst(30);
        D.addFirst(20);
        D.addFirst(10);
        D.addLast(40);
        D.addLast(50);
        D.addLast(60);
        D.display();
        D.removeFirst();
        D.removeFirst();
        D.removeLast();
        D.removeLast();
        D.display();
        D.insertBeforeValue(35, 40);
        D.display();
        D.insertAfterValue(45, 40);
        D.display();
        D.insertAfterValue(33, 30);
        D.display();
        D.deleteSF(30);
        D.display();
        System.out.println(D.indexOf(45));
        D.valueOf(3);
    }
    Node First = null;
    void addFirst(int data)
    {
        Node x = new Node(data);
        if (First != null)
        {
            First.prev = x;
            x.next = First;
        }
        First = x;
    }
    void addLast(int data)
    {
        Node x = new Node(data);
        if (First == null)
        {
            First = x;
        }
        else
        {
            Node temp = First;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = x;
            x.prev = temp;
        }
    }
    void display()
    {
        if (First == null)
        {
            System.out.println("Link list is Empty");
        }
        else
        {
            System.out.print("[");
            Node temp = First;
            while (temp.next != null)
            {
                System.out.print(temp.data + ",");
                temp = temp.next;
            }
            System.out.print(temp.data + "]\n");
        }
    }
    void removeFirst()
    {
        if (First == null)
        {
            System.out.println("UnderFlow Exception");
        }
        else
        {
            if (First.next == null)
            {
                First = null;
            } else
            {
                Node temp = First;
                First = First.next;
                temp.next = null;
            }
        }
    }
    void removeLast()
    {
        if (First == null)
        {
            System.out.println("UnderFlow Exception");
        }
        else
        {
            if (First.next == null)
            {
                First = null;
            }
            else
            {
                Node n = First;
                while (n.next != null)
                {
                    n = n.next;
                }
                n.prev.next = null;
                n.prev = null;
            }
        }
    }
    void insertBeforeValue(int data, int target)
    {
        if (First == null)
        {
            System.out.println("At least need one element to use This method");

        }
        else
        {
            if (First.data == target)
            {
                Node n = new Node(data);
                //addFirst(data);
                First.prev = n;
                n.next = First;
                First = n;
                return;
            }
            Node current = First.next;
            Node n = new Node(data);
            while (current != null)
            {
                if (current.data == target)
                {
                    n.next = current;
                    n.prev = current.prev;
                    n.prev.next = n;
                    current.prev = n;
                    return;
                }
                current = current.next;
            }
            System.out.println("There is no such element in list");
        }
    }
    void insertAfterValue(int data, int target)
    {
        if (First == null)
        {
            System.out.println("At least need one element to use This method");

        }
        else
        {
            if (First.data == target)
            {
                Node n = new Node(data);
                if (First.next == null)
                {
                    First.next = n;
                    n.prev = First;
                    return;
                }
                if (First.data == target && First.next != null)
                {
                    n.prev = First;
                    n.next = First.next;
                    n.next.prev = n;
                    First.next = n;
                    return;
                }
            }
            Node current = First.next;
            Node n = new Node(data);
            while (current != null)
            {
                if (current.data == target)
                {
                    if (current.next == null)
                    {
                        current.next = n;
                        n.prev = current;
                        return;
                    } else
                    {
                        n.prev = current;
                        n.next = current.next;
                        n.next.prev = n;
                        current.next = n;
                    }
                    return;
                }
                current = current.next;
            }
            System.out.println("There is no such element in list");
        }
    }
    int indexOf(int value)
    {
        Node temp = First;
        int count = 1;
        while (temp.next != null)
        {
            if (temp.data == value)
            {
                System.out.print("The Element " + value + " is at Index ");
                return count;
            }
            count++;
            temp = temp.next;
        }
        if (temp.data == value)
        {
            System.out.print("The Element " + value + " is at Index ");
            return count;
        }
        System.out.print("There is no such element : ");
        return 0;//if there is no such element then it will return 0
    }
    void valueOf(int value)
    {
        Node temp = First;
        int count = 1;
        while (temp.next != null)
        {
            if (count == value)
            {
                System.out.println("The Element on " + value + " Index is " + temp.data);
                return;
            }
            count++;
            temp = temp.next;
        }
        if (count == value)
        {
            System.out.println("The Element on " + value + " Index is " + temp.data);
            return;
        }
        System.out.println("Index out of bound");
    }
    void deleteSF(int data)
    {
        if (First == null)
        {
            System.out.println("At least need one element to use This method");
        }
        else
        {
            if (First.data == data)
            {
                Node n = new Node(data);
                if (First.next == null)
                {
                    First = null;
                    return;
                }
                if (First.data == data && First.next != null)
                {
                    Node temp = First;
                    First=First.next;
                    temp.next=null;
                    First.prev=null;
                    temp=null;
                    return;
                }
            }
            else
            {
                Node temp = First.next;
                while(temp.data!=data)
                {
                    if (temp.next!=null)
                    {
                        temp = temp.next;
                    }
                    else
                    {
                        break;
                    }
                }
                if(temp.data==data)
                {
                    if(temp.next!=null)
                    {
                        temp.next.prev=temp.prev;
                        temp.prev.next=temp.next;
                        temp.next=null;
                    }
                    else
                    {
                        temp.prev.next=null;
                    }
                    temp.prev=null;
                    temp=null;
                    return;
                }
                System.out.println("There is no such Element in Link list");
            }
        }
    }
}