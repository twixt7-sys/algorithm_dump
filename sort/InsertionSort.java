package sort;

public class InsertionSort{
    public static void main(String[] args) {
        int[] data = {15,5226,73,48,58,59,96,6,9584,73,748,737,47,3};

        data = insertion_sort(data);

        for(int i : data) System.out.print( i + "   ");
    }

    public static int[] insertion_sort(int[] data){
        for(int i = 1; i < data.length; i++){
            int temp = data[i];
            int j = i - 1;
            while(j >= 0 && temp < data[j]){
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
        return data;
    }
}