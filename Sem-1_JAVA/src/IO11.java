import java.io.*;

public class IO11
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\harsh\\IdeaProjects\\JA2025\\ABC.txt");
        fos.write(("HELLO hii ").getBytes());
        fos.flush();
        FileInputStream fis = new FileInputStream("C:\\Users\\harsh\\IdeaProjects\\JA2025\\ABC.txt");
        byte[] B = new byte[(int) new File("C:\\Users\\harsh\\IdeaProjects\\JA2025\\ABC.txt").length()];
        byte[] B2 = fis.readAllBytes();
        for(byte B4 : B2)
        {
            System.out.print((char) B4);
        }
//        for(byte b1 : B)
//        {
//            System.out.print((char) b1);
//        }
//        int i = fis.read();
//        while(i!=-1)
//        {
//            System.out.print((char) i);
//            i=fis.read();
//        }
    }
}
