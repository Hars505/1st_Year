import java.util.*;
public class C4
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> AQ = new ArrayDeque<>();
        AQ.add(1);
        AQ.add(2);
        AQ.add(3);
        AQ.add(4);
        // to show some output adding some elements
        AQ.add(10);
        AQ.addLast(20);
        AQ.offer(30);
        AQ.offerLast(40);
        System.out.println("Last adding");
        System.out.println(AQ);
        AQ.addFirst(50);
        AQ.offerFirst(60);
        System.out.println("first adding");
        System.out.println(AQ);
        AQ.remove();
        AQ.removeFirst();
        AQ.poll();
        AQ.pollFirst();
        System.out.println("Remove element from first");
        System.out.println(AQ);
        AQ.removeLast();
        AQ.pollLast();
        System.out.println("Remove element from last");
        System.out.println(AQ);
        AQ.remove(20);
        System.out.println("Remove specific element");
        System.out.println(AQ);
        System.out.println("TO VIEW element on first postion");
        System.out.println(AQ.peek());
        System.out.println(AQ.getFirst());
        System.out.println(AQ.peekFirst());
        System.out.println("TO view element on last postion");
        System.out.println(AQ.peekLast());
        System.out.println(AQ.getLast());
        System.out.println("Other funtion");
        System.out.println(AQ.size());
        System.out.println(AQ.isEmpty());
        ArrayDeque<Integer> AQW = new ArrayDeque<>();
        AQW.poll();
    }
}
