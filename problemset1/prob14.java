// Print the first 10 fibonacci numbers without recursion

public class prob14 {
    public static void main(String[] args) {
        int a = 1, b = 1;
        System.out.println(a);
        for(int i = 0; i < 10; i++){
            System.out.println(b);
            b = a+(a=b);
        }
    }
}
