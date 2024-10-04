// Create a method that returns the first prime number greater than n

public class prob19 {
    public static void main(String[] args) {
        first_prime(72);
    }
    static int first_prime(int n){
        //prime number starting from n
        for(int i = 2; i < n; i++){
            for(int j = i; j < i + 10; j++){
                if(j % i == 0) return j;
            }
        }
        return 0;
    }
}