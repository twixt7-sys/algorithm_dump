package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AllSort {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to AllSort.\n");

        int[] data = generate_random_array(r, sc);

        System.out.println("Please choose an algorithm: ");
        String[] algorithms = {"Selection ", "Bubble ", "Insertion ", "Merge ", "Quick", "Random Quick", "Counting", "Radix"};
        for(int i = 0; i < algorithms.length; i++)
            System.out.println((i+1) + ". " + algorithms[i] + "sort");

        System.out.print("\nEnter a number: ");
        data = sort(r, data, sc.nextInt());

        print_array(data);

    }
    public static int[] sort(Random r, int[] data, int type){
        return switch(type){
            case 1 -> selection_sort(data);
            case 2 -> bubble_sort(data);
            case 3 -> insertion_sort(data);
            case 4 -> merge_sort(data);
            case 5 -> quicksort(data, 0, data.length);
            case 6 -> random_quicksort(r, data, 0, data.length);
            case 7 -> counting_sort(data);
            case 8 -> radix_sort(data);
            default -> null;
        };
    }

    public static int[] generate_random_array(Random r, Scanner sc){
        System.out.print("Please enter the size of your random array: ");
        int size = sc.nextInt();
        System.out.print("Please enter the range of random numbers: ");
        int range = sc.nextInt();
        int[] data = new int[size];
        System.out.println("Array creation successful.\n");
        System.out.print("Random data array: ");
        for(int i = 0; i < data.length; i++){
            data[i] = r.nextInt(range);
            System.out.print(data[i] + "   ");
        }
        System.out.println("\n");
        return data;
    }

    public static void print_array(int[] data){
        System.out.print("Sorted array: ");
        for(int i: data)
            System.out.print(i + "   ");
        System.out.println();
    }

    public static int[] bubble_sort(int[] data){
        for(int i = 0; i < data.length - 1; i++)
            for(int j = 0; j < data.length - i - 1; j++)
                if(data[j] < data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
        return data;
    }

    public static int[] selection_sort(int[] data){
        for(int i = 0; i < data.length - 1; i++){
            int min_index = i;
            for(int j = i + 1; j < data.length; j++){
                if(data[min_index] < data[j])
                    min_index = j;
                int temp = data[min_index];
                data[min_index] = data[i];
                data[i] = temp;
            }
        }
        return data;
    }

    public static int[] insertion_sort(int[] data){
        for(int i = 1; i < data.length; i++){
            int temp = data[i];
            int j = i - 1;
            while(j >= 0 && temp < data[j]){
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
        return data;
    }

    public static int[] merge_sort(int[] data){
        if(data.length > 1){
            int mid = data.length / 2;
            int[] left = Arrays.copyOfRange(data, 0, mid);
            int[] right = Arrays.copyOfRange(data, mid, data.length);

            merge_sort(left);
            merge_sort(right);

            int i = 0, j = 0, k = 0;

            while(i < left.length && j < right.length)
                if(left[i] <= right[j])     data[k++] = left[i++]; else                        data[k++] = right[j++];

            while(i < left.length)          data[k++] = left[i++];
            while(j < right.length)         data[k++] = right[j++];
        }
        return data;
    }

    public static int[] quicksort(int[] data, int left, int right) {
        if (left < right) {
            int pivot = data[right];
            int i = left - 1;

            for (int j = left; j < right; j++)
                if (data[j] <= pivot){
                    i++;
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            int temp = data[i + 1];
            data[i + 1] = data[right];
            data[right] = temp;

            int partitionIndex = i + 1;

            quicksort(data, left, partitionIndex - 1);
            quicksort(data, partitionIndex + 1, right);
        }
        return data;
    }

    public static int[] random_quicksort(Random random, int[] data, int left, int right){
        if (left < right) {
            int pivotIndex = left + random.nextInt(right - left + 1);
            int pivot = data[pivotIndex];
            data[pivotIndex] = data[right];
            data[right] = pivot;

            int i = left - 1;
            for (int j = left; j < right; j++) {
                if (data[j] <= pivot) {
                    i++;
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
            
            int temp = data[i + 1];
            data[i + 1] = data[right];
            data[right] = temp;
            
            int partitionIndex = i + 1;
            
            random_quicksort(random, data, left, partitionIndex - 1);
            random_quicksort(random, data, partitionIndex + 1, right);
        }
        return data;
    }

    public static int[] counting_sort(int[] data){
        int max = data[0];
        for(int i : data) if(i > max) max = i;

        int[] count = new int[max + 1];
        for(int i : data) count[i]++;

        int index = 0;
        for(int i = 0; i <= max; i++)
            while(count[i] > 0){
                data[index++] = i;
                count[i]++;
            }
        return data;
    }

    public static int[] radix_sort(int[] data){
        int[][] rad_array = new int[10][data.length];
        int[] count = new int[10];
        int max = data[0], exp = 1;
        for(int i: data) if(i > max) max = i;   // rogue code xD

        while(max / exp > 0){
            for(int i: data){
                int rad_index = (i / exp) % 10;
                rad_array[rad_index][count[rad_index]] = i;
                count[rad_index]++;
            }
            int pos = 0;
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < count[i]; j++){
                    data[pos] = rad_array[i][j];
                    pos++;
                }
                count[i] = 0;
            }
            exp *= 10;
        }
        return data;
    }
}