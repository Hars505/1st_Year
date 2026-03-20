import java.util.ArrayList;
import java.util.Arrays;

public class S7
{
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);
        a.add(3,50);
        System.out.println(a);
        b.add("A");
        b.add("B");
        b.addAll(1,a);
        System.out.println(b.remove(4));
        System.out.println(b);
        a.set(0,"a");
        System.out.println(a);
        System.out.println(b.indexOf(30));
        b.add(30);
        System.out.println(b.lastIndexOf(30));
        System.out.println(b.lastIndexOf(25));
        ArrayList C = new ArrayList(a);
        ArrayList D = new ArrayList(Arrays.asList(10,20,30,40,50,"hello","hi",a));
        C.add(50);
        C.add(25);
        System.out.println(C);
        System.out.println(D);
    }
}