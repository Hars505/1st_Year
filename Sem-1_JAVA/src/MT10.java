class N10 extends Thread
{
    Thread M;
    public void set(Thread M)
    {
        this.M = M;
    }
    public void run()
    {
        try {
            M.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i =1;i<=5;i++)
        {
            System.out.println("Child Thread");
        }
    }
}
public class MT10
{
    public static void main(String[] args)
    {
        N10 N = new N10();
        Thread M = Thread.currentThread();
        N.set(M);
        N.start();
        for(int i = 0;i<=5;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
