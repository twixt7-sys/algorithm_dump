public class prob22 {
    public static void main(String[] args) {
        int[] data = {15,62,73,38,95,95,73,62,26,26,37,84,58,97};
        data = reverse(data);
        for(int i: data) System.out.print(i + "   ");
        System.out.println();
    }

    static int[] reverse(int[] data){
        for(int i = 0, j = data.length - 1; i < (data.length - 1) / 2; i++, j--){           // Increment from first element
            int temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
        return data;
    }
}
