public class Restraunt
{
    boolean B = false;
    int data;
    synchronized void Produced(int n)
    {
        if(B)
        {
            try
            {
                wait();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        data=n;
        System.out.println("Produced = "+ data);
        B=true;
        this.notifyAll();
    }
    synchronized void Consumer()
    {
        if(!B)
        {
            try
            {
                wait();
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println("Consumed = "+data);
            B=false;
            notifyAll();
        }
    }
    public static void main(String[] args)
    {
        Restraunt Dosa = new Restraunt();
        Producer P1 = new Producer(Dosa);
        Consumer C1 = new Consumer(Dosa);
        C1.start();
        P1.start();
    }
}
class Producer extends Thread
{
    Restraunt Dosa;
    Producer(Restraunt Dosa)
    {
        this.Dosa=Dosa;
    }
    public void run()
    {
        for(int i = 1 ; i<=5;i++)
        {
            Dosa.Produced(i);
        }
    }
}
class Consumer extends Thread
{
    Restraunt Dosa;
    Consumer(Restraunt Dosa)
    {
        this.Dosa=Dosa;
    }
    public void run()
    {
        for(int i = 1 ; i<=5;i++)
        {
            Dosa.Consumer();
        }
    }
}