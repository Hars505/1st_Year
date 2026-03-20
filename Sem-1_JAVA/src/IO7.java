import java.io.*;
import java.util.Scanner;

public class IO7
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter BR = new BufferedWriter(new FileWriter("C"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to add");
        int Total = sc.nextInt();
        for(int i = 0 ; i<Total;i++)
        {
            System.out.println("Enter number "+ (i+1));
            BR.write(sc.next());
            BR.newLine();
        }
        BR.flush();
        BufferedReader BW = new BufferedReader(new FileReader("C:\\Users\\harsh\\IdeaProjects\\ED2025\\Number.txt"));
        BufferedWriter odd = new BufferedWriter(new FileWriter("C:\\Users\\harsh\\IdeaProjects\\ED2025\\odd.txt"));
        BufferedWriter even = new BufferedWriter(new FileWriter("C:\\Users\\harsh\\IdeaProjects\\ED2025\\even.txt"));
        String S1 = BW.readLine();
        while(S1!=null)
        {
            int S2 = Integer.parseInt(S1);
            if (S2 % 2 == 0)
            {
                even.write(Integer.toString(S2));
                even.newLine();
            }
            else
            {
                odd.write(Integer.toString(S2));
                odd.newLine();
            }
            S1 = BW.readLine();
        }
        even.flush();
        odd.flush();
    }
}
