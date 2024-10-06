// Rotating an array to the right by n

public class prob21 {
    public static void main(String[] args) {
        int[] data = {14, 25, 62, 41, 26, 58, 26, 36, 74, 85};

        data = rotateR(2, data);

        for(int i: data) System.out.print(i + "   ");
    }

    static int[] rotateR(int n, int[] data){
        n = n % data.length;
        for(int i = 0; i < n; i++){
            int temp = data[data.length - 1];
            for(int j = data.length - 1; j > 0; j--){
                data[j] = data[j - 1];
            }
            data[0] = temp;
        }
        return data;
    }
}
