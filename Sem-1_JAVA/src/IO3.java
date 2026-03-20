import java.io.*;

public class IO3
{
    public static void main(String[] args) throws IOException
    {
        /*File F1 = new File("LJU.txt");
        F1.createNewFile();
        FileWriter F = new FileWriter(F1,true);
        F.write("\nHello Hi\n");
        F.write(65);
        char[] ch = {'B','C','D'};
        F.write(ch);
        F.flush();
        F.close();*/
        File F = new File("LJU.txt");
        FileReader fr = new FileReader(F);
        char[] ch = new char[(int) fr.read()];
        for(char c : ch)
        {
            System.out.print(c);
        }
//        int i = fr.read();
//        while (i!=-1)
//        {
//            System.out.print((char) FR.read());
//            i=FR.read();
//        }
    }
}
