// Check if a number is prime

public class prob16 {
    public static void main(String[] args) {
        System.out.println(isPrime(41));
    }
    static boolean isPrime(int n){
        for(int i = 2; i < n -1; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
