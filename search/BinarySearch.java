package search;
public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        binary_search(data, 5);
    }
    public static void binary_search(int[] array, int num){
        int start_index = 0;
        int end_index = array.length - 1;
        int middle_index;
        while(start_index <= end_index){
            middle_index = (start_index + end_index) / 2;
            if(num < array[middle_index]){
                end_index = middle_index - 1;
            } else if (num > array[middle_index]){
                start_index = middle_index + 1;
            } else{
                System.out.println("Number found at index: " + middle_index);
                return;
            }
        }
    }
}
