class myThread extends Thread
{
    int total = 0;
    public void run()
    {
        synchronized (this)
        {
            System.out.println("Child thread Starts Working");
            for (int i = 0; i <= 100; i++) {
                total = total + i;
            }
            System.out.println("Child Thread will give notification to main thread");
            this.notify();
        }
    }
}
public class S2
{
    public static void main(String[] args) throws InterruptedException
    {
        myThread t = new myThread();
        t.start();
        synchronized (t)
        {
            t.wait();
            System.out.println("Main Thread will wait for Method");
        }
        System.out.println(t.total);
    }
}