import java.util.ArrayList;
public class S3
{
    public static void main(String[] args)
    {
        ArrayList<Object> A = new ArrayList<>();
        A.add(10);
        A.add("Hi");
        A.add(true);
        A.add(10.25);
        ArrayList<Object> B = new ArrayList<>();
        B.add(10);
        B.add(20);
        System.out.println(A.remove("Hi"));
        System.out.println(B.addAll(2,A));
        B.removeAll(A);
        System.out.println(B.removeAll(A));
        System.out.println(A.contains("Hi"));
        A.clear();
        System.out.println(A.isEmpty());
        System.out.println(B);
        System.out.println(B.size());
        System.out.println(A.containsAll(B));
    }
}
