// Rotating an array to the left by n

// To debug


public class prob20 {
    public static void main(String[] args) {
        int[] data = {41, 51, 37, 51, 165, 73, 72, 15, 38};

        data = rotateL(11, data);

        for(int i: data) System.out.print(i + "   ");
    }
    static int[] rotateL(int n, int[] data){
        n = n % data.length;
        for(int i = 0; i < n; i++){
            int temp = data[0];
            for(int j = 0; j < data.length - 1; j++){
                data[j] = data[j + 1];
            }
            data[data.length - 1] = temp;
        }
        return data;
    }
}
