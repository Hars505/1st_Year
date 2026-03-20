import java.util.*;
public class HM
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> H = new HashMap<>();
        H.put(10,"Riya");
        H.put(11,"Rohan");
        H.put(12,"Rahul");
        System.out.println(H);
        System.out.println(H.get(10));
        System.out.println(H.get(40));
        System.out.println(H.remove(10));
        System.out.println(H.remove(50));
        System.out.println(H);
        System.out.println(H.containsKey(11));
        System.out.println(H.containsValue("Rohan"));
        System.out.println(H.size());
        System.out.println(H.isEmpty());
        H.clear();
        System.out.println(H);
    }
}
