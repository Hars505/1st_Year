import java.io.*;

public class IO4
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter BF = new BufferedWriter(new FileWriter("D5.txt"));
        BF.write(65);
        BF.newLine();
        char[] ch = {'B', 'C', 'D'};
        BF.write(ch);
        BF.flush();
        BF.close();
        File F = new File("D5.txt");
        FileReader fr = new FileReader(F);
        F.mkdir();
        char[] ch1 = new char[(int) F.length()];
        fr.read(ch1);
        for(char c : ch1)
        {
            System.out.print(c);
        }
    }
}
