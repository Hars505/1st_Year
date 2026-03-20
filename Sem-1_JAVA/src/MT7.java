public class MT7
{
    public static void main(String[] args) {
        int n=4;
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        try {
                throw new NOT4EXCEPTION("In valid 4");
        } catch (NOT4EXCEPTION e) {
            System.out.println(e);;
        }
        System.out.println(5);
    }
}
class NOT4EXCEPTION extends RuntimeException
{
    NOT4EXCEPTION(String Message) {
        super(Message);
    }
}
