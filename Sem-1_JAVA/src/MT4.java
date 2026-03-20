class new23 implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread");
        System.out.println(Thread.currentThread().getName());
    }
}
public class MT4
{
    public static void main(String[] args)
    {
        new23 T = new new23();
        Thread T1 = new Thread(T,"LJIET");
        System.out.println(T1.getName());
        T1.start();
    }
}