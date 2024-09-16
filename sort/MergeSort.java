package sort;

import java.util.Arrays;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        // Merge
        Random r = new Random();
        
        int[] data = new int[10];
        for(int i = 0; i < data.length; i++){
            data[i] = r.nextInt(100);
            System.out.print(data[i] + "   ");
        }
        System.out.println();
        
        data = merge_sort(data);
        
        for(int i: data){
            System.out.print(i + "   ");
        }
    }

    public static int[] merge_sort(int[] data){
        if(data.length > 1){
            int mid = data.length / 2;
            int[] left = Arrays.copyOfRange(data, 0, mid);
            int[] right = Arrays.copyOfRange(data, mid, data.length);

            merge_sort(left);
            merge_sort(right);

            int i = 0, j = 0, k = 0;

            while(i < left.length && j < right.length){
                if(left[i] <= right[j]){
                    data[k] = left[i];
                    i++;
                } else {
                    data[k] = right[j];
                    j++;
                }
                k++;
            }

            while(i < left.length){
                data[k++] = left[i++];
                k++;
            }

            while(j < right.length){
                data[k] = right[j];
                j++;
                k++;
            }
        }
        return data;
    }
}