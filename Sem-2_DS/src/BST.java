import java.util.Scanner;

public class BST
{
    Scanner scanner = new Scanner(System.in);
    class Node
    {
        int data;
        Node Left,Right;
        Node(int data)
        {
            this.data = data;
            Left=null;
            Right=null;
        }
    }
    Node Root = null;
    public static void main(String[] args)
    {
        BST A = new BST();
        A.insert(50);
        A.insert(10);
        A.insert(20);
        A.insert(60);
        A.insert(70);
        A.max();
        A.min();
        A.display(A.Root.data);
    }
    void insert(int key)
    {
        Node N = new Node(key);
        if(Root==null)
        {
            Root=N;
            System.out.println("Data inserted");
        }
        else
        {
            Node temp = Root;
            while(true)
            {
                if(temp.Left == null && key<temp.data)
                {
                    temp.Left=N;
                    System.out.println("Data inserted");
                    return;
                }
                else if(temp.Right==null && key>temp.data)
                {
                    temp.Right=N;
                    System.out.println("Data inserted");
                    return;
                }
                else
                {
                    if(key<temp.data)
                    {
                        temp=temp.Left;
                    }
                    else
                    {
                        if(temp.data==key)
                        {
                            System.out.println("Key can't be same");
                            return;
                        }
                        temp=temp.Right;
                    }
                }
            }
        }
    }
    void delete(int key)
    {
        Node parent = null;
        Node current = Root;
        // For Searching If Key is Present or Not
        while (current!=null && current.data!=key)
        {
            parent=current;
            if(key< current.data)
            {
                current=current.Left;
            }
            else
            {
                current=current.Right;
            }
            if(current==null)
            {
                System.out.println("Data not found");
            }
        }
        // Case 1 :- Leaf Node Deletion
        assert current != null;
        if(current.Left==null && current.Right==null)
        {
            if(current == Root)
            {
                Root=null;
                current=null;
            }
            else if(parent.Left==current)
            {
                parent.Left=null;
                current=null;
            }
            else
            {
                parent.Right=null;
                current=null;
            }
        }
        // Case 2 :- Node has One child
        else if(current.Left==null || current.Right==null)
        {
            if(current.Left==null)
            {
                Node child = current.Right;
                if(current==Root)
                {
                    Root=current.Right;
                    current.Right=null;
                    current=null;
                }
                else if (parent.Left==current)
                {
                    parent.Left=child;
                    current.Right=null;
                    current=null;
                }
                else
                {
                    parent.Right=child;
                    current.Right=null;
                    current=null;
                }
            }
            else
            {
                Node child = current.Left;
                if(current==Root)
                {
                    Root=current.Left;
                    current.Left=null;
                    current=null;
                }
                else if (parent.Left==current)
                {
                    parent.Left=child;
                    current.Right=null;
                    current=null;
                }
                else
                {
                    parent.Right=child;
                    current.Right=null;
                    current=null;
                }
            }
        }
        // Case 3 :- Node has two children
        else
        {
            // Find in-order successor
            Node sucsParent = current;
            Node successor = current.Right;
            while (successor.Left!=null)
            {
                sucsParent = current;
                successor = current.Right;
                while (successor.Left!=null)
                {
                    sucsParent = successor;
                    successor= successor.Left;
                }
                current.data=successor.data;
            }
            if(sucsParent==successor)
            {
                sucsParent.Left=successor.Right;
                successor.Right=null;
                successor=null;
            }
            else
            {
                sucsParent.Right=successor.Right;
                successor.Right=null;
                successor=null;
            }
        }
    }
    void inorder(Node Root)
    {
        if(Root==null)
        {
            return;
        }
        else
        {
            inorder(Root.Left);
            System.out.print(Root.data+"-->");
            inorder(Root.Right);
        }
    }
    void max()
    {
        if(Root==null)
        {
            System.out.println("Tree is Empty");
            return;
        }
        Node temp = Root;
        while(temp.Right!=null)
        {
            temp=temp.Right;
        }
        System.out.println("Max Element is: "+temp.data);
    }
    void min()
    {
        if(Root==null)
        {
            System.out.println("Tree is Empty");
            return;
        }
        Node temp = Root;
        while(temp.Left!=null)
        {
            temp=temp.Left;
        }
        System.out.println("Min Element is: "+temp.data);
    }
    void search(int key)
    {
        Node temp = Root;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                System.out.println("Key Found");
                return;
            }
            else if(key<temp.data)
            {
                temp=temp.Left;
            }
            else
            {
                temp=temp.Right;
            }
        }
        System.out.println("Key Not Found");
    }
    int height(Node node)
    {
        if (node == null) return 0;
        return 1 + Math.max(height(node.Left), height(node.Right));
    }
    void postOrder(Node Root)
    {
        if(Root==null)
        {
            return;
        }
        else
        {
            postOrder(Root.Left);
            postOrder(Root.Right);
            System.out.print(Root.data+"-->");
        }
    }
    void preOrder(Node Root)
    {
        if(Root==null)
        {
            return;
        }
        else
        {
            System.out.print(Root.data+"-->");
            preOrder(Root.Left);
            preOrder(Root.Right);
        }
    }
    void display(int Root)
    {
        if(this.Root==null)
        {
            System.out.println("Tree is Empty");
            return;
        }
        else
        {
            System.out.println("Enter 1 : for Inorder Traversal");
            System.out.println("Enter 2 : for Preorder Traversal");
            System.out.println("Enter 3 : for Postorder Traversal");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Inorder Traversal");
                    System.out.print("[");
                    inorder(this.Root);
                    System.out.println("null]     \nNOTE - null indicates end of tree");
                    break;
                case 2:
                    System.out.println("Preorder Traversal");
                    System.out.print("[");
                    preOrder(this.Root);
                    System.out.println("null]     \nNOTE - null indicates end of tree");
                    break;
                case 3:
                    System.out.println("Postorder Traversal");
                    System.out.print("[");
                    postOrder(this.Root);
                    System.out.println("null]     \nNOTE - null indicates end of tree");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}