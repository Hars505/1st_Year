import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class S6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<Object> L = new LinkedList<>();
        LinkedList<Object> M = new LinkedList<>();
        M.add(100);
        L.add(123);
        L.add("hello");
        L.add(2,true);
        L.add(10.2568);
        System.out.println(L.reversed());
        System.out.println(L);
        Stack<Object> S = new Stack<>();
        S.add(125);
        S.add("Hii");
        S.add(new StringBuffer("Hello"));
        S.add(sc.nextInt());
        System.out.println(S.reversed());
    }
}
