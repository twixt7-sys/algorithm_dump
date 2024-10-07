// Create a function that merges two arrays as a new array

public class prob24 {
    public static void main(String[] args) {
        int[] data1 = {41,52,36,748,5473,625};
        int[] data2 = {15,51,26,374,36,25,376};

        int[] data = merge(data1, data2);

        for(int i: data) System.out.print(i + "   ");
    }
    static int[] merge(int[] data1, int[] data2){
        int[] data = new int[data1.length + data2.length];
        for(int i = 0; i < data1.length; i++) data[i] = data1[i];
        for(int i = 0; i < data2.length; i++) data[i + data1.length] = data2[i];
        return data;
    }
}