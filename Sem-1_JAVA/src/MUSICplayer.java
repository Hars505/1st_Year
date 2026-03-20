/*Music player playlist: Write a program that simulates a music player playlist using an ArrayDeque.
The program should allow the user to add songs to the playlist, play the next or previous song in the playlist, and
shuffle the playlist. The program should keep track of the songs in the playlist using an ArrayDeque, where each element
in the deque represents a song. When the user adds a song, you can use the addLast method to add it to the end of the
playlist. When the user plays the next or previous song, you can use the removeFirst or removeLast method,respectively,
to remove the current song from the front or back of the deque and add it to the end or beginning of the deque. When
the user shuffles the playlist, you can use the shuffle method to randomly reorder the songs in the deque*/
import java.util.*;
public class MUSICplayer
{
    ArrayDeque<String> playlist = new ArrayDeque<>();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        MUSICplayer M1 = new MUSICplayer();
        boolean b = true;
        while(b)
        {
            System.out.println("Enter 1 : For Adding new Song");
            System.out.println("Enter 2 : For playing next Song");
            System.out.println("Enter 3 : For playing previous Song");
            System.out.println("Enter 4 : For Shuffling playlist");
            System.out.println("Enter 5 : For viewing playlist");
            System.out.println("Enter 6 : For Exiting\n");
            System.out.print("Enter choice : ");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1 : M1.addSong();break;
                case 2 : M1.playNext();break;
                case 3 : M1.previousSong();break;
                case 4 : M1.shufflePlayList();break;
                case 5 : M1.viewPlayList();break;
                case 6 : b=false; break;
                default: System.out.println("Invalid Choice");
            }
        }
    }
    void addSong()
    {
        System.out.print("Add song by entering name of song : ");
        playlist.add(scanner.next());
        System.out.println("Song added successfully");
    }
    void playNext()
    {
        if(playlist.isEmpty())
        {
            System.out.println("No song in playlist");
        }
        else
        {
            String SC = playlist.remove();
            System.out.println("Song Playing : "+SC);
            playlist.add(SC);
        }
    }
    void previousSong()
    {
        if(playlist.isEmpty())
        {
            System.out.println("No song in playlist");
        }
        else
        {
            String ps = playlist.removeLast();
            System.out.println("PLaying song : "+ps);
            playlist.addFirst(ps);
        }
    }
    void viewPlayList()
    {
        if(playlist.isEmpty())
        {
            System.out.println("No song in playlist");
        }
        else
        {
            System.out.println("Your playlist is as follow");
        }
        for(String song : playlist)
        {
            System.out.println(song);
        }
    }
    void shufflePlayList()
    {
        ArrayList<String> PLayList = new ArrayList<>(playlist);
        Collections.shuffle(PLayList);
        playlist.clear();
        playlist.addAll(PLayList);
        System.out.println("After shuffle your new playlist is as follow");
        for(String song : playlist)
        {
            System.out.println(song);
        }
    }
}