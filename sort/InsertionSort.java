package sort;

public class InsertionSort{
    public static void main(String[] args) {
        int[] data = {3, 7, 4, 6, 3, 2, 6, 6, 8, 9, 5, 7, 9, 3, 4, 6, 9};

        for(int i = 1; i < data.length; i++){
            int temp = data[i];
            int j = i - 1;
            while(j >= 0 && temp < data[j]){
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
        
        for(int i : data){
            System.out.println(i);
        }
    }
}