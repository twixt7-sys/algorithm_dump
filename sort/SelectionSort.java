package sort;

public class SelectionSort{
    public static void main(String[] args) {
        int[] data = {15,25,26,3,48,5,985,94,7,47,8,59,5847,362,637,485};

        data = selection_sort(data);

        for(int i: data) System.out.print(i + "    ");
    }

    public static int[] selection_sort(int[] data){
        for(int i = 0; i < data.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < data.length; j++){
                if(data[min] < data[j]) min = j;
            }
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
        return data;
    }
}