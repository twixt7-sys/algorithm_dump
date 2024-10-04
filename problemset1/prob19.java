// Create a method that returns the first prime number greater than n

public class prob19 {
    public static void main(String[] args) {
        System.out.println(first_prime(100));
    }
    static int first_prime(int n){
        int i = n;
        Loop:
        while(true){
            for(int j = 2; j < i; j++){
                if(i % j == 0) break;
                if(j >= i - 1) break Loop;
            }
            i++;
        }
        return i;
    }
}