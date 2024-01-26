import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student student1 = new Student(1, "John", "123 Street"); 
        Student student2 = new Student(15, "Eric", "145 Street"); 
        Student student3 = new Student(6, "Mike", "121 Street"); 
        Student student4 = new Student(9, "Adian", "542 Street"); 
        Student student5 = new Student(18, "Kaz", "432 Street"); 
        Student student6 = new Student(21, "Rachel", "890 Street"); 
        Student student7 = new Student(37, "Kate", "234 Street"); 
        Student student8 = new Student(90, "Violet", "091 Street"); 
        Student student9 = new Student(4, "Matt", "671 Street"); 
        Student student10 = new Student(81, "Tim", "922 Street"); 

        ArrayList<Student> studentArr = new ArrayList<Student>(); 

        studentArr.add(student1); 
        studentArr.add(student2); 
        studentArr.add(student3); 
        studentArr.add(student4); 
        studentArr.add(student5); 
        studentArr.add(student6);
        studentArr.add(student7); 
        studentArr.add(student8); 
        studentArr.add(student9); 
        studentArr.add(student10);  

        System.out.println("Unsorted List");

        for(int i = 0; i < studentArr.size(); i++) { 
            System.out.println(studentArr.get(i));
        }

        System.out.println("-------------------------------------");

        SelectionSort sort = new SelectionSort(); 

        ArrayList<Student> sortedNumList = sort.rollnoSort(studentArr); 
        System.out.println("Sorted By Number");

        for(int i = 0; i < sortedNumList.size(); i++) { 
            System.out.println(sortedNumList.get(i));
        }

        System.out.println("-------------------------------------");

        ArrayList<Student> sortedNameList = sort.nameSort(studentArr); 
        System.out.println("Sorted By Name");

        for(int i = 0; i < sortedNameList.size(); i++) { 
            System.out.println(sortedNameList.get(i));
        }

    }
}
