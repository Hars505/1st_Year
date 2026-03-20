//import java.util.Scanner;
public class SLL
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node First = null;
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        boolean Want = true;
        SLL Obj = new SLL();
//        System.out.println("Want to Enter value");
//        String S2 = sc.nextLine();
//        S2=S2.toLowerCase();
//        if(S2.equals("yes"))
//        {
//            while(Want)
//            {
//                System.out.println("""
//                        Type yes if you want to Enter elements or else type Anything for 'No'
//                        Enter the yes or Anything else""");
//                String S;
//                if(count == 1)
//                {
//                    sc.nextLine();
//                }
//                S = sc.nextLine();
//                S=S.toLowerCase();
//                if(S.equals("yes"))
//                {
//                    System.out.println("""
//                            Type yes for Insertion value from First or type Anything else to Insert value at last
//                            Enter yes or anything else""");
//                    String S1 = sc.nextLine();
//                    S1=S1.toLowerCase();
//                    if(S1.equals("yes"))
//                    {
//                        System.out.println("Enter Elements");
//                            Obj.addAtFirst(sc.nextInt());
//                    }
//                    else
//                    {
//                        System.out.println("Enter Elements");
//                        Obj.addAtLast(sc.nextInt());
//                    }
//                }
//                else
//                {
//                    Want=false;
//                }
//                count=1;
//            }
//        }
//        Obj.insertBeforeValue(2,4);
//        Obj.insertAfterValue(3,6);
        Obj.addAtFirst(10);
        Obj.addAtFirst(20);
        Obj.addAtFirst(30);
        Obj.addAtLast(5);
        Obj.addAtLast(1);
        Obj.deleteAtFirst();
        Obj.deleteAtLast();
        Obj.Display();
        Obj.insertAfterValue(12,10);
        Obj.insertBeforeValue(18,10);
        Obj.Display();
        Obj.deleteSpecificElement(18);
        Obj.Display();
    }
    void addAtFirst(int data)
    {
        Node n = new Node(data);
        if(First==null)
        {
            First=n;
        }
        else
        {
            n.next = First;
        }
        First=n;
    }
    void addAtLast(int data)
    {
        Node n = new Node(data);
        if (First == null)
        {
            First = n;
        }
        else
        {
            Node temp = First;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    void insertBeforeValue(int data, int value)
    {
        Node temp = First;
        if (First == null)
        {
            System.out.println("Link List is Empty");
            return;
        }
        if (First.data == value)
        {
            Node n = new Node(data);
            n.next=First;
            First = n;
            return;
        }
        Node Dummy = null;
        while (temp != null && temp.data != value)
        {
            Dummy = temp;
            temp = temp.next;
        }
        if (temp == null)
        {
            System.out.println("There is no such value in Link List");
        }
        else
        {
            Node n = new Node(data);
            Dummy.next = n;
            n.next = temp;
        }
    }
    void insertAfterValue(int data, int value)
    {
        Node temp = First;
        while (temp != null && temp.data != value)
        {
            temp = temp.next;
        }
        if (temp == null)
        {
            System.out.println("There is no such value in Link List");
        }
        else
        {
            Node n = new Node(data);
            n.next = temp.next;
            temp.next = n;
        }
    }
    void Display()
    {
        if(First==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node Temp = First;
            System.out.print("[");
            while(Temp!=null)
            {
                if(Temp.next==null)
                {
                    System.out.print(Temp.data);
                }
                else
                {
                    System.out.print(Temp.data + " - ");
                }
                Temp=Temp.next;
            }
            System.out.println("]");
        }
    }
    void deleteAtFirst()
    {
        if(First==null)
        {
            System.out.println("Link list is Empty");
        }
        else
        {
            Node Temp = First;
            First= First.next;
            Temp.next=null;
            Temp=null;
        }
    }
    void deleteAtLast()
    {
        if(First==null)
        {
            System.out.println("Link List is Empty");
        }
        else
        {
            Node Temp = First;
            if(First.next==null)
            {
                First=null;
                return;
            }
            while (Temp.next.next!=null)
            {
                Temp=Temp.next;
            }
            Temp.next=null;
            Temp=null;
        }
    }
    void deleteSpecificElement(int data)
    {
        if (First == null)
        {
            System.out.println("Link List is Empty");
            return;
        }
        if (First.data == data)
        {
            Node temp = First;
            First = First.next;
            temp.next = null;
            return;
        }
        Node temp = First;
        Node Dummy = First.next;
        while (Dummy != null && Dummy.data != data)
        {
            temp = Dummy;
            Dummy = Dummy.next;
        }
        if (Dummy == null)
        {
            System.out.println("There is no such element in Link List");
        }
        else
        {
            temp.next = Dummy.next;
            Dummy.next = null;
        }
    }
}