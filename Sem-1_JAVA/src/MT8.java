// Write a pogram to create two threads named alphabet and Number alphabet Thread will print A to Z and Number thread will print number 1 to 100 create one class only
class N1 extends  Thread
{
    public void  run()
    {
        if (Thread.currentThread().getName().equals("Alphabet")) {
            for (char i = 'A'; i <= 'Z'; i++)
            {
                try {
                    Thread.currentThread().sleep(0,1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print(i+" ");
            }
        }
        else
        {
            for(int i = 0 ; i<=100 ;i++)
            {
                System.out.print(i+",");
            }
            }
    }
}
public class MT8
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread());
        N1 Alphabet = new N1();
        N1 Number = new N1();
        Alphabet.setName("Alphabet");
        Number.setName("Number");
        Alphabet.setPriority(1);
        Number.setPriority(10);
        Alphabet.start();
        Number.start();
    }
}
