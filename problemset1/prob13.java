// Get the maximum of an array

public class prob13 {
    public static void main(String[] args) {
        int[] data = {14,15,26,38,61,615,72,38,62,41,48};
        int max = data[0];
        for(int i: data) if(i > max) max = i;
        System.out.println(max);
    }
}
