import java.io.*;
import java.util.Scanner;

public class IO6
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source File name");
        String source = sc.next();
        System.out.println("Enter Destination File Name");
        String destination = sc.next();
        BufferedReader FR = new BufferedReader(new FileReader(source));
        BufferedWriter BR = new BufferedWriter(new FileWriter(destination));
        String s = FR.readLine();
        while (s!=null)
        {
            BR.write(s);
            BR.newLine();
            s= FR.readLine();
        }
        BR.flush();
        System.out.println("Source File is Successfully copied To destination File");
        BR.close();
    }
}
