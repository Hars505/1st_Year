import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IO8
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        System.out.println("Enter any number");
        String S = BR.readLine();
        Integer i = Integer.parseInt(S);
        System.out.println(i);
    }
}