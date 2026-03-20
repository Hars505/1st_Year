import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class IO9
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter BR = new BufferedWriter(new FileWriter("C:\\Users\\harsh\\IdeaProjects\\JA2025\\Number.txt"));
        BR.write("1 2 3 Hello");
        BR.newLine();
        BR.write("8 9");
        BR.newLine();
        BR.write("5 6 Hii");
        BR.newLine();
        BR.write("4 10 LJ");
        BR.flush();
        BufferedReader BW = new BufferedReader(new FileReader("C:\\Users\\harsh\\IdeaProjects\\JA2025\\Number.txt"));
        BufferedWriter BR1 = new BufferedWriter(new FileWriter("C:\\Users\\harsh\\IdeaProjects\\JA2025\\Sort.txt"));
        ArrayList<Integer> AL = new ArrayList<>();
        String Line = BW.readLine();
        while(Line!=null)
        {
            String[] word = Line.split("\\s+");
            for(String Word : word)
            {
                try
                {
                    Integer I = Integer.parseInt(Word);
                    AL.add(I);
                }
                catch (NumberFormatException E)
                {
                    // NOthing to DO
                }
            }
            Line=BW.readLine();
        }
        System.out.println("Before sorting : "+AL);
        Collections.sort(AL);
        System.out.println("After sorting : "+AL);
        for(Integer i : AL)
        {
            BR1.write(i.toString());
            BR1.newLine();
        }
        BR1.flush();
        BR1.close();
        BW.close();
    }
}