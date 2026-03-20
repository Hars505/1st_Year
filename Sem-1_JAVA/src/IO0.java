import java.io.File;
import java.io.IOException;

public class IO0
{
    public static void main(String[] args) throws IOException
    {
        File F = new File("abc.txt");
        F.createNewFile();
        System.out.println(F.getPath());
        System.out.println(F.getAbsolutePath());
        if(F.isFile())
        {
            System.out.println(F);
        }
    }
}
