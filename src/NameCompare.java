import java.util.Comparator;

public class NameCompare implements Comparator<Student> {
    
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}