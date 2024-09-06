package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] data = {4,5,5,5,6,2,6,7,98,6,3,45,67,8,9,90,7,56,4,23,1,3,4};

        data = merge_sort(data);

        for(int i: data){
            System.out.println(i);
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
                if (left[i] <= right[j]){
                    data[k] = left[i];
                    i++;
                }else{
                    data[k] = right[j];
                    j++;
                }
                k++;
            }

            while(i < left.length){
                data[k] = left[i];
                i++;
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
