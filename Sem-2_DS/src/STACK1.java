public class STACK1
{
    int Top;
    int[] Stack;
    int Size;
    STACK1()
    {
        Top = -1;
        Size = 5; // Default size of the stack
        Stack = new int[Size];
    }
    public static void main(String[] args)
    {
        STACK1 st = new STACK1();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        st.pop();
    }
    public void push(int data)
    {
        if (Top == Size - 1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            Top++;
            Stack[Top] = data;
            System.out.println("Pushed: " + data);
        }
    }
    public int pop()
    {
        if (Top == -1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            int poppedValue = Stack[Top];
            Top--;
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        }
    }
    public int peek()
    {
        if (Top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return Stack[Top];
        }
    }
    boolean isEmpty()
    {
        return false;
    }
    public void display()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            int i = Top;
            System.out.print("Stack elements: [");
            for (i = Top; i > 0; i--)
            {
                System.out.print(Stack[i] + ",");
            }
            System.out.print(Stack[i]+"]");
            System.out.println();
        }
    }
    public void change(int data, int index)
    {
        if (index < 0 || index > Top)
        {
            System.out.println("Invalid index");
        }
        else
        {
            Stack[index] = data;
            System.out.println("Changed value at index " + index + " to " + data);
        }
    }
    public int search(int data)
    {
        for (int i = 0; i <= Top; i++)
        {
            if (Stack[i] == data)
            {
                System.out.println("Element " + data + " found at index " + i);
                return i;
            }
        }
        System.out.println("Element " + data + " not found in stack");
        return -1;
    }
}