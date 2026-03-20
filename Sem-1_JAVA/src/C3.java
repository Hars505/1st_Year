import java.util.HashSet;
import java.util.Scanner;

public class C3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many words you want to enter ?");
        int size = sc.nextInt();
        HashSet<String> hash = new HashSet<>();
        for(int i = 0 ; i<size;i++)
        {
            System.out.println("Entered words = "+(i+1));
            hash.add(sc.next());
        }
        System.out.println(hash);
        System.out.println("Enter prefix");
        String p = sc.next();
        boolean flag = false;
        for(String string : hash)
        {
            if(string.startsWith(p))
            {
                System.out.println(string);
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("There is not a single element that starts with "+p);
        }
    }
}
