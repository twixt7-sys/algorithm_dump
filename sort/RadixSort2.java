package sort;

public class RadixSort2{
    public static void main(String[] args) {
        int[] data = {43, 125, 235, 26, 37, 4, 8, 896, 96, 95, 8, 377};

        data = radix_sort(data);

        for(int i: data) System.out.print(i + "   ");
    }

    public static int[] radix_sort(int[] data){
        int[][] radix_array = new int[10][data.length];
        int[] count = new int[10];
        int max = data[0], exp = 1;

        for(int i: data) if(i > max) max = i;

        while (max / exp > 0) {
            for(int i: data){
                int rad_index = (i / exp) % 10;
                radix_array[rad_index][count[rad_index]] = i;
                count[rad_index]++;
            }
            int pos = 0;
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < count[i]; j++){
                    data[pos] = radix_array[i][j];
                    pos++;
                }
                count[i] = 0;
            }
            exp *= 10;
        }
        return data;
    }
}