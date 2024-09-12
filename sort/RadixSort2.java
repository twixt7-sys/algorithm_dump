package sort;

public class RadixSort2{
    public static void main(String[] args) {
        int[] data ={15,1352,634,634,74,74,7,36,26,36,2,6237,27};

        data = radix_sort(data);

        for(int i : data){
            System.out.print( i + "   ");
        }
    }

    public static int[] radix_sort(int[] data){
        int[][] radix_array = new int[10][data.length];
        int[] count = new int[10];
        int max = max(data);
        int exp = 1;
        
        while(max / exp > 0){
            for(int i : data){
                int radix_index = (i / exp) % 10;
                radix_array[radix_index][count[radix_index]] = i;
                count[radix_index]++;
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

    public static int max(int[] data){
        int max = data[0];
        for(int i : data){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}