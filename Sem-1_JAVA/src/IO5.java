import java.io.*;
import java.nio.Buffer;
import java.util.*;
public class IO5
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader BR = new BufferedReader( new FileReader("D5.txt"));
//        int i = BR.read();
//        while (i != (-1)) {
//            System.out.print((char) i);
//            i = BR.read();
//        }
//        char[] ch = new char[(int) new File("D5.txt").length()];
//        BR.read(ch);
//        for(char c : ch)
//        {
//            System.out.print(c);
//        }
        String s = BR.readLine();
        while (s!=null)
        {
            System.out.println(s);
            s= BR.readLine();
        }
    }
}
