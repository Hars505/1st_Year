import java.util.*;
public class C1
{
    public static void main(String[] args)
    {
        HashSet<Integer> H = new HashSet<>();
        H.add(10);
        H.add(20);
        H.add(30);
        H.add(40);
        HashSet<Integer> H1 = new HashSet<>();
        H1.add(50);
        H1.add(10);
        System.out.println(H1);
        H1.addAll(H);
        System.out.println(H);
        System.out.println(H.size());
        H1.removeAll(H);
        System.out.println(H1);
        System.out.println(H);
        System.out.println(H.add(0));
        System.out.println(H1.isEmpty());
    }
}