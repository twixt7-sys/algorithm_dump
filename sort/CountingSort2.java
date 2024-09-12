package sort;

public class CountingSort2{
    public static void main(String[] args) {
        int[] data = {14,26,37,84,48,73,5,738,59,48};

        data = counting_sort(data);

        for(int i : data){
            System.out.print(i + "   ");
        }
    }

    public static int[] counting_sort(int[] data){
        int max_val = data[0];

        for(int num: data){
            if(num > max_val){
                max_val = num;
            }
        }

        int[] count = new int[max_val + 1];

        for(int num: data){
            count[num]++;
        }

        int index = 0;

        for(int i = 0; i <= max_val; i++){
            while(count[i] > 0){
                data[index++] = i;
                count[i]--;
            }
        }
        return data;
    }
}