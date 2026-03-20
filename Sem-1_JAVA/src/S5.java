import java.util.ArrayList;
import java.util.Iterator;
//Write a pogram to add 1 to 10 integer objects in to arrayList print that array list first and remove odd elementsby using
//cursor and print final arraylist which has only even elements
public class S5
{
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
        {
            A.add(i);
        }
        System.out.println(A);
        Iterator I = A.iterator();
        while (I.hasNext())
        {
            Integer i = (int)I.next();
            if (i%2 == 0)
            {
                System.out.print(i+" ");
                A.add(i);
            }
            else
            {
                I.remove();
            }
        }
    }
}
