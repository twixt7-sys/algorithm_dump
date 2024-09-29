// print the first 100 prime numbers

public class prob18{
    public static void main(String[] args) {
        int i = 2, num = 0;
        while(num < 100){
            if(isPrime(i)){
                System.out.println(i);
                num++;
            }
            i++;
        }
    }
    static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
