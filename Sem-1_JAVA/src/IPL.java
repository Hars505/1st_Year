class Bowler extends Thread
{
    Bowler(String name)
    {
        super(name);
    }
    public void run()
    {
        if(Thread.currentThread().getName().equals("Yorker"))
        {
            System.out.println("Six");
        }
        else
        {
            System.out.println("Wicket");
        }
    }
}
public class IPL
{
    public static void main(String[] args)
    {
        Bowler T1 = new Bowler("Yorker");
        Bowler T2 = new Bowler("Googly");
        T1.start();
        try {
            T1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        T2.start();
    }
}
