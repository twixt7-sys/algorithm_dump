package sort;

public class RadixSort{
    public static void main(String[] args) {
        int[] data = {15,6,38,48,49,50,83,26,16,38,590};

        data = radix_sort(data);

        for(int i : data){
            System.out.print(i + "   ");
        }
    }

    public static int[] radix_sort(int[] data){
        int[][] radix_array = new int[10][data.length];     //4 ins:   2d, 1d, 2v
        int[] count = new int[10];
        int max_val = max(data);
        int exp = 1;

        while (max_val / exp > 0) {                         //while:  1 f.e. --> pos -->  1 n.l. --> exp
            for(int val : data){
                int radix_index = (val / exp) % 10;                     //init. ri
                radix_array[radix_index][count[radix_index]] = val;     //ra[ri][count[ri]] = v
                count[radix_index]++;                                   //count[ri]
            }
            int pos = 0;
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < count[i]; j++){
                    data[pos] = radix_array[i][j];                      // data[pos] = ra[i][j]
                    pos++;                                              // inc pos
                }
                count[i] = 0;                                           // reset count i
            }
            exp *= 10;
        }
        return data;
    }

    public static int max(int[] data){
        int max_val = data[0];
        for(int i : data){
            if(i > max_val)
                max_val = i;
        }
        return max_val;
    }
}