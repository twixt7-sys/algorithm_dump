//  Create a function that takes two arrays as parameters and returns a new array with the elements that are only in one array(not in both)"
// approach: remove elements found in both arrays and return the list as an array
import java.util.LinkedList;

public class prob25 {
    public static void main(String[] args) {
        int[] data1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] data2 = {3, 4, 5, 6, 7, 8, 9, 10};

        int[] data = get_solo_elements(data1, data2);
    }
    static int[] get_solo_elements(int[] data1, int[] data2){
        LinkedList<Integer> list = new LinkedList<>();

        for(int i: data1) list.add(i);
        for(int i: data2) list.add(i);

        for(int i: data1){
            if(list.contains(i)) list.remove(list.indexOf(i));  
        }

        return list.toArray();
    }
}
