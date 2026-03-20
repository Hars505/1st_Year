//how to name a thread using construtor
class new24 extends Thread
{
    new24(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("child Thread");
    }
    public void start()
    {
        super.start();
        System.out.println("Start");
    }
}
public class MT6
{
    public static void main(String[] args)
    {
        new24 T = new new24("HELLO");
        System.out.println(T.getName());
        T.start();
    }
}
