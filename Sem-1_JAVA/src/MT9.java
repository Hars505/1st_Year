class MOrning implements Runnable
{
    public void  run()
    {
            for(int i = 0 ; i<10 ;i++)
            {
                System.out.println("GOOD AFTERNOON");
                try
                {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
    }
}
class Noon implements Runnable
{
    public void run()
    {
        for(int i = 0 ; i<10 ;i++)
        {
            System.out.println("GOOD MORNING");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
public class MT9
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread());
        MOrning Alphabet = new MOrning();
        Noon Number = new Noon();
        Thread Morning = new Thread(Alphabet);
        Thread NOON = new Thread(Number);
        Morning.start();
        NOON.start();
    }
}
