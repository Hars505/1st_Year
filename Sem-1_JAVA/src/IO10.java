import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class IO10
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        BufferedWriter BW = new BufferedWriter(new FileWriter("C:\\Users\\harsh\\IdeaProjects\\JA2025\\emp.txt"));
        String s = String.format("%-5s %-15s %-6s","ID","Name","Salary");
        BW.write(s);
        BW.newLine();
        BW.write("-------------------------------");
        BW.newLine();
        BW.flush();
        System.out.println("How many Employees you want to add");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n;i++)
        {
            System.out.println("Enter Employee "+i+" Details .");
            System.out.print("Enter id : ");
            String ID = sc.next();
            System.out.print("\nEnter Name : ");
            String Name = sc.next();
            System.out.print("\nEnter Salary : ");
            String Salary = sc.next();
            BW.write(String.format("%-5s %-15s %-6s",ID,Name,Salary));
            BW.newLine();
        }
        BW.flush();
    }
}
