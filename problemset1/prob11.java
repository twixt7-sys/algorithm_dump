// Calculate average number in an array of numbers

public class prob11 {
    public static void main(String[] args) {
        double[] data = {14,125,56,267,37,367,6345,6,34,7,1256};
        double sum = 0;
        for(double i: data) sum += i;
        System.out.println(sum / data.length);
    }
}
