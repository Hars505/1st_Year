import java.util.*;

public class S8
{
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10,20,20,50,40,90,60,5));
        A.sort(Comparator.naturalOrder());
        System.out.println(A);
        A.sort(Comparator.reverseOrder());
        System.out.println(A);
        Stack<Integer> S = new Stack<>();
        Stack<Integer> S1 = new Stack<>();
        S.push(10);
        S.push(20);
        S.add(30);
        S.add(40);
        System.out.println(Collections.max(A));
        System.out.println(Collections.min(A));
        Collections.reverse(A);
        Collections.sort(A);
        System.out.println(Collections.frequency(A,20));
        System.out.println(A);
        System.out.println();
        Stack<Integer> D = new Stack<>();
        while (!S.isEmpty()) {
            S1.push(S.pop());
        }
        System.out.println(S1);
        Stack S200 = (Stack) S1.clone();
        System.out.println(S1.search(30));
     }
}
