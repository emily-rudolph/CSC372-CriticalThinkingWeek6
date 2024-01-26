import java.util.Comparator;

public class RollnoCompare implements Comparator<Student> {
    
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}
