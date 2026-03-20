import java.io.File;

//Write a pogram to count total files and folders avaliable in drive
public class IO2
{
    public static void main(String[] args)
    {
        File F = new File("C:\\");
        File[] F1 = F.listFiles();
        int count = 0;
        int count1 = 0;
        for(File s : F1)
        {
            if(s.isFile())
            {
                count++;
            }
            else
            {
                count1++;
            }
        }
        System.out.println("Total number of files and folders in D drive "+ count);
        System.out.println("Total number of files in D drive "+ count1);
    }
}
