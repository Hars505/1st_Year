import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class sportsTournament
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Team> Tournamnet = new PriorityQueue<>(Comparator.comparing(Team::getwinsandloss));
        System.out.println("Enter the number of teams ");
        int Teams = scanner.nextInt();
        for(int i =0;i<Teams;i++)
        {
            System.out.println("Enter Team NAme : ");
            String TEAM = scanner.next();
            System.out.println();
            System.out.println("Enter its dat\n"+"Enter "+TEAM+"Wins : ");
            int wins = scanner.nextInt();
            System.out.println();
            System.out.println("Enter "+TEAM+" Loss : ");
            int Loss = scanner.nextInt();
            System.out.println();
            if(wins+Loss==15)
            {
                Team T = new Team(TEAM,Loss,wins);
                Tournamnet.add(T);
            }
            else
            {
                System.out.println("Enter data again Because This team is either played more or less matches than other Teams");
            }
            for(Team T : Tournamnet)
            {
                System.out.println(T.toString());
            }
            if(Tournamnet.size()<2)
            {
                System.out.println("Final can't be played by one Team");
            }
            else
            {
                String Fq1 = Tournamnet.poll().getNames();
                String Fq2 = Tournamnet.poll().getNames();
                System.out.println("Final will be played Between ");
                System.out.println(Fq1+" ...VS... "+Fq2);
            }
        }
    }
}
class Team
{
    String names;
    int wins;
    int loss;
    public Team(String names, int loss, int wins)
    {
        this.names = names;
        this.loss = loss;
        this.wins=wins;
    }
    Scanner scanner = new Scanner(System.in);
    public String getNames()
    {
        return names;
    }
    public int getWins()
    {
        return wins;
    }
    public int getLoss()
    {
        return loss;
    }
    public int getwinsandloss()
    {
        return wins - loss;
    }
    public String toString() {
        return "Team{" +
                "names='" + names + '\'' +
                ", wins=" + wins +
                ", loss=" + loss +
                '}';
    }
}
