import java.util.*;

public class PB287
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of contacts you want to Add");
        int n = sc.nextInt();
        System.out.println("Enter the details of contact");
        HashMap<String,Long> contact = new HashMap<>();
        for(int i = 0 ; i<n;i++) {
            System.out.println("Enter mobile number");
            long Number;
            while (true) {
                Number = sc.nextLong();
                if (Number >= 1000000000L && Number <= 9999999999L) {
                    break;
                }
                System.out.println("Invalid number Enter again");
            }
            System.out.println("Befor entering Name --- WARNING : Names should not be same");
            System.out.println("Enter name :");
            contact.put(sc.next(), Number);
        }
        System.out.println("Your list : ");
        System.out.println(contact);
        System.out.print("Enter the name Whose number you want to search : ");
        String name = sc.next();
        if(contact.containsKey(name))
        {
            System.out.println(contact.get(name));
        }
        else
        {
            System.out.println("Phone number not found");
        }
        Set x = contact.entrySet();
        Iterator itr = x.iterator();
        while (itr.hasNext())
        {

            Map.Entry m = (Map.Entry)itr.next();
            if(m.getValue().equals("harshil"))
            {
                m.setValue(7487868007L);
            }
            System.out.println(m.getKey()+" = "+m.getValue());
        }
        for(Map.Entry i : contact.entrySet())
        {
            System.out.println(i.getValue()+" = "+i.getKey());
        }
    }
}
