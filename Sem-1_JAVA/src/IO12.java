// WAP To copy one image into other image
import java.io.*;

public class IO12
{
    public static void main(String[] args) throws IOException
   {
       File F = new File("C:\\Users\\harsh\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-05-08 133157.png");
       FileInputStream fis = new FileInputStream(F);
        FileOutputStream fos = new FileOutputStream(F);
         int i = fis.read();
         while (i!=-1)
         {
             fos.write(i);
             i= fis.read();
         }
         fos.flush();
}
}
