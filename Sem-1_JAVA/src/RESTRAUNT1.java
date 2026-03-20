import  java.util.*;
public class RESTRAUNT1
{
    public static void main(String[] args)
    {
        ArrayDeque<String> Cook = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("press 1 then ask for the name of the item and it should be added in the cook queue.");
        System.out.println("press 2 then The first item from the queue should be removed from the queue.");
        System.out.println("press 3 then he can see the items of the queue.");
        System.out.println("press 4 then he should move out from the Restaurant.\n");
        System.out.println("Enter the value here");
            while (true)
            {
                int press = scanner.nextInt();
                switch(press)
                {
                    case 1 : // to add item
                        System.out.println("Add item");
                        Cook.add(scanner.next());
                        break;
                    case 2: //to remove an item
                        System.out.println("item removed");
                        Cook.remove();
                        break;
                    case 3: // print all items of queue
                        System.out.println(" All orders ");
                        for(String i : Cook)
                        {
                            System.out.println(i);
                        }
                        break;
                    case 4: // to exit
                        System.out.println("Thanks for using our services");
                        break;
                }
                System.out.println("Want to add , remove , or something else");
                scanner.next();
                String K = scanner.next();
                K=K.toLowerCase();
                if(K.equals("yes"))
                {
                    System.out.println("press 1 then ask for the name of the item and it should be added in the cook queue.");
                    System.out.println("press 2 then The first item from the queue should be removed from the queue.");
                    System.out.println("press 3 then he can see the items of the queue.");
                    System.out.println("press 4 then he should move out from the Restaurant.\n");
                    System.out.println("Enter the value here");
                }
                else
                {
                    break;
                }
            }
        }
}
