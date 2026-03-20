import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HM2
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> H2 = new HashMap<>();
        H2.put(10,"Riya");
        H2.put(11,"Rohan");
        H2.put(12,"Rahul");
        System.out.println(H2);
        Set S = H2.entrySet();
        for(Object O : S)
        {
            System.out.println(O);
        }
        System.out.println(S);
        Set S1 = H2.keySet();
        System.out.println(S1);
        Collection C = H2.values();
        System.out.println(C);
    }
}
