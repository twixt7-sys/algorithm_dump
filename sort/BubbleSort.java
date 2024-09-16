package sort;

public class BubbleSort{
    public static void main(String[] args) {
        int[] data = {15, 73, 37, 59, -6, 14, 62, 37,95, 48, 84, 3, 14, 36, 48, 96};

        data = bubble_sort(data);

        for(int i: data) System.out.print(i + "   ");
    }

    public static int[] bubble_sort(int[] data){
        for(int i = 0; i < data.length - 1; i++){
            for(int j = 0; j < data.length - i - 1; j++){
                if(data[j + 1] < data[j]){
                    int temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }
}