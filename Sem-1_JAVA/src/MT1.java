class MyThread1 extends Thread
{
    public void run()
    {
        System.out.println("Child Thread");
    }
}
public class MT1
{
    public static void main(String[] args)
    {
        MyThread1 T = new MyThread1();
        T.start();
        System.out.println("Main Thread");
    }
}
