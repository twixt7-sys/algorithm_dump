package sort;

public class CountingSort2{
    public static void main(String[] args) {
        int[] data = {51,5,36,7,4,3,3,62,63,73,484,85,7,3};

        data = counting_sort(data);

        for(int i: data){
            System.out.print(i + "   ");
        }
    }
    public static int[] counting_sort(int[] data){
        int max = data[0];

        for(int i: data)
            if(i > max)
                max = i;

        int[] count = new int[max + 1];

        for(int i: data)
            count[i]++;
        
        int index = 0;

        for(int i = 0; i <= max; i++)
            while (count[i] > 0){
                data[index++] = i;
                count[i]--;
            }

        return data;
    }
}