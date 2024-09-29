// Calculate the sum of numbers in an array

public class prob10 {
    public static void main(String[] args) {
        int[] data = {412,325,36,73,26,7,48,63,526,37,24};
        int sum = 0;
        for(int i: data) sum += i;
        System.out.println(sum);
    }
}
