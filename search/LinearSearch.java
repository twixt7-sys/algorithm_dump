package search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] data = {43, 21, 0, 32, 4, 32, 54, 2, 10, 11};
        int num = 32;

        for(int i = 0; i < data.length; i++){
            if(num == data[i]){
                System.out.println("Number found at index " + i);
            }
        }
    }
}
