// Make a function that prints the nth number in the fibonacci sequence using recursion

public class prob15 {
    public static void main(String[] args) {
        System.out.println(fibonacci(10, 0, 1));
    }
    static int fibonacci(int n, int a, int b){
        if(n == 0) return a;
        return fibonacci(n - 1, b, a + b);
    }
}
