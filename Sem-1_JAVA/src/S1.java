class patym extends Thread
{
    bookTicket M1;
    int seats;
    patym(bookTicket M1,int seats)
    {
        this.M1=M1;
        this.seats=seats;
    }
}
class bookMyShow extends Thread
{
    bookTicket M1;
    int seats;
    bookMyShow(bookTicket M1,int seats)
    {
        this.M1=M1;
        this.seats=seats;
    }
    public void run()
    {

    }
}
class bookTicket
{
    int Totalseats = 10;
    public void run()
    {

    }
}
public class S1
{
    public static void main(String[] args) throws Exception
    {
        bookTicket M = new bookTicket();
        bookMyShow B = new bookMyShow(M,7);
        patym P = new patym(M,6);
        B.setName("Harshil");
        P.setName("Parth");
        P.start();
        B.start();
        try {
            P.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
