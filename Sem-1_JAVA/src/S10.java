import java.util.*;
// Remove duplicate elements
public class S10
{
    public static void main(String[] args)
    {
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 6, 9, 1, 1, 10));
        A1.sort(Comparator.naturalOrder());
        System.out.println(A1);
        for(int i = 0 ; i<A1.size();i++)
        {
            ArrayList<Integer> A2 = new ArrayList<>();
            int F = Collections.frequency(A1,A1.get(i));
            if(F>1)
            {
                A2.add(A1.get(i));
                A1.removeAll(A2);
            }
        }
        System.out.println(A1);
    }
}
