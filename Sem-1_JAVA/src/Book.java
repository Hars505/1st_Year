import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Book
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<String , library> Library = new HashMap<>();
        boolean b = true;
        while (b)
        {
            System.out.println("Enter 1 : To add Book");
            System.out.println("Enter 2 : To remove Book");
            System.out.println("Enter 3 : To Search Book");
            System.out.println("Enter 4 : To See all Books details");
            System.out.println("Enter 1 : Exit\n");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter book title");
                    String title = sc.next();
                    System.out.println("Enter author of book");
                    String author = sc.next();
                    System.out.println("Enter publisher of book");
                    sc.nextLine();
                    String publisher = sc.next();
                    System.out.println("Enter year of published");
                    int year = sc.nextInt();
                    Library.put(title,new library(author,publisher,year));
                    System.out.println("Book is successfully added");
                    break;
                case 2:
                    System.out.println("Enter name of book you want to remove ");
                    String RBook = sc.next();
                    if(Library.containsKey(RBook))
                    {
                        Library.remove(RBook);
                        System.out.println("Book has removed successfully");
                    }
                    else
                    {
                        System.out.println("Book is not in Library");
                    }
                    break;
                case 3 :
                    System.out.println("Enter name of book you want to search");
                    String SBook = sc.next();
                    if(Library.containsKey(SBook))
                    {
                        System.out.println(Library.get(SBook));
                    }
                    else
                    {
                        System.out.println("Book is not in Library");
                    }
                    break;
                case 4 :
                    System.out.println("List of all books in Libraray are as follow : ");
                    for(Map.Entry i : Library.entrySet())
                    {
                        System.out.println(i.getKey() +" = "+i.getValue());
                    }
                    break;
                case 5 :
                    System.out.println("Exiting...");
                    b=false;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
class library
{
    String author;
    String publisher;
    int year;
    public library(String author ,String publisher ,int year)
    {
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }
    public String toString() {
        return "library{" +
                "author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                '}';
    }
}