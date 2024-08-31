package sort;

public class Minimum {
    public static void main(String[] args) {
        int[] data = {32, 12, 32, 43, 2, 1, 7, 43, 2, 5};

        int min = 10000;
        for(int i: data)
            if(i < min)
                min = i;
        System.out.println("The minimum number is " + min);
    }
}
