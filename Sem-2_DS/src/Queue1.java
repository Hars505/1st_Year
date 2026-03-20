public class Queue1
{
    int front;
    int rear;
    int[] Queue;
    int size;
    Queue1(int size)
    {
        rear=-1;
        front=-1;
        Queue = new int[size];
    }
    public static void main(String[] args) {
        Queue1 Q = new Queue1();
        Q.enqueue(10);
    }
    public void enqueue(int data)
    {
        if((rear+1)%size==-1)
        {
            System.out.println("Queue Overflow");
            return;
        }
        else
        {
            front++;
            Queue[front] = data;
        }
    }
    public void dequeue()
    {
        
    }
}
