package sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {3, 1, 0, 5, 6, 2, 1, 5, 10, 2};

        System.out.println("Array before sorting");
        for(int i: data){
            System.out.print(i + " ");
        }
        System.out.println();

        int holder;
        for(int i = 0; i < data.length - 1; i++){
            for(int j = 0; j < data.length - 1 - i; j++){
                if(data[j] > data[j + 1]){
                    holder = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = holder;
                }
            }
        }

        System.out.println("Array after sorting");
        for(int i: data){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
