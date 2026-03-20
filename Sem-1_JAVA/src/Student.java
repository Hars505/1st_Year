import java.util.ArrayList;
import java.util.Comparator;
public class Student
{
    int RollNO;
    String Name;
    double Spi;
    Student(int RollNo,String Name,double Spi)
    {
        this.RollNO = RollNo;
        this.Name = Name;
        this.Spi = Spi;
    }
    public static void main(String[] args) {
        ArrayList<Student> S = new ArrayList<>();
        Student S1 = new Student(12, "Aatman", 7.50);
        Student S2 = new Student(28, "Parth", 7.28);
        Student S3 = new Student(55, "Aarav", 7.83);
        Student S4 = new Student(19, "Harshil", 7.68);
        Student S5 = new Student(25, "Anjan", 6.92);
        S.add(S1);
        S.add(S2);
        S.add(S3);
        S.add(S4);
        S.add(S5);
        S.sort(Comparator.comparing(Student::getSpi));
        System.out.println("\n Arranged according to SPI wise \n");
        for (Student student : S)
        {
            System.out.println(student);
        }
        S.sort(Comparator.comparing(Student::getRollNO));
        System.out.println("\n Arranged according to ROll no. wise \n");
        for (Student student : S)
        {
            System.out.println(student);
        }
        S.sort(Comparator.comparing(Student::getName));
        System.out.println("\n Arranged according to Name wise \n");
        for (Student student : S)
        {
            System.out.println(student);
        }
        System.out.println(S);
    }
    public String toString() {
        return "Student{" +
                "RollNO=" + RollNO +
                ", Name='" + Name + '\'' +
                ", Spi=" + Spi +
                '}';
    }
    public int getRollNO()
    {
        return RollNO;
    }
    public String getName()
    {
        return Name;
    }
    public double getSpi()
    {
        return Spi;
    }
}