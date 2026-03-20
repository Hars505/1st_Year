import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PB279
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to add");
        int choice = sc.nextInt();
        for(int i = 0; i<choice;i++)
        {
            Q.add(sc.nextInt());
        }
        System.out.println("Top three Highest elements : ");
        for(int i = 0; i<3;i++)
        {
            System.out.println(Q.poll());
        }
    }
}
