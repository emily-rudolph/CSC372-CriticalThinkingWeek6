import java.util.ArrayList; 

public class SelectionSort {
    
    public ArrayList<Student> rollnoSort(ArrayList<Student> arr) { 
        int n = arr.size();
        RollnoCompare rollComp = new RollnoCompare(); 

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (rollComp.compare(arr.get(j), arr.get(minIndex)) < 0) { 
                    minIndex = j;
                }
            }
            Student temp = arr.get(i); 
            arr.set(i, arr.get(minIndex));
            arr.set(minIndex, temp); 
        }

        return arr;
    } 

    public ArrayList<Student> nameSort(ArrayList<Student> arr) { 
        int n = arr.size();
        NameCompare nameComp = new NameCompare(); 

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nameComp.compare(arr.get(j), arr.get(minIndex)) < 0) { 
                    minIndex = j;
                }
            }
            Student temp = arr.get(i); 
            arr.set(i, arr.get(minIndex));
            arr.set(minIndex, temp); 
        }

        return arr;

   }
}



   

