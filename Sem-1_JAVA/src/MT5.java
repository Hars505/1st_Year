class new25 extends Thread
{
    public void run()
    {
        System.out.println("Child Thread");
        System.out.println(Thread.currentThread().getName());
    }
}
public class MT5
{
    public static void main(String[] args)
    {
        new25 T = new new25();
        System.out.println(Thread.currentThread().getName());
        System.out.println(T.getName());
        Thread.currentThread().setName("LJU");
        T.setName("LJIET");
        System.out.println(Thread.currentThread().getName());
        System.out.println(T.getName());
        T.start();
    }
}