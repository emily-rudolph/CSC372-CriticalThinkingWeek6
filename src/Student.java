public class Student {
    int rollno; 
    String name; 
    String address; 

    public Student(int rn, String n, String addr) { 
        this.rollno = rn; 
        this.name = n; 
        this.address = addr; 
    }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name + ", Address: " + address;
    }

}
