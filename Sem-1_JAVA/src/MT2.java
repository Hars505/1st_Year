class new28 extends Thread
{
    new28(String name)
    {
        super(name);
    }
    public void run()
    {
        for(int i = 0;i<5;i++)
        {
            System.out.println("Child Thread "+i);
        }
    }
}
class N9 extends Thread
{
    public void run()
    {

        for(int i = 0; i<5;i++)
        {
            System.out.println("Main Thread "+i);
        }
    }
}
public class MT2
{
    public static void main(String[] args) throws InterruptedException {
        new28 T = new new28("Hello");
        N9 T1 = new N9();
        T.start();
        T.join();
        T1.start();
    }
}
