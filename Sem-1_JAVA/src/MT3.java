class new29 implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread");
    }
}
public class MT3
{
    public static void main(String[] args)
    {
        new29 T = new new29();
        Thread T1 = new Thread(T);
        T1.start();
        System.out.println("Main Thread");
    }
}
