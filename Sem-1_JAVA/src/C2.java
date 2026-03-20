import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class C2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of values you want to Enter");
        int size = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int index = 1; index<=size;index++)
        {

            System.out.println("Entered "+index+" value");
            arrayList.add(scanner.nextInt());
        }
        System.out.println("Entered Elements "+arrayList);
        HashSet<Integer> hashset = new HashSet<>(arrayList);
        System.out.println("Unique Element set "+hashset);
        int sum = 0;
        for(Integer i : hashset)
        {
            sum=sum+i;
        }
        Iterator<Integer> ITerator = hashset.iterator();
        int Sum = 0;
        while(ITerator.hasNext())
        {
            int i = ITerator.next();
            Sum = Sum+i;
        }
        System.out.println(Sum);
        System.out.println(sum);
    }
}
