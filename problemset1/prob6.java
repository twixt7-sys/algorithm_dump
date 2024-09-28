// Printing factorials

public class prob6 {
    public static void main(String[] args) {
        int fact = 1;
        for(int i = 1; i <= 10; i++){
            fact *= i;
        }
        System.out.println("The factorial of 10 is: " + fact);
    }
}
