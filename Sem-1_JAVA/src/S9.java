import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class S9
{
    public static void main(String[] args)
    {
        LinkedList<Object> L = new LinkedList<>(Arrays.asList(1,2,3,4,"hello","HI"));
        L.add(100);
        L.remove();
        System.out.println(L);
        L.remove();
        Vector<Object> V = new Vector<>();
        for(int i = 1 ; i<=15;i++)
        {
            V.add(i);
        }
        System.out.println(V.capacity());
        Vector<Object> V2 =(Vector<Object>) V.clone();
        System.out.println(V2);
    }
}
