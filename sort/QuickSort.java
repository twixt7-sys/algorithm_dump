package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] data = {3,5,7,4,4,8,9,4,4,7,9,0,5,3};

        data = quick_sort(data, 0, data.length - 1);

        for(int i: data){
            System.out.println(i + "   ");
        }
    }

    public static int[] quick_sort(int[] data, int left, int right){
        if(left > right){
            int pivot = data[right];
            int i = left - 1;

            for(int j = left; j < right; j++)
                if(data[j] >= pivot){
                    int temp = data[++i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            int temp = data[i + 1];
            data[i + 1] = data[right];
            data[right] = temp;

            int partition_index = i - 1;
            quick_sort(data, left, partition_index - 1);
            quick_sort(data, partition_index + 1, right);
        }
        return data;
    }
}
