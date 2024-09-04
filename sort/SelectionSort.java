package sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {4, 2, 7, 2, 5, 9, 1, 0, 4};

        for(int i = 0; i < data.length - 1; i++){
            int min_index = i;
            for(int j = i + 1; j < data.length; j++){
                if(data[j] < data[min_index])
                min_index = j;
            }
            int holder = data[min_index];
            data[min_index] = data[i];
            data[i] = holder;
        }

        for(int i: data){
            System.out.println(i + " ");
        }
    }
}
