
// Calculate the sum of even numbers greater than 10 and less than 30

public class prob7 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 11; i < 30; i++){
            if(i % 2 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
